package Com.Class.ClassWork.ClassWorkInPutOutPut;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        copyText();

    }

    private static void copyText() {
        Scanner sc = new Scanner(System.in);
        String istr = sc.nextLine();

        try (FileWriter writer = new FileWriter("copy_text.txt", true)) {
            writer.write(istr);
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
