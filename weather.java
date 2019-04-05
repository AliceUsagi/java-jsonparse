import java.io.IOException;

import jdk.nashorn.internal.parser.JSONParser;

public class weather {
    JSONParser parser = new JSONParser();
    Object jsonParsed = null;
    try{
        jsonParsed = parser.parse(jsonFile);
    } catch (ParseException | IOException e) {
        e.printStackTrace();
    }
}