import java.awt.event.WindowStateListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class DataConversionMap {

	String CSVPath;
	List<String> filenames = new LinkedList<String>();

	public List<String> listFilesForFolder(final File folder) {
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				if (fileEntry.getName().contains(".csv"))
					filenames.add(fileEntry.getAbsolutePath());
			}
		}
		return filenames;
	}

	public static void main(String[] args) {
		try {
			String path = "C:\\Users\\mr.DJ\\Desktop\\test";
			DataConversionMap map = new DataConversionMap();
			ForkJoinPool pool = new ForkJoinPool();
			System.out.println(map.listFilesForFolder(new File(path)));
			for (String oneFile : map.listFilesForFolder(new File(path))) {
				FileProcessor fileProcessor = new FileProcessor(oneFile);
				// pool.execute(fileProcessor);
				pool.invoke(fileProcessor);
				// pool.submit(fileProcessor);
			}
			System.out.printf("******************************************\n");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
			System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
			System.out.printf("******************************************\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class FileProcessor extends RecursiveTask<List<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String path;

	List<Map<String, String>> result;

	List<FileProcessor> fileProcessors = new LinkedList<FileProcessor>();

	public FileProcessor(final String path) {
		this.path = path;

	}

	public FileProcessor(List<Map<String, String>> result) {
		String js = jsonParse(result);
	}

	private List<Map<String, String>> readCSV(final String path) {
		List<Map<String, String>> result = null;
		// Read data

		try (Stream<String> stream = Files.lines(Paths.get(path))) {
			String[] headers = headers(path);
			result = stream.skip(1) // skip. headers
					.map(line -> line.split(",")).map(data -> {
						Map<String, String> map = new LinkedHashMap<>();
						for (int i = 0; i < data.length; i++) {
							if (!headers[i].isEmpty() && headers[i] != null && !data[i].isEmpty() && data[i] != null) {
								map.put(headers[i].trim(), data[i].trim());
							}
						}
						return map;
					}).collect(Collectors.toList());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String[] headers(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			System.err.println("Header : " + br.readLine().split(",")[0]);
			return br.readLine().split(",");
		}
	}

	// Use for Parsing
	public String jsonParse(List<Map<String, String>> result) {
		String js = "";
		for (Map<String, String> csvData : result) {
			js = new Gson().toJson(csvData);
		}

		System.out.println(js);
		return js;
	}

	@Override
	protected List<String> compute() {

		List<Map<String, String>> result = readCSV(path);
		FileProcessor innerTask = new FileProcessor(result);
		innerTask.fork();
		// fileProcessors.add(innerTask);
		System.out.println("Complated");

		return null;
	}

}
