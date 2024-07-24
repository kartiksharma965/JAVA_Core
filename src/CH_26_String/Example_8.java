package CH_26_String;
// Remove Junk
public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "!@!$!%%R% 23@#%%^^^Hello!$!$!@$$!^*world";
		
		s=s.replaceAll("[^a-z,A-Z,0-9]", "");
		System.out.println(s);
		
		String s1 ="Sharee !$@$!@%%@!@%!@!%#%$^@^ Sam @!%!%%!%!%@!@%";
		s1=s1.replaceAll("[^a-z,A-Z,0-9]", "");
		System.out.println(s1);
		

	}

}
