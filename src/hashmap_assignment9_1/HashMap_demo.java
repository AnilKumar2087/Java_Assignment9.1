package hashmap_assignment9_1;
/*
 * This program is to demonstrate hashmap functionality
 * HashMap is a Hash table based implementation of the Map interface. 
 * This implementation provides all of the optional map operations,
 * and permits null values and the null key.
 * This takes employee id as key and employee name as value
 * */
import java.util.HashMap;
//above package needs to be imported to use hashmap 
public class HashMap_demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //add key-value pair to hashmap
        hm.put(1, "Anil");
        hm.put(2, "Sijju");
        hm.put(3,"Karthik");
        System.out.println(hm.values());
        //getting value for the given key from hashmap
        
        System.out.println("Size of the HashMap: "+hm.size());
		
	}

}
