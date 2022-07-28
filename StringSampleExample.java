import java.util.StringTokenizer;
class StringSampleExample
{
	public static void main(String[] arges)
	{
		StringTokenizer st = new StringTokenizer("Hello!How are you?"," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println("_______________________");
		String str = "HelloWorld";
		System.out.println("LowerCase Method:"+str.toLowerCase());
		System.out.println("UpperCase Method:"+str.toUpperCase());
		System.out.println("contains Method:"+str.contains("low"));
		System.out.println("indexOf Method:"+str.indexOf('W'));
		System.out.println("CharAt Method:"+str.charAt(4));
	}
}