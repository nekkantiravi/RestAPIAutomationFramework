package com.Cucumberframework.Resourcehelper;

public class Resourcehelper {

	public static String getResourcePath(String path) {
		
		String basepath = System.getProperty("user.dir");
		return basepath+path;
		
	}
	
	/*public static void main(String[] args) {
		String path=Resourcehelper.getResourcePath("/src/test/resources/Configfile/config.properties");
		System.out.println(path);
		
	}*/
}
