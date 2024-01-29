import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Assembler 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Start Assembler reading");
        String fileSource = "imput.txt";
        Read(fileSource);
    }
    //need to read file 
    public static void Read(String source) throws FileNotFoundException
    {
        //get the file 
        String path = source;
        //get the first line and start reading
        InputStream line = new FileInputStream(path);
 
        try (Scanner sc = new Scanner(line, StandardCharsets.UTF_8.name())) 
        {
            //reading the lines 
            //print to check for errors
            while (sc.hasNextLine()) 
            {
                //System.out.println(sc.nextLine());
                interpret(sc.nextLine());
            }
        }
    }

    //interpret file 
    public static void interpret(String line)
    {
        System.out.println(line);
    }

    /* //output file 
    public static void outputFile(String out)
    {

    }
   */

}
