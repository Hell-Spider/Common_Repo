package com.lti;

public class Sieve 
{
	public static void main(String[] args) 
	{
		boolean[] p = new boolean[30];
		for(int i=0;i<30;i++)
		{
			p[i] = true;
		}
		
		for(int i=2;i*i<=30;i++)
		{
			if(p[i])
			{
				for(int j=i*2;j<30;j+=i)
				{
					p[j] = false;
				}
			}
		}
		
		for(int i=2;i<30;i++)
		{
			if(p[i])
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
