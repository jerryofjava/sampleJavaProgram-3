import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n=Integer.parseInt(input.readLine());
		String[] array=new String[n];
		
		for(int i=0;i<=n-1;i++)
		{
			array[i]=input.readLine();
		}
		
		for(int i=0;i<=n-1;i++)
		{
			System.out.println(toBinary(i,array));
		}
	}
	
	public static String toBinary(int i, String[] array)
	{
		Integer hexa=Integer.parseInt(array[i].toUpperCase(), 16);
		String binary=Integer.toBinaryString(hexa);
		return binary;
	}
}
