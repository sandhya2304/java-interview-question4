package mar14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}


public class Java8ExStream 
{

	public static void main(String[] args)
	{
	    List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"soap",1700));
		products.add(new Product(2,"utensils",100));
		products.add(new Product(3,"handwash",10000));
		
		List<Integer> pPrice = products.stream()
				               .filter(p-> p.price < 500)
				               .map(p -> p.price)
				               .collect(Collectors.toList());
		products.forEach(System.out::println);
		pPrice.forEach(System.out::println);
		  
	}

}
