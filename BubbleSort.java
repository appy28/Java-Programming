class Bubble
{
	void bubblesort(int array[])
	{
		int n = array.length;
		for(int i=0;i<n;i++)
			for(int j =0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
	}
	
	void printarray(int array[])
	{
		int n =array.length;
		for (int i=0;i<n;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}	
}
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={99,-10,100123,18,-978,5623,463,-9,287,49};
		
		Bubble ob =new Bubble();
		ob.printarray(arr);
		ob.bubblesort(arr);
		System.out.print("Sorted Array is: ");
		ob.printarray(arr);
	}

}
