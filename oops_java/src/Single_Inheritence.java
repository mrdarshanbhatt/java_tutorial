

import java.util.Scanner;

class Super {

	Scanner input = new Scanner(System.in);

	int id;

	public void enterData() {

		System.out.println("Enter the ID ");
		id = input.nextInt();

	}

}

class sub extends Super {

	public String detail;

	public void getDetail() {

		System.out.println("Enter the User Detail like name etc");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		detail = input.next();
	}

	public void showDetail() {

		System.out.println("All detail is below");

		System.out.println("Id : " + id);

		System.out.println("Detail :  " + detail);
	}
}

public class Single_Inheritence {

	public static void main(String args[]) {

		sub sub = new sub();

		sub.enterData();

		sub.getDetail();

		sub.showDetail();
	}
}
