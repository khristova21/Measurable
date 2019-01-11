import java.util.ArrayList;
public class MainThing 
{

	public static void main(String[] args)
	{
		ArrayList<Measurable> myList = new ArrayList<Measurable>();
		for(int i=0; i<15; i++) 
		{
			myList.add(new Country (Math.random() * 200000000  + 10000000));
		}

		System.out.println("average population: " + findAverage(myList));
		
	}
	
	private static double findAverage(ArrayList<Measurable> list)
	{
		double total =  0;
		int count = 0;
		for(Measurable obj: list)
		{
			total+=obj.getMeasure();
			count++;
			
		}
		return total/count;
	}
}
