package trainingAssigment_SDET;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(101);  
        set.add(126);  
        set.add(-12);  
        set.add(150);  
        System.out.println("Lowest Value: "+set.pollFirst());  
        System.out.println("Highest Value: "+set.pollLast());  

	}

}
