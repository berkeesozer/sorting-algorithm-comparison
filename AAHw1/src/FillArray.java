
public class FillArray {

	//increasing numbers
	public static int[] fillArrayIN(int size) {
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) 
		{
			arr[i] = i+1;
		}
		return arr;
	}
	//decreasing numbers
	public static int[] fillArrayDN(int size) 
	{	
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) 
		{
			arr[i] = size - i;
		}
		return arr;
	}
	//random numbers
	public static int[] fillArrayRN(int size) {

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) 
		{
			int randomNumber = (int) (Math.random() * size); 
			arr[i] = randomNumber;
		}
		return arr;
	}
	
	//equal numbers
	public static int[] fillArrayEN(int size) {

		int arr[] = new int[size];
		int selectedNumber = (int) (Math.random() * size);  
		for (int i = 0; i < size; i++) 
		{
			arr[i] = selectedNumber;
		}
		return arr;
	}
}
