package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readme {
    public static void main(String[] args) {
        String filensIndhold = readFile();

        System.out.println("README INDEHOLDER: \n" +  filensIndhold);

    }

    public static String readFile() {

        String readmeTxt = "";

        System.out.println("Readme editor");

        File readme = new File("README.Readme");

        if(readme.exists()) {
            System.out.println("Readme findes. ");
        } else {
            System.out.println("Readme findes ikke. ");

            try {
                PrintWriter filSkriver = new PrintWriter(readme);
                filSkriver.print("# README fil");
                filSkriver.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            Scanner in = new Scanner(readme);

            while (in.hasNext()){
                String newLine = in.nextLine();
                System.out.println(readmeTxt);
                readmeTxt = readmeTxt + newLine + "\n";

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readmeTxt;
    }

   // public static void writeFile(){

    }
}
