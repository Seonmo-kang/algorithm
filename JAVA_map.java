//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> m = new HashMap<String, Integer>();    
                                                                    // Create Map Interface
                                                                    // Map < dataType, dataType > map = new HashMap<dataType, dataType>
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            m.put(name,phone);          // .put(key,value) : Put the data in hashmap
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(m.get(s)==null){
                System.out.println("Not found");
            }else{
                System.out.println(s+"="+m.get(s));    // .get(key) : return value of parameter {key}
            }
            
            
		}
	}
}



