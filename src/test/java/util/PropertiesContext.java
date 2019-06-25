/**
 * 
 */
package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import junit.framework.Assert;

//import org.testng.Assert;

//import org.junit.Assert;

/**
 * @author faizan.zafar
 *
 */
public class PropertiesContext {
	private static String _propertiesFilePath = PropertiesContext.class.getResource("/app.properties").getFile();
	private static PropertiesContext _instance;
	
	private Properties _prop = null;
	
	private PropertiesContext() throws IOException {
		_prop = new Properties();
		
		InputStream input = new FileInputStream(_propertiesFilePath);
		_prop.load(input);
	}
	
	public static synchronized PropertiesContext getInstance() {
		if(_instance == null){
			try {
				_instance = new PropertiesContext();
			} catch (IOException e) {
				Assert.fail("An error was encountered while creating the PropertiesContext object. " + e.getMessage());
			}
        }
		
        return _instance;
	}

  public String getProperty(String key) {
    String value = System.getProperty(key);

    if (value == null) {
      value = _prop.getProperty(key);
    }

    return value;
  }

}
