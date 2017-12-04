package utils;

public class ArrayUtils {

	
public	static int[] revers (int[] validData)
	{
		
		for(int i = 0; i < validData.length; i++)
		{
		    int temp = validData[i];
		    validData[i] = validData[validData.length - i - 1];
		    validData[validData.length - i - 1] = temp;
		}
		
		return validData;
		
		
	}
	

	
public	static String stringifyArray (int[] sampleString)
	{
		
		String result="";
		for(int temp:sampleString) {
			
		result =temp+ ", "+result;	
			
		}
	    
		return result;
		
		
	}
}
