package maxima.homework20221116;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileWriter fWriter = null;
        try {
            File outputFile = new File("Output.txt");
            fWriter = new FileWriter(outputFile, true);

            //FileWriter fWriter = new FileWriter("Output.txt");

            fWriter.write("This is our fist line in the file.");
            fWriter.write("\n");
            fWriter.write("This is our second line in the file.");
            fWriter.write("\n");
            fWriter.write("This is our third line in the file.");
            fWriter.write("\n");

            /*
            for(int i = 0; i < 1000000000; i++){
                fWriter.write(i);
            }
             */

            //fWriter.flush();

            //fWriter.close();

            Scanner scanner = new Scanner(outputFile);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

            Properties props = new Properties();
            FileInputStream inputStream = new FileInputStream("config.properties");
            props.load(inputStream);

            System.out.println(props.getProperty("LoginPage.LoginEditBox"));
            System.out.println(props.getProperty("LoginPage.PasswordEditBox"));
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
        finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
            }
            catch(IOException exception){
                System.out.println(exception.toString());
            }
        }
    }
}