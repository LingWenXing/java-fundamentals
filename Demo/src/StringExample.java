
public class StringExample {

	public static void main(String[] args) {
		//String Example
		String s1 = "Sachin Tendulkar";
		String s2 = "RAMU";
		s1.concat(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.charAt(8));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String r1 = new String("RAMU");
		String r2 = new String("RAMU");
		System.out.println(r1.equals(r2));
		System.out.println(r1==r2);
		
		StringBuffer statement = new StringBuffer();
		statement.append("Sachin");
		System.out.println(statement.capacity());
		System.out.println(statement);
		System.out.println(statement.reverse());
		statement.append(" is a great batsman");
		System.out.println(statement.capacity());
		System.out.println(statement);
		
		String str1 = "Sachin";
		String rev = "";
		for(int i=str1.length()-1; i>=0; i--) {
			rev+=str1.charAt(i);
		}
		System.out.println(str1);
		System.out.println(rev);
		
	}

}
