package sa.test.property;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class property {
	public static JSONObject jsonObject;
	
	
    


	public  property (String environment) throws IOException, ParseException {
		
		String datafile= System.getProperty("user.dir")+"\\src\\main\\resources\\configuration."+environment+"\\config.json";
		parsejson(datafile);
		
		
	}
	
	
	// parsing json file
	
	public static void parsejson(String file) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		
		
		//Parsing the contents of the JSON file
		 jsonObject = (JSONObject) jsonParser.parse(new FileReader(file));
		
		
		
		
		/** Read string

		String value = (String) jsonObject.get("baseUrl");
        System.out.println(value);
		
		**/
		
		
		/** Read Json Object
		 
	   JSONObject user = (JSONObject) jsonObject.get("User1");
	  System.out.println(user.get("loginID"));
	   
	    
	  **/
		
		
		/** List
		  
		JSONArray value = (JSONArray) jsonObject.get("mobileaccount");
	    System.out.println(value.get(0));
		
		**/
		
		
		/** Array of json object
		 * 
		 JSONArray booklistofobject = (JSONArray) jsonObject.get("book");
	     JSONObject user = (JSONObject) booklistofobject.get(0);
	      System.out.println(user.get("author"));
			
			**/
          }
	
	// get valeue frm jsn file
	
	public String keypairvalue(String key) {
		
		String value = (String) jsonObject.get(key);
		return value;
	}
	
	
	public JSONObject getUser(String User) {
		
		JSONObject user = (JSONObject) jsonObject.get(User);
		//System.out.println(user.get("loginID"));
		return user;
		
		
	}
	
  public static JSONArray getList(String list) {
		
	JSONArray user = (JSONArray) jsonObject.get(list);
    return user;
   }
	
  public static JSONObject getArrayOfbject(String array) {
	  
	  JSONArray booklistofobject = (JSONArray) jsonObject.get("book");
	  JSONObject user = (JSONObject) booklistofobject.get(0);
	  //System.out.println(user.get("author"));
	  return user;
	   }
	
	

}
