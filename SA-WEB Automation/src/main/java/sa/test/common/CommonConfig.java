package sa.test.common;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeSuite;

import sa.test.property.Base;
import sa.test.property.property;

public class CommonConfig {
	
	//public static String url;
	
	@BeforeSuite(alwaysRun=true)
	public static void init() throws IOException, ParseException {
		
	
		
	  property 	prop=Base.loadproperty("stg");
     ConfigVar.baseUrl= prop.keypairvalue("baseUrl");
     ConfigVar.user1=prop.getUser("User1");
     ConfigVar.user2=prop.getUser("User2");
     ConfigVar.commpassword=prop.keypairvalue("commonpassword");
     ConfigVar.newassword=prop.keypairvalue("newpassword");
     
     }
	
	
	
	
	
	
	
	
	
	
	
	

}
