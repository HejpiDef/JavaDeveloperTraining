package DataLayer;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingXMLtoString {

    public String readingXMLtoString(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                stringBuilder.append(sCurrentLine);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
