import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		//EDIT HERE TO CHANGE MODS/SIZE
		
		int arrSize = 10000; // choose array size (1k-10k-100k)
		int arrType = 1; // choose array type (equal=0,random=1,increasing=2,decreasing=3)
		
		
		int[]arr=new int[arrSize];
		int[]arr2=new int[arrSize];
		int[]arr3=new int[arrSize];
		
		if (arrType==0) //equal numbers
		{
		arr = FillArray.fillArrayEN(arrSize); arr2 = FillArray.fillArrayEN(arrSize); arr3 = FillArray.fillArrayEN(arrSize);
		System.out.println("Selected array filling type: Equal Numbers");
		}
		else if (arrType==1) //random numbers
		{
		arr = FillArray.fillArrayRN(arrSize); arr2 = FillArray.fillArrayRN(arrSize); arr3 = FillArray.fillArrayRN(arrSize);
		System.out.println("Selected array filling type: Random Numbers");
		}
		else if (arrType==2) //increasing numbers
		{
		arr = FillArray.fillArrayIN(arrSize); arr2 = FillArray.fillArrayIN(arrSize); arr3 = FillArray.fillArrayIN(arrSize);
		System.out.println("Selected array filling type: Increasing Numbers");
		}
		else if (arrType==3) //decreasing numbers
		{
		arr = FillArray.fillArrayDN(arrSize); arr2 = FillArray.fillArrayDN(arrSize); arr3 = FillArray.fillArrayDN(arrSize);
		System.out.println("Selected array filling type: Decreasing Numbers");
		}
		
	
		System.out.println("Selected size: " + arrSize);
		

		//heap sort	
		
		double startTime = System.nanoTime();	
		Sort.heapSort(arr);
		double runTime = (System.nanoTime() - startTime) / 1000000d; //converting to ms from nano to show more digits
		System.out.println("Heap sort: " + runTime + " ms");
		
		
		//intro sort	
		
		double startTime2 = System.nanoTime();
		Sort.introSort(arr2);
		double runTime2 = (System.nanoTime() - startTime2) / 1000000d; //converting to ms from nano to show more digits
		System.out.println("Intro sort: " + runTime2 + " ms");
		
		
		//shell sort
		
		double startTime3 = System.nanoTime();
		Sort.shellSort(arr3);
		double runTime3 = (System.nanoTime() - startTime3) / 1000000d; //converting to ms from nano to show more digits
		System.out.println("Shell sort: " + runTime3 + " ms");

	}

}
