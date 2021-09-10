package LogicLayer;

import java.util.ArrayList;

public class StringOperations
{
    public static void splitString(String input, ArrayList<String> output)
    {
        for(int i=0; i<input.length();)
        {
            int nameBeg = input.indexOf("<attributeName>",i);
            int nameEnd = input.indexOf("</attributeName>",i);

            int valueBeg = input.indexOf("<attributeValue>",i);
            int valueEnd = input.indexOf("</attributeValue>",i);

            if(nameBeg == -1) break;

            String substring = "" + input.substring(nameBeg + 15,nameEnd) + " = " + input.substring(valueBeg + 16, valueEnd);

            output.add(substring);

            i=valueEnd+1;
        }
    }
}
