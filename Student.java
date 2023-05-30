package sample;

import java.util.HashMap;
import java.util.Iterator;

public final class Student {

	private final String name;
	private final int ReNo;
	private final String address;
	private final int salary;
	private final HashMap<String, String> hashMap;
	
	
	public Student(String name, int ReNo, String address,int salary, HashMap<String, String> hm) {
		System.out.println("Performing Deep Copy for Object initialization");
		this.name= name;
		this.ReNo=ReNo;
		this.address=address;
		this.salary = salary;
		 HashMap<String, String> tempMap= new HashMap<String, String>();
		 String key;
		 Iterator<String> i = hm.keySet().iterator();
		 while(i.hasNext()) {
			  key = i.next();
			 tempMap.put(key, hm.get(key));
		 }
	 this.hashMap = tempMap;
	}
	 
	public String getName() {
		return name;
	}

	public int getReNo() {
		return ReNo;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	public HashMap<String, String> getHasMap(){
		return (HashMap<String, String>)hashMap.clone();
		
	}
	
	public static void main(String[] args) {

		HashMap<String, String> h= new HashMap<String, String>();
		h.put("100", "Hyderabad");
		h.put("200", "Banglore");
		h.put("300", "Channai");
		h.put("400", "Delhi");
		h.put("500", "Amaravathi");
		h.put("600", "Mumbai");
		String name= "Krishnaveni";
		int resNo=1000;
		String address = "Hyd";
		int salary = 10000;
		//modified the local data;
				h.put("500", "Kolkata");
		Student student = new Student(name,resNo,address,salary,h);
		//priting values
		System.out.println("Student name"+student.name);
		System.out.println("Student Res No:::::::::::::"+student.ReNo);
		System.out.println("Student address :::::::::::::"+student.address);
		System.out.println("Student address :::::::::::::"+student.salary);
		System.out.println("Student Res No:::::::::::::"+student.getHasMap());
		
		System.out.println("modified hashmap:::::::::::"+student.getHasMap());
		System.out.println("mutable object data:::::::::"+h.get("500"));
	}

}
