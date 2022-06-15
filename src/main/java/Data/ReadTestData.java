package Data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadTestData {

    private static JSONParser jsonParser = new JSONParser();
    private static Object obj;

     public static String getUsername(String usernameKey)
     {
       JSONObject loginCredentials = (JSONObject) getJsonObject().get("LoginTestUser");
        return (String) loginCredentials.get(usernameKey);

     }

    public static String getPassword(String passwordKey)
    {
        JSONObject loginCredentials = (JSONObject) getJsonObject().get("LoginTestUser");
        return (String) loginCredentials.get(passwordKey);

    }
    public static String getName(String nameKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(nameKey);
    }
    public static String getCountry(String countryKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(countryKey);
    }
    public static String getCity(String cityKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(cityKey);
    }
    public static String getCreditCard(String creditCardKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(creditCardKey);
    }
    public static String getMonth(String monthKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(monthKey);
    }
    public static String getYear(String yearKey)
    {
        JSONObject orderData = (JSONObject) getJsonObject().get("OrderTestData");
        return (String) orderData.get(yearKey);
    }

    public static JSONObject getJsonObject() {
        JSONObject testDataJSONObject = null;

        try (FileReader reader = new FileReader("src/main/java/Data/TestData.json")) {
            obj = jsonParser.parse(reader);
            testDataJSONObject = (JSONObject) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testDataJSONObject;
    }


}
