package utils;

public class Math {
public static int factoriel (int number)

{
	int result=1;
	
	for(int i=1 ;i<=number ;i++) {
		result=result*i;
	}
return result;
}


static int resultRec=1;

public static int factorielRec(int number)
{
	if(number > 1)
	{
		resultRec = resultRec * number ;
		number = number - 1;
		factorielRec(number);
	
	}
	return  resultRec;

}

}
