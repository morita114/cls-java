import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("BinaryCopy.png");
             FileOutputStream out = new FileOutputStream("BinaryCopy_copy.png")) {
            
            // int buff;
            // while ((buff = in.read()) != -1) { out1.write(buff);}
            
            byte[] buff = new byte[1024];
            int len;
            while ((len = in.read(buff)) != -1) { out.write(buff, 0, len); }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

