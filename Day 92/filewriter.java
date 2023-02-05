package input;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        char c[] = {'k', 'l', 'k'};
        String source = "Now is the time from all godd man to cme to the aid of their country and pay their due taxes";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        FileWriter f0 = new FileWriter("D:\\3. Java Class\\Java practical\\Java_practical\\java I-O\\input1.txt");
        for (int i = 0; i < buffer.length; i+=2) {
            f0.write(buffer[i]);
        }
        f0.close();
        FileWriter f1 = new FileWriter("D:\\3. Java Class\\Java practical\\Java_practical\\java I-O\\input2.txt");
        f1.write(buffer);
        f1.close();
        FileWriter f2 = new FileWriter("D:\\3. Java Class\\Java practical\\Java_practical\\java I-O\\input3.txt");
        f1.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
        f2.close();
    }
}
