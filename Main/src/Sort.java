
public class Sort {

	// heap sort
	public static void heapSort(int[] arr) {
		if (arr.length == 0) {
			return;
		}

		int length = arr.length;

		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(arr, length, i);
		}

		for (int i = length - 1; i >= 0; i--) {
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			heapify(arr, i, 0);
		}

	}

	public static void heapify(int[] array, int length, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;
		if (left < length && array[left] > array[largest]) {
			largest = left;
		}
		if (right < length && array[right] > array[largest]) {
			largest = right;
		}
		if (largest != i) {
			int tmp = array[i];
			array[i] = array[largest];
			array[largest] = tmp;
			heapify(array, length, largest);
		}
	}

	// intro sort
	
	
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[low];
		int i=(high+1);
		for(int j=high;j>=0;j--) {
			if(arr[j]>pivot) {
			i--;
			swap(arr,i,j);
			}
		}
		swap(arr,i-1,low);
		return i-1;
	}
	
	public static void sort(int arr[],int low,int high,int depth) {
		if(depth == 0) {
			heapSort(arr);
			return;
		}
	if(low<high) {
		int p = partition(arr,low,high);
		sort(arr,low,p-1,depth-1);
		sort(arr,p+1,high,depth-1);
	}
	}
	
	public static void introSort(int arr[]) {
		int depth = maxDepthCalculator(arr);
		sort(arr,0,arr.length-1,depth);
	}
	
	
	public static int maxDepthCalculator(int arr[]) {
		return (int) ((Math.log(arr.length)/Math.log(2))*2);
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
	

	// shell sort
	public static void shellSort(int arr[]) {
		int n = arr.length;
		
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
				{
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
		}
	}

}
