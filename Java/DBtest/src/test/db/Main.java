package test.db;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SampleDao dao = new SampleDao();
		dao.getAll();


		System.out.println("name&age");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();

//		user.setName(name);
//		user.setAge(age);

		NewSampleDao newdao = new NewSampleDao();
		List<User> user = newdao.getAll(name,age);
		System.out.println(user.get(0).getName());
		System.out.println(user.get(0).getAge());
	}

}
