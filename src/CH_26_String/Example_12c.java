package CH_26_String;
// Array sorting in descending order.
public class Example_12c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int temp =0;
		
		for(int i = 0 ; i<a.length;i++)
		{
			for (int j = i+1 ; j<a.length;j++)
			{
				if (a[i]<a[j]) {
					temp =a[i];
					a[i]= a[j];
					a[j] =temp;
				}}}
       System.out.println("*** display sorted descending order record in array ***");
       
       for(int i = 0 ; i <a.length; i++) {
    	   System.out.println(a[i]);
       }
	}

}
