package org.example;

import javax.swing.*;
import java.io.*;

public class ReadAndWriteCoursesList {

    public void readFile(String path){
        //path = "src/main/resources/listofcourses.csv";
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

    /**
     *
     * @param courseName - String
     * @param filepath - String
     */
    public void saveFile(String courseName, String filepath){

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath, true));
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                ){

            printWriter.println(courseName);
            System.out.println("Record saved");

        }
        catch (IOException exception)
        {
            System.out.println("Record not saved");
        }
    }
}
