import java.io.*;

public class WriteChar {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("output.txt");

            String lf = System.lineSeparator();
            String text = "Hello, World." + lf + "  from WriteChar.java";

            for (int i = 0; i < text.length(); i++) {
                out.write(text.charAt(i));
            }

            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

