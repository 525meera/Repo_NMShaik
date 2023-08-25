package arrayString_pkg;

public class Word_count 
{
	public static void main(String[] args) {


		String str="The ZtoH INIDA ITES PVT LTD";
		int count=1;
		int length=str.length();
		char [] ch=str.toCharArray();
		
		for(int i=0;i<length;i++)
		{
			if(ch[i]==' ')
			{
				if(!(i==0||i==ch.length-1))
				{
					count++;
				}
				if(i!=(ch.length-1))
				{
					if(ch[i+1]==' ')
					{
						count--;
					}
				}
			}
						
		}
		
		System.out.println(count);

	}
}
