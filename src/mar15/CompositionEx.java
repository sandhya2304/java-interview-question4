package mar15;

import java.util.ArrayList;
import java.util.List;

class College{
	String name;
	String address;
	public College(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}


class Univesity{
	
	List<College> colleges;

	public Univesity(List<College> colleges) {
		super();
		this.colleges = colleges;
	}
	
	List<College> getTotalCollege(){
		return colleges;
	}
	
}


public class CompositionEx
{
	public static void main(String[] args)
	{
		
		College c1= new College("abc college", "DElhi");
		College c2= new College("mnc college", "Meerut");
		
		List<College> colleges= new ArrayList<>();
		colleges.add(c1);
		colleges.add(c2);
		
		Univesity uni = new Univesity(colleges);
		List<College> cc = uni.getTotalCollege();
		
		for(College ca : cc)
		{
			System.out.println(ca.name+ " : "+ca.address );
		}
		
	}

}
