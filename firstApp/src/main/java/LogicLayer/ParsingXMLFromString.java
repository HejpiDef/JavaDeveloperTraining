package LogicLayer;

import java.util.ArrayList;

public class ParsingXMLFromString
{
    private final String attributeNameStart = "<attributeName>";
    private final String attributeNameEnd = "</attributeName>";
    private final int attributeNameShift = 15;

    private final String attributeValueStart = "<attributeValue>";
    private final String attributeValueEnd = "</attributeValue>";
    private final int attributeValueShift = 16;

    public ArrayList<String> ParsingXMLFromString(String input) {

        ArrayList<String> output = new ArrayList<>();
        for(int i=0; i<input.length();) {
            int nameBeg = input.indexOf(attributeNameStart,i);
            int nameEnd = input.indexOf(attributeNameEnd,i);

            int valueBeg = input.indexOf(attributeValueStart,i);
            int valueEnd = input.indexOf(attributeValueEnd,i);

            if(nameBeg == -1) break;

            String subString = "" + input.substring(nameBeg + attributeNameShift, nameEnd) + " = " + input.substring(valueBeg + attributeValueShift, valueEnd);

            output.add(subString);

            i=valueEnd+1;
        }
        return output;
    }
}
