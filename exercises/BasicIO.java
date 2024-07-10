import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BasicIO {
    public static void main(String[] args) {
        String inputFileName = "names.txt";
        String outputFileName = "greetings.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
        ) {
            String name;
            while ((name = reader.readLine()) != null) {
                System.out.println("Read name: " + name);
                writer.write("Hello, " + name + "!\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
