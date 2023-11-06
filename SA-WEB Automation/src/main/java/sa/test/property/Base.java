package sa.test.property;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Base {
	
	
	public static property loadproperty(String env) throws IOException, ParseException {
		
		property prop=new property(env);
		return prop;
		
	}

}
