package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> read (String file){
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				while ((dataRow = br.readLine())!= null) {
					String[] dataRecords = dataRow.split(",");
					data.add(dataRecords);
				}
				
			} catch (IOException e) {
				System.out.println("Couldn't read the File");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't found the File");
			e.printStackTrace();
		}
		return data;
	}
}


