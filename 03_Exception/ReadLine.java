import java.io.*;

public class ReadLine {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("ReadLine.java"));
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

