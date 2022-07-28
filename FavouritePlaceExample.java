import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class FavouritePlaceExample
{
	public static void main(String[] args)
	{
        	Writer writer= null;
		BufferedWriter br = null;
		String data = "My Favorite Place is Ratnagiri.Ratnagiri is famous for Beaches,Waterfalls,lake,temple and konkani cuisine.It's a Tourist Spot";
		try
		{
			writer = new FileWriter("abc.txt");
			br = new BufferedWriter(writer);
			br.write(data);
			br.flush();
			System.out.println("Data written to file");
		}
		catch(IOException ex)
		{
			 ex.printStackTrace();
		}
	}
}