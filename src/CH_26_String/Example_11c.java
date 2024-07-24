package CH_26_String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example_11c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name = {"Java", "Ruby" ,"C#" , "Java" , "C#" , "Python", "c", "cobol","mainframe", "mainframe"};
		
		System.out.println("*** Using for loop ***");
		// Compare each element :O(n*n).  Worst solution
		
		for ( int i = 0; i<name.length;i++) 
		{
			for (int j = i+1; j<name.length;j++)
			{
				if(name[i].equals(name[j])) 
				{
					System.out.println("duplicate element :-"+name[i]);
				}
			}
			
		}
		
		System.out.println("*** End of for loop ***");
		
		System.out.println("*** Using LinkedHashSet ***");
		
		Set<String> lhs = new LinkedHashSet<String>();
		
		for(String a : name){
			{
				if(lhs.add(a)==false)  
				{
					System.out.println("duplicate element :-"+a);
				}
			}
		}
		
		System.out.println("*** End of LinkedHashSet  ***");
		
		System.out.println("*** Using of HashSet ***");
		
		Set<String> hs=new HashSet<String>();
		
		for(String a:name) 
		{
			if(hs.add(a)== false)
			{
				System.out.println("duplicate element :- "+a);
			}
		}
       System.out.println("*** End of HashSet ***");
	}

}
