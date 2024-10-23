package org.app;
 
import java.util.UUID;

import org.apache.commons.math3.random.RandomDataGenerator;
//import org.apache.commons.lang.StringUtils;

 
/**
 * Generate a unique number
 * @version 2.0 [2016]
 * 
 */
public class NumberGeneratorApp {
 
    public static void main( String[] args )
    {
        NumberGeneratorApp obj = new NumberGeneratorApp();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        System.out.println("Unique ID (2): " + obj.generateUniqueKey2());
    }
 
    public String generateUniqueKey(){
 
    	String id = UUID.randomUUID().toString();
    	return id;
 
    }
    /*
     * http://commons.apache.org/proper/commons-math/userguide/random.html
     */
    public String generateUniqueKey2(){
    	RandomDataGenerator randomData = new RandomDataGenerator(); 
    	String id = String.valueOf(randomData.nextLong(1, 1000000));
    	return id;
 
    }
}
