package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Jvm {
	
	public static void createJvmReport(String jsonFilePath) {
		
		File file = new File("C:\\Users\\Babu\\eclipse-workspace\\CucumberNew\\JVM");
		
	    Configuration c = new Configuration(file,"Facebook");
	    
	    c.addClassifications("Platform", "Windows 8.1");
	    c.addClassifications("Browser", "Brave Browser");
	    c.addClassifications("Machine", "Desktop");
	    
	    List<String> l = new ArrayList<String>();
	    l.add(jsonFilePath);
	    
	    ReportBuilder r = new ReportBuilder(l, c);
	    
	    r.generateReports();
	    
		

	}

}
