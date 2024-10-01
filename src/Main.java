/*
Name:Shreyash Parsekar
MCA Part-1
OOPS Lab
Topic: Java Game
Start Date:16/08/2024
Modified Date:27/08/2024
 */
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
       // String[] possibleWords = {"master", "student", "hello", "encapsulation", "abstraction","teacher","subject","business"};
        ArrayList<String>possibleWords=new ArrayList<>();
        try {
            File file=new File("C:\\Users\\Student\\IdeaProjects\\JavaGame\\src\\words.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String data=scanner.nextLine();
                possibleWords.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error Occured");
        }

        Random random = new Random();
        String selectedWord = possibleWords.get(random.nextInt(possibleWords.size()));

        GuessingGame game = new GuessingGame(selectedWord, 6);
        game.start();


    }
}


