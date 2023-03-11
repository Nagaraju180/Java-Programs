package com.ynr.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IceCream {
	
	String ic;
		
	public IceCream(String ic) {
		this.ic = ic;
	}



	public static void main(String[] args) {
		
		
		IceCream ic1=new IceCream("vennila");
		IceCream ic2=new IceCream("strowberry");
		IceCream ic3=new IceCream("chocolate");
		IceCream ic4=new IceCream("dfgrty");
		IceCream ic5=new IceCream("hjikj");
		
       ArrayList al=new ArrayList();
       
       al.add(ic1);
       al.add(ic2);
       al.add(ic3);
       al.add(ic4);
       al.add(ic5);
       
       Iterator it=al.iterator();
       
       while(it.hasNext()) {
    	   IceCream i=(IceCream)it.next();
    	   System.out.println(i.ic);
       }
	}

}
