package studenthash;

public class Main {

	public static void main(String[] args) {
		Student s1 =new Student(12,"as",12345,"asdag.com");
		Student s2 =new Student(14,"bas",12343,"asdag.com");
		Student s3 =new Student(145,"atys",123467,"daergd.com");
		Student s4 =new Student(52,"efras",123478,"gbdsdag.com");
		Student s5 =new Student(534,"qwfras",123476,"gbdsdag.com");
		Student s6 =new Student(45,"qwfras",1234735,"gbdsdag.com");
		Student s7 =new Student(23,"aefras",1234756,"gbdsdag.com");
		Student s8 =new Student(23,"dffras",123489,"gbdsdag.com");
		Student s9 =new Student(45,"fxdras",123487,"gbdsdag.com");
		Student s10 =new Student(52,"fras",123465,"gbdsdag.com");
		
		StudentHash sh =new StudentHash(10);
		sh.insertStd(s1);
		sh.insertStd(s2);
		sh.insertStd(s3);
		sh.insertStd(s4);
		sh.insertStd(s5);
		sh.insertStd(s6);
		sh.insertStd(s7);
		sh.insertStd(s8);
		sh.insertStd(s9);
		sh.insertStd(s10);
		System.out.println("Collision cooured for "+ sh.count);
		System.out.println(sh);
		 
		sh.search(s1);
		sh.search(s2);
		sh.search(s4);
	}

}
