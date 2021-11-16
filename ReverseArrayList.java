package trainingAssigment_SDET;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();  
        l.add("Black");  
        l.add("Blue");  
        l.add("Brown");  
        l.add("Burgandy");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  

	}

}
