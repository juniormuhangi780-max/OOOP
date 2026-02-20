package medicallogreader;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MedicalLogReader {

    public static void main(String[] args) {

        File medicalLogFile = new File("medicalLog.txt");

        try {

            FileReader reader = new FileReader(medicalLogFile);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("Medical Log Contents:");

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);

            }

            bufferedReader.close();

        }

        catch (FileNotFoundException e) {

            System.out.println("Error: File not found.");

        }

        catch (IOException e) {

            System.out.println("Error reading file.");

        }

    }

}
