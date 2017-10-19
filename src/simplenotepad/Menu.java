package simplenotepad;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Menu {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int activity =0;
        System.out.println("This program helps you to manage short text files known as notes");
        while(activity!=3){
            System.out.println("What would you like to do?");
            System.out.println("Choose 1 to create, 2 to modify notes... \n or 3 to exit the program");

            activity = input.nextInt();


                switch (activity) {
                    case 1:
                    System.out.println("Write name of your note:");
                    String name = input.next();
                    noteName noteName = new noteName(name);
                    File noteFile = new File(noteName.noteName);
                    noteFile.createNewFile();
                    System.out.println("Write your text");
                    FileWriter writer = new FileWriter(noteFile);
                    String text = input.next();
                    System.out.println(text);
                    writer.write(text);
                    writer.flush();
                    writer.close();

                    break;
                case 2:

                    break;
                case 3:
                    
                }

            }


    }
}