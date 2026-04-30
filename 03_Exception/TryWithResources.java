import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (
            // リソースを () 内で宣言する
            FileReader fr = new FileReader("TryWithResources.java");
            BufferedReader in = new BufferedReader(fr)
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

