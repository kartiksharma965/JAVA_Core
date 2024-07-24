package CH_26_String;
// Array sorting in ascending order
public class Example_12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = { 9,8,7,6,5,4,3,2,1};
		int temp =0;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}}}
		 System.out.println("*** display sorted ascending order records in array ***");
		 for(int i=0;i<a.length;i++) {
			System.out.println(a[i]); 
		 }

	}

}
