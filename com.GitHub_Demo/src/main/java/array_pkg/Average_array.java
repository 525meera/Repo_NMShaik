package array_pkg;

public class Average_array 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4};
		int sum = 0;
		int length=arr.length;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			//System.out.println(sum);
		}
		System.out.println("sum value ="+sum);
		double average=sum/length;
		System.out.println("Average Value is = "+average);

	}

}

