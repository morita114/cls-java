import java.io.*;

public class TryWithoutResource {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("TryWithoutResource.java");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file.");
                }
            }
        }
    }
}

