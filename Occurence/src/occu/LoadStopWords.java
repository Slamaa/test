package occu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadStopWords {
	
	public static ArrayList loadStopWords()
	{
		List<String> StopWords = new ArrayList<String>();
		int count=0;
		BufferedReader in = null;
		try {   
		    in = new BufferedReader(new FileReader("stopWords.txt"));
		    String str;
		    while ((str = in.readLine()) != null) {
		        StopWords.add(str);
		        count++; }
		    
		    
		    System.out.println(count);
		    System.out.println(StopWords);
		    
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		finally
		{
		    try
		    {
		        if ( in != null)
		        in.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
		return (ArrayList) StopWords;
		
	}

}
