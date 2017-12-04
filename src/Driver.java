
import animals.Puppy;
import utils.ArrayUtils;

import utils.Math;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Puppy Joey= new Puppy();		
		Puppy Chandler= new Puppy();
		Puppy Ross= new Puppy();

		
		
		String Name1=Joey.getName();		
		String Name2=Chandler.getName();
		String Namee=Ross.getName();

		
		System.out.print(Name1);
		
	int[] myarrayn={9,20,3,44,88,300};
	
	
	
	
	int[] reversArray=	ArrayUtils.revers(myarrayn);
	
	
	String addComment=ArrayUtils.stringifyArray(reversArray);
	
	System.out.print(addComment);

	
		
		int fac=Math.factoriel((int)15.4);
		System.out.print(fac);

		
		
	}

}


