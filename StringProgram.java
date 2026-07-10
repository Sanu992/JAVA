package string_day5;

class StringProgram {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2=new String("Hello");
		for(int i=0;i<=s.length()-1;i++) 
		{
			char c=s.charAt(i);
			System.out.println(c);
		}
		System.out.println(s==s1);
		System.out.println(s2==s);
	}

}
