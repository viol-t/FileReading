package org.example;


import javax.swing.*;
import java.io.*;

public class ReadAndWriteStudentList {

    public static void main(String[] args) {

    }

    public void readFile(String path){
        path = "src/main/resources/listofstudents.csv";
        String line = "";
        try (
            BufferedReader br = new BufferedReader(new FileReader(path));
        )
        {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveFile(String firstName, String lastName, int age, String type, String courses,String filepath){
        String line = "";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath,true));
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
        ) {
            printWriter.println(firstName + ","+ lastName + "," + age + "," + type + "," + courses);
            System.out.println("Record saved");
        }
        catch (IOException exception)
        {
            System.out.println("Record not saved");
        }
    }
}
