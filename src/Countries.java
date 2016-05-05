/**
 * Created by RobertBarber on 4/8/16.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Countries {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, ArrayList<String>> countriesMap = new HashMap();

    public static void main(String[] args) throws Exception {
        String firstLetter = "";
        String lastLetter = null;

        ArrayList<String> fileContents = readFile();                    // Read file
        ArrayList<String> countries = null;

        for (String s : fileContents){                                  // Loop through
            String tempName = s.substring(3);                           // get name
            firstLetter = s.substring(3, 4);                            // check first letter
            if (firstLetter.equals(lastLetter)){                        // first letter = last first letter
                countries.add(tempName);
            }
            else {
                if (lastLetter != null) {
                    countriesMap.put(lastLetter, countries);
                }
                countries = new ArrayList<>();                          // make new list
                countries.add(tempName);
            }
            lastLetter = firstLetter;
        }
        //System.out.println(countriesMap);
        String responseLetter;
        while (true){
            System.out.println("Please enter first letter of country");
            responseLetter = scanner.nextLine();
            if (countriesMap.containsKey(responseLetter)){
                ArrayList<String> tempCountries = countriesMap.get(responseLetter);
                writeFile(responseLetter.toUpperCase() + "_countries", tempCountries.toString());
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    static ArrayList<String> readFile() throws IOException{
        File f = new File("countries.txt");
        Scanner scanner = new Scanner(f);
        ArrayList<String> contents = new ArrayList();
        while (scanner.hasNext()) {
            contents.add(scanner.nextLine());
        }
        return contents;
    }

    static void writeFile(String fileName, String fileContent) throws IOException {
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        fw.write(fileContent);
        fw.close();
    }
}