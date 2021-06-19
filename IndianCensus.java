package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class App {
	public static String[] arr;
	public static List <String[]> list = new ArrayList <String[]>();
	public static CSVWriter writer;
	public static CSVReader reader;
	public static void main( String[] args ) throws IOException,FileNotFoundException, CsvValidationException
    {
        System.out.println( "Hello World!" );
        String filepath = "D:\\Day29\\state.csv";
        reader = new CSVReader(new FileReader(filepath));
      //  BufferedReader reader = new BufferedReader(new FileWriter(filepath));
        String[] line = {""};
        try 
        {
        	FileWriter FW = new FileWriter(filepath);
        	 writer = new CSVWriter(FW);
        	String[] country = "State#Population#Increase#Area(Km2)#Density#Sex-Ratio#Literacy".split("#");
        	
    //    	for(String[] elements : list)
        	while((line = reader.readNext()) != null)
        	{
        		writer.writeNext(country);
            	addState1Record();
            	writer.writeAll(list);
            	
            	addState2Record();
            	writer.writeAll(list);
            	
            	addState3Record();
            	writer.writeAll(list);
            	
            	addState4Record();
            	writer.writeAll(list);
            	
            	addState5Record();
            	writer.writeAll(list);
            	
            	addState6Record();
            	writer.writeAll(list);
            	
            	addState7Record();
            	writer.writeAll(list);
            	
            	addstate8Record();
            	writer.writeAll(list);
            	
            	addstate9Record();
            	writer.writeAll(list);
            	
            	addState10Record();
            	writer.writeAll(list);
        	}
        	writer.flush();
        	writer.close();
        	System.out.println("State Census Records:");
        	
		}
        catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
        
    }
    
    public static void addState1Record() throws IOException
    {
       	list.add(new String[] {"State", "Uttar Pradesh"});
    	list.add(new String[] {"Population", "199,812,341"});
    	list.add(new String[] {"Increase", "20.23%"});
    	list.add(new String[] {"Area(Km2)", "240,928"});
    	list.add(new String[] {"Density", "829"});
    	list.add(new String[] {"Sex-Ratio", "912"});
    	list.add(new String[] {"Literacy", "67.68"});
  //  	writer.writeNext(arr);;
//    	writer.close();

    }
    
    public static void addState2Record() throws IOException
    {
      	list.add(new String[] {"State", "Maharashtra"});
    	list.add(new String[] {"Population", "112,374,333"});
    	list.add(new String[] {"Increase", "15.99 %"});
    	list.add(new String[] {"Area(Km2)", "307,713"});
    	list.add(new String[] {"Density", "365"});
    	list.add(new String[] {"Sex-Ratio", "929"});
    	list.add(new String[] {"Literacy", "82.34"});
    //	writer.writeNext(arr, false);;
    	//writer.close();
    }
    
    public static void addState3Record()
    {
    	list.add(new String[] {"State", "Delhi"});
    	list.add(new String[] {"Population", "16,787,941"});
    	list.add(new String[] {"Increase", "21.21 %"});
    	list.add(new String[] {"Area(Km2)", "94,163"});
    	list.add(new String[] {"Density", "11,320"});
    	list.add(new String[] {"Sex-Ratio", "868"});
    	list.add(new String[] {"Literacy", "86.21"});
    }
    
    public static void addState4Record()
    {
    	list.add(new String[] {"State", "West Bengal"});
    	list.add(new String[] {"Population", "91,276,115"});
    	list.add(new String[] {"Increase", "13.84 %"});
    	list.add(new String[] {"Area(Km2)", "88,752"});
    	list.add(new String[] {"Density", "1,028"});
    	list.add(new String[] {"Sex-Ratio", "950"});
    	list.add(new String[] {"Literacy", "76.26"});

    }
    
    public static void addState5Record()
    {
    	list.add(new String[] {"State", "Kerala"});
    	list.add(new String[] {"Population", "33,406,061"});
    	list.add(new String[] {"Increase", "4.91 %"});
    	list.add(new String[] {"Area(Km2)", "38,852"});
    	list.add(new String[] {"Density", "860"});
    	list.add(new String[] {"Sex-Ratio", "1084"});
    	list.add(new String[] {"Literacy", "94.00"});
    	
    }
    
    public static void addState6Record()
    {
    	list.add(new String[] {"State", "Bihar"});
    	list.add(new String[] {"Population", "104,099,452"});
    	list.add(new String[] {"Increase", "25.42 %"});
    	list.add(new String[] {"Area(Km2)", "94,163"});
    	list.add(new String[] {"Density", "1,106"});
    	list.add(new String[] {"Sex-Ratio", "918"});
    	list.add(new String[] {"Literacy", "61.80"});
    	
    }
    
    public static void addState7Record()
    {
    	list.add(new String[] {"State", "Andhra Pradesh"});
    	list.add(new String[] {"Population", "84,580,777"});
    	list.add(new String[] {"Increase", "10.98 %"});
    	list.add(new String[] {"Area(Km2)", "275,045"});
    	list.add(new String[] {"Density", "308"});
    	list.add(new String[] {"Sex-Ratio", "993"});
    	list.add(new String[] {"Literacy", "67.02"});
    
    }
    
    public static void addstate8Record()
    {
    	list.add(new String[] {"State", "Madhya Pradesh"});
    	list.add(new String[] {"Population", "72,626,809"});
    	list.add(new String[] {"Increase", "20.35 %	"});
    	list.add(new String[] {"Area(Km2)", "308,252"});
    	list.add(new String[] {"Density", "236"});
    	list.add(new String[] {"Sex-Ratio", "931"});
    	list.add(new String[] {"Literacy", "69.32"});

    }
    
    public static void addstate9Record()
    {
    	list.add(new String[] {"State", "Rajasthan"});
    	list.add(new String[] {"Population", "68,548,437"});
    	list.add(new String[] {"Increase", "21.31 %"});
    	list.add(new String[] {"Area(Km2)", "342,239"});
    	list.add(new String[] {"Density", "200"});
    	list.add(new String[] {"Sex-Ratio", "928"});
    	list.add(new String[] {"Literacy", "66.11"});
    	
    }
    
    public static void addState10Record()
    {
    	list.add(new String[] {"State", "Punjab"});
    	list.add(new String[] {"Population", "27,743,338"});
    	list.add(new String[] {"Increase", "13.89 %"});
    	list.add(new String[] {"Area(Km2)", "50,362"});
    	list.add(new String[] {"Density", "551"});
    	list.add(new String[] {"Sex-Ratio", "895"});
    	list.add(new String[] {"Literacy", "75.84"});
    	
    }
}
