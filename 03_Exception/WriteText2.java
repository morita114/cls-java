import java.io.*;

public class WriteText2 {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("output.txt");
            String lf = System.lineSeparator();
            String text = "Hello, World." + lf + "  from WriteText2.java";
            out.printf("%s%s", text, lf);
            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

