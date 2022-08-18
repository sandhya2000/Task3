package conduira.task;
import java.util.*;

public class HashSetTask2 {

	
	 public static void main(String args[]){
	  
	 HashSet <Integer> set=new HashSet<Integer>(); // creating hashSet
	 set.add(1);                 //  inserting elements
	 set.add(3);
	 set.add(4);
	 set.add(3);
	 set.add(4);
	 Iterator <Integer> itr=set.iterator();
	 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
	 }
	 

}
