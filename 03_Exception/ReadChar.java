import java.io.*;

public class ReadChar {
    public static void main(String[] args) {
        int c;
        String text = "";

        try {
            FileReader in = new FileReader("ReadChar.java");

            while ((c = in.read()) != -1) {
                text += (char) c;
            }

            in.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }

        System.out.println(text);
    }
}


