package com.mhd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UtilsMe {

    public static void WriteToFile(String filename, List<StudentMe> students) throws Exception {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) { //check if the file exist
                System.out.println("We need to create a new file");
                destFile.createNewFile();//creqating a file
            }
            PrintWriter out = new PrintWriter(new FileWriter(filename, true));
            for (StudentMe s : students) { //add infi to file
                out.append(s.getID() + ", " + s.getName() + ", " + s.getPass() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getMessage() + "\n");
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Coud Not Log");
        }
    }

    public static void ReadDataFromFile(String filename, DefaultTableModel model) throws IOException {
        String line; //why use it?
        BufferedReader reader; //why use it?
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
         
        while ((line = reader.readLine()) != null) {
            model.addRow(line.split(", "));
            reader.close();
        }
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue."); // why use it??
        }
    }
}
