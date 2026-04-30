import java.io.*;

public class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("output.txt");
            String lf = System.lineSeparator();
            String text = "Hello, World." + lf + "  from WriteText.java";
            out.write(text);
            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

