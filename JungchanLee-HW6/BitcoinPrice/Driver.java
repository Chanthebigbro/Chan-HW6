package BitcoinPrice;

import java.util.Scanner;
import java.net.URL;

public class Driver {

	
	public static void main (String [] args)
	{
		
		System.out.println("This programm display the Bitcoin price");
		
		String priceJson = Driver.getJson("https://api.coindesk.com/v1/bpi/currentprice.json");
		
		System.out.println(priceJson);
		
	}

	static String getJson(String urlString) 
	{
		String line = "";
		try
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner (url.openStream());
			while(input.hasNext())
			{
				line += input.nextLine();
			}
			
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "can't connect";
		}
		return line;
		
	}
	
	
}
