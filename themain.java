import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
	
		int[] array = {5, 2, 3, 4, 6};
		int p = 2;
		long time = 0;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Lines: ");
		for(int i = 0; i < array.length; i++)
		{
			arr.add(array[i]);
		}
		
		System.out.println(arr);
		System.out.println();
		
		System.out.println("Value to track at index " + p + " = "  + arr.get(p));		
		System.out.println("-------------------");
	
		int j = 0;

		while(arr.get(p) != 0)
		{
			if(arr.get(p) == 0)
			{
				break;
			}
			
			if(j != p)
			{
				int theval = arr.get(j) - 1;
				arr.remove(j);
				arr.add(theval);
				p = p - 1;
				time++;
				
				System.out.println("Value to track at index " + p + " = " + arr.get(p));
			}
			else
			{
				int theval = arr.get(j) - 1;
				arr.remove(j);
				arr.add(theval);
				p = array.length - 1;
				time++;
				System.out.println("Value to track at index " + p + " = " + arr.get(p));
			}
			
			System.out.println(arr);
			System.out.println("-------------------");
			System.out.println();
		}
	
		System.out.println("Time it takes " + time);
		
	}

}
