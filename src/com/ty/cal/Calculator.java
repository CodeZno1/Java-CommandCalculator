package com.ty.cal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数");
		BigDecimal i1 = new BigDecimal(scan.nextInt());
		
		System.out.println("请输入运算符");
		String opt = scan.next();
		
		System.out.println("请输入第二个数");
		BigDecimal i2 = new BigDecimal(scan.nextInt());
		
		BigDecimal result = Cal(i1,i2,opt);
		System.out.print(i1 + " " + opt + " " + i2 + " = " + result );
		
	}
	
	public static BigDecimal Cal(BigDecimal i1, BigDecimal i2, String opt)
	{
		BigDecimal result = new BigDecimal("0");
		switch (opt)
		{
			case "+":
			{
				result = i1.add(i2);
				break;
			}
			case "-":
			{
				result = i1.subtract(i2);
				break;
			}
			case "*":		
			{
				result = i1.multiply(i2);
				break;
			}
			case "/":
			{
				if (i2.equals(0))
				{
					System.out.println("除数不能为0");
					result = null;
					break;
				}
				
				result = i1.divide(i2);
				break;
			}
			case "%":
			{
				result = i1.divideAndRemainder(i2)[1];
				break;
			}
		}
		
		return result;
	}
	

}
