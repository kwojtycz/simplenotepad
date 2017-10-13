package simplenotepad;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Menu {
    public static void main(String[] args) throws IOException, StringIndexOutOfBoundsException {
        System.out.println("This program helps you to manage short text files known as notes \nWhat would you like to do?");
        System.out.println("Choose 1 to create/modify notes... \n or 2 to exit the program");

        Scanner input = new Scanner(System.in);
        int activity = input.nextInt();

        switch (activity) {
            case 1:
                System.out.println("Write name of your note:");
                String name = input.next();
                noteName noteName = new noteName(name);
                File noteFile = new File(noteName.noteName);
                noteFile.createNewFile();
                System.out.println("Write your text");
                FileWriter writer = new FileWriter(noteFile);
                String note = input.next();
                writer.write(note);
                writer.flush();
                writer.close();

                break;
            case 2:
                break;
        }
    }
}