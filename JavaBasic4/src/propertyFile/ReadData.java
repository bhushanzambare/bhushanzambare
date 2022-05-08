package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadData {

	public static void main(String[] args) throws IOException {
		
		String currentWorkingDir=System.getProperty("user.dir");
		//System.out.println(correntWorkingDir);
		String filePath=currentWorkingDir+"\\TestData\\Data.properties";
		//System.out.println(filePath);
		//get file location---> create a instance of FileInputStream class and pass the file location to its constructor
		
		//FileInputStream fis=new FileInputStream("C:\Javaworkspace\JavaBasic4\TestData\Data.properties");
		           //or
		//FileInputStream fis=new FileInputStream(filePath);
		                        //or using  relative path where'.' indicates current working dir
		FileInputStream fis=new FileInputStream(".\\TestData\\Data.properties");
		//Create an instance of properties class
		Properties prop=new Properties();
		//load property using load method Properties class
		prop.load(fis);
		//read data from property file
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("pinCode"));
		System.out.println(prop.getProperty("mobile"));
		
	}
	
	
}
