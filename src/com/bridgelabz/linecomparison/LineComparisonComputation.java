package com.bridgelabz.linecomparison;

public class LineComparisonComputation {
	
	public static int x1=10,x2=20,y1=20,y2=20;
	public static int x3=10,x4=20,y3=20,y4=20;
	
	public void calculateLength() {
		Double Length1 = Math.sqrt((x2-x1)^2 +(y2-y1)^2);
		System.out.println("Length 1 = " +Length1);  //UC1

		Double Length2 = Math.sqrt((x4-x3)^2 +(y4-y3)^2);
		System.out.println("Length 2 = " +Length2);  //UC1
		
		if (Length1.equals(Length2))
		{
			System.out.println("Length of both Lines are Equal");  //UC2
		}
		else
		{
			System.out.println("Length of both Lines are Not Equal");  //UC2
		}
		
		if(Double.compare(Length1, Length2)==0)
		{
			System.out.println("Length 1 = Length 2");  //UC3
		}else if(Double.compare(Length1, Length2)<0)
		{
			System.out.println("Length 1 < Length 2");  //UC3
		}else
		{
			System.out.println("Length 1 > Length 2");  //UC3
		}
		
	}
	

	public static void main(String[] args)
	{	
		System.out.println("Welcome to Line Comparison Computation Program ");
		System.out.println();
		LineComparisonComputation UC4 = new LineComparisonComputation();
		UC4.calculateLength();
		System.out.println();
	
	}

}
