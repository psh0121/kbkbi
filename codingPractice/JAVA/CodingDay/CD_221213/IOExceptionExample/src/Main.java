import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void fileFunc2() throws IOException
	{
		Path file = Paths.get("C:\\Users\\101-15\\Documents\\sample.txt");
		
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('B');
		
		if(writer != null)
		{
			writer.close();
		}
	}
	
	public static void fileFunc1() throws IOException
	{
		fileFunc2();
	}
	
	public static void main(String[] args) 
	{
		try
		{
			fileFunc1();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
