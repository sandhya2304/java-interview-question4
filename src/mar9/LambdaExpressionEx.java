package mar9;


@FunctionalInterface
interface Drawable{
	
	public void draw();
	
}


public class LambdaExpressionEx {

	public static void main(String[] args)
	{
		int width = 12;
		
		Drawable d2 = ()->{
			System.out.println("draw ..."+width);
		};
		
		d2.draw();

	}

}
