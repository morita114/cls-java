import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        // リソースを () 内で宣言する
        try (
            FileReader fr = new FileReader("TryWithResource.java")
        ) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

