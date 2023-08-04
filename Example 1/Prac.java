import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Prac {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Press enter");
        String textFile = keyboard.nextLine();
        textFile = "C:\\Users\\zuhay\\OneDrive\\University\\Third Year\\CSC2004Z\\My Own Stuff\\lineFile.txt";

        ArrayList<String> lines = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(textFile)))
        {
            String line;
            
            while ((line=br.readLine()) != null)
            {
                System.out.println(line);
                lines.add(line);
            }
        }
        catch(IOException e){System.err.println(e.getMessage());}

        ArrayList<String> newLines = new ArrayList<String>();

        for (int i = lines.size()-1;i>=0;i--)
        {
            newLines.add(lines.get(i));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(textFile)))
        {
            for (int i = 0;i<newLines.size();i++)
            {
                System.out.println(newLines.get(i));
                bw.write(newLines.get(i));
                bw.newLine();
            }
        }
        catch(IOException e){System.err.println(e.getMessage());}
    }
}
