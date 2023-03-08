package com.ynr.Strings;

public class CountRepetedChar {

	public static void main(String[] args) {
		
		String s="helloh";
		String s2=" ";
		for(int i=0;i<s.length();i++) {
			int count=1;
			char ch=s.charAt(i);												
			if(s2.indexOf(ch)==-1)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
				System.out.println(ch +"="+ count);	
				s2=s2+ch;
			}

		}
	}		
}
