import java.io.*;

public class BinaryIO {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("data.bin")) {
            out.write(65);   // 'A' のバイト値
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        try (FileInputStream in = new FileInputStream("data.bin")) {
            int b = in.read();  // ファイルから 1 バイト読み込む
            System.out.println(b);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
        }
    }
}

