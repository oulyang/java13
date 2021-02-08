package m2d81;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		
		
		  String s1=new String("123"); 
		  c.add(s1);
		   String s2=new String("456");
		  c.add(s2);
		  
		  System.out.println(c.size()); 
		  String s3=new String("123");
		  System.out.println(c.contains(s3));
		
		
	}

}


