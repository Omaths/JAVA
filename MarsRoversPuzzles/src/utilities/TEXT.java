package utilities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TEXT {

	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((dataRow = br.readLine())!=null) {
			//System.out.println(dataRow);
			String[] dataRecords = dataRow.split(" ");
			//System.out.println(dataRow);
			data.add(dataRecords);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the File.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Couldn't read the line of the File.");
			e.printStackTrace();
		}
		
		return data;
	}
}
