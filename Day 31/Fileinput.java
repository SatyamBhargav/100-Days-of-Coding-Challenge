import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
public class Fileinput
{
	public static void main(String agrs[])
	{
		try{
			FileInputStream fln=new FileInputStream("D://3. Java Class//Java practical//Java_practical//java I-O//text.txt");
			int i=0;
			String s="";
            JOptionPane.showMessageDialog(null,"Satyam Bhargav");
			System.out.println("Number of remaining bytes:"+fln.available());
			//fln.skip(7);
			System.out.println("File Contents:");
			while((i=fln.read())!=-1){	
				s=s+""+(char)i;
			}
            System.out.println(s);
			fln.close();
			FileOutputStream fln2=new FileOutputStream("D://3. Java Class//Java practical//Java_practical//java I-O//new.txt",true);
			char ch[] = s.toCharArray();
		        for (i = 0; i < s.length(); i++) {
            		fln2.write(ch[i]);
        		}
			if(i==s.length())
				System.out.println("Successful writing");
			
            FileInputStream fln3=new FileInputStream("D://3. Java Class//Java practical//Java_practical//java I-O//text.txt");
            int k=0;
			System.out.println("Number of remaining bytes:"+fln3.available());
			//fln.skip(7);
			System.out.println("File Contents:");
			while((k=fln3.read())!=-1){	
				System.out.println((char)k);
			}
        
			fln3.close();
        }
			catch(Exception e)
			{	System.out.println(e); }
			
	}
}