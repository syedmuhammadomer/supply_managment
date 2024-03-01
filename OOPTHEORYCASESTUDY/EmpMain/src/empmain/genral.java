package empmain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class genral {

    private final static String filePath = "OrderRecord.txt";

    public static void saveRecord(StringGenrator std) throws IOException {
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.println(std);
        printWriter.flush();
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public static String searchRecord(String keyword) {
        String line = "";
        boolean found = false;
        File file = new File(filePath);
        try ( Scanner sc = new Scanner(file);) {

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                if (line.equals("")) {
                    break;
                }

                String words[] = line.split("\\|");
                for (String s : words) {
                    if (s.equalsIgnoreCase(keyword)) {
                        sc.close();
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Not Found\nFileNotFoundException");
        }
        if (found) {
            return line;
        } else {
            return "";
        }
    }

   
    static String S;

    static String viewRecord() {

        try {
            File file = new File(filePath);    //creates a new file instance  
            FileReader fr = new FileReader(file);   //reads the file  
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream  
            StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters  
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
                //appends line to string buffer  //line feed   
            }
            fr.close();    //closes the stream and release the resources  
            System.out.println("Contents of File: ");
            S = (sb.toString());
            return (S);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
