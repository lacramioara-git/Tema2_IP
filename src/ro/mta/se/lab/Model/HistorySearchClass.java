package ro.mta.se.lab.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistorySearchClass {

    public void createFile(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating history file.");
            e.printStackTrace();
        }

    }


    public void writeSerchResult(String outfile,String response,String Cityname)
    {
        createFile(outfile);
        try {
            FileWriter myWriter = new FileWriter(outfile,true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            myWriter.write(dtf.format(now));
            myWriter.write("  " +Cityname);
            myWriter.write("    " + response + "\n");

            myWriter.close();
            System.out.println("Successfully wrote to the history file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
