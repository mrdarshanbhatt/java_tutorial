package multi_threading;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;

class CSVOps4 implements Runnable {
	final String path;

	public CSVOps4(final String path) {
		this.path = path;
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
							} else {
								// error Log
							}
						}
						// System.out.println(map);
						return map;
					}).collect(Collectors.toList());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Map<String, String>>();
	}

	private String[] headers(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine().split(",");
		}
	}

	// Thread of Read CSV
	@SuppressWarnings("unchecked")
	public void run() {
		List<Map<String, String>> listMap = readCSV(path);
		// Read Success Log​
		// System.out.println("Parsing Thread : " + Thread.currentThread().getName());
		ExecutorService service = (ExecutorService) Executors.newFixedThreadPool(10);
		JsonParsing jsonParsing = new JsonParsing(listMap);
		service.execute(jsonParsing);
		/*
		 * Thread readThread = new Thread(jsonParsing); readThread.start();
		 * readThread.setName("Parsing");
		 */
	}
}

class JsonParsing implements Runnable {
	private List<Map<String, String>> result;

	public JsonParsing(List<Map<String, String>> result) {
		this.result = result;
	}

	public void jsonParse() {
		for (Map<String, String> csvData : result) {
			String js = new Gson().toJson(csvData);
			// System.out.println("DataIn Json : " + js);
		}
		System.err.println(ZonedDateTime.now());
	}

	@Override
	public void run() {
		jsonParse();
		System.out.println("Parsing Thread : " + Thread.currentThread().getName());
	}
}

public class ExecutorService111 {

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

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		String path = "C:\\Users\\mr.DJ\\Desktop\\test";
		ExecutorService111 fileList = new ExecutorService111();
		// Runtime.getRuntime().availableProcessors()
		ExecutorService service = (ExecutorService) Executors.newFixedThreadPool(10);
		System.err.println(ZonedDateTime.now());
		for (String oneFile : fileList.listFilesForFolder(new File(path))) {
			CSVOps4 ops2 = new CSVOps4(oneFile);
			service.execute(ops2);
		}
	}

}
