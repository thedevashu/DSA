package studenthash;
// Problem Statement : Create Student object with below member variables and provide helping function into Students class
//- age
//- name
//- mobile_no
//- emailid
//
//Apply hashing on above Students object to place them in array size 10.
//Make use of student's mobile_no for calculating hashcode (key)
//Make use of linear probing for collisions
//Print number of times collision happened while placing 10 students in array.
public class Student {
	private int age;
	private String name;
	private double mob_no;
	private String eId;
	
	public Student(int age,String name,double mob,String eId) {
		this.setAge(age);
		this.setName(name);
		this.setMob_no(mob);
		this.seteId(eId);
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMob_no() {
		return mob_no;
	}

	public void setMob_no(double mob_no) {
		this.mob_no = mob_no;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	
	
	public String toString() {
		String str="";
		str+="Student's Age: "+ age+" ,Name: "+ name+" ,Mobile:"+mob_no+" ,Email:"+eId;
		return str;
	}
}
