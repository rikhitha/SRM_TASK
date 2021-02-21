package day1.com.java.code;
class vowel_check
{
	public void check_vowel(String s)
	{
		String string1=s;
		String lowerstring=string1.toLowerCase();
        char[] ch=lowerstring.toCharArray();
        int checkvowel=0;
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
        	{
        		checkvowel++;
        	}
        	
        	}
        System.out.println("No of vowels present in string: "+checkvowel);
        }
	
		
	
}

public class Vowel 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String str1="Java full stack development";
        vowel_check object=new vowel_check();
        object.check_vowel(str1);
	}
        

}
