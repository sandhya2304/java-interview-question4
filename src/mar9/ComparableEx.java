package mar9;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student st) {
		if(age == st.age)
		  return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
		
	}
}

public class ComparableEx
{
	public static void main(String[] args)
	{
	     
		ArrayList<Student> al =new ArrayList<>();
		al.add(new Student(12,"rama"));
		al.add(new Student(1,"ma"));
		al.add(new Student(5,"a"));
		
		Collections.sort(al);
		for(Student s : al){
			System.out.println(s.age +" : "+s.name);
		}
		
		
	}
}
