package com.testcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import org.hibernate.engine.transaction.internal.NullSynchronizationException;

public class TestCode{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		long creditCardNumber = 1234_5678_9012_3456L;
		Testimplabs tim= new Testimplabs();
		
		HashMap<String, String> hsmp=new HashMap<>();
		hsmp.put("A", "A");
		hsmp.put("A", "B");
		System.out.println("=======>"+hsmp.get("A"));
		
	/*	File f = new File("JMSa.txt");
		try{
			f.createNewFile();
			FileWriter writer = new FileWriter(f); 
		      writer.write("This\n is\n an\n example\n"); 
		      writer.flush();
		      writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		try(FileReader fr = new FileReader("JMSa.txt"); 
				BufferedReader bf = new BufferedReader(fr);){
			
			StringBuffer stringBuffer = new StringBuffer();
			String newl;
			while((newl=bf.readLine()) != null){
				System.out.println("in");
				//System.out.println(newl);
				stringBuffer.append(newl);
				stringBuffer.append("\n");
				
				StringTokenizer st = new StringTokenizer(newl," ()-");
				List<String> myList = new ArrayList<>();
				while(st.hasMoreTokens()){
					myList.add(st.nextToken());
				}
				System.out.println("out"+myList.size());
				Set<String> mySet = new HashSet<>();
				mySet.addAll(myList);
				Map<String, Integer> myMap = new HashMap<>();
				for (String string : mySet) {
					myMap.put(string, Collections.frequency(myList, string));
				}
				//System.out.println(stringBuffer.toString());
				System.out.println(myMap);
				
			}
			fr.close();
		      
		}catch(NullPointerException | ClassCastException | IOException ce){
			ce.printStackTrace();
		}
		
			      
	
	}

}
