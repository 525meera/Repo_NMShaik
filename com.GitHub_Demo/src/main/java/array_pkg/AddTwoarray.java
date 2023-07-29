package array_pkg;

public class AddTwoarray 
{
	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int arr1[]= {10,2,3};
		int length=arr.length;
		int add[]=new int[length];
		
		for(int i=0;i<length;i++) {
			add[i]=arr[i]+arr1[i];
			System.out.print(add[i]+" ");
			
		}
	}
}
