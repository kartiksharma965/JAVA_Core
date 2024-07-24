package CH_26_String;

import java.util.Arrays;

public class Example_12f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] [] = { {2,3,4} ,{4,5,6}  , {7,8,99}, {1,4,8}, {2,4,6}, {12,16,19} };
		
		int minimum = a[0] [0];
		int maximum = a[0] [0];
		
		for(int i =0 ; i<a.length ;i++)
		{
			for (int j =0; j<a[0].length;j++)
			{
				if(a[i][j]>maximum)
				{
					maximum = a[i] [j];
				} else if(a[i][j]<minimum) {
					minimum= a[i] [j];
				}}}
			System.out.println("Minimum number := "+minimum);
			System.out.println("Maximum number := "+maximum);
	}}
