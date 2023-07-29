package array_pkg;

public class Disacending_pro 
{
	public static void main(String[] args) {
		int a[]	= {2,1,3,5,4};
		int temp=0;
		System.out.println("Before Disacending Oder");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("After Disascending Oder");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<=a[j])
				{
					temp=a[i];
					//System.out.print(temp);
					a[i]=a[j];
					//System.out.print(a[i]);
					a[j]=temp;					
					//System.out.print(a[j]);
				//	System.out.println(temp);
				}
				//System.out.print(a[i]);
			}
			//System.out.print(temp);
			System.out.print(a[i]);
		}
	}
}
