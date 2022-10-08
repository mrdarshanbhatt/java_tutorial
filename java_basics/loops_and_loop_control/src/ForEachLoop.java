

public class ForEachLoop {

	// Most use With java Collection
	// Without using Loop Counter Variables
	public static void main(String[] args) {

		String[] stringArray = { "Java", "is", "best" };

		for (String input : stringArray) {

			System.out.println(input);

		}
		
		 List<String> ls = new ArrayList<String>();
  		 ls.add("123");
    		 ls.add("456");
   		 ls.forEach(x->System.out.println(x));

	}

}
