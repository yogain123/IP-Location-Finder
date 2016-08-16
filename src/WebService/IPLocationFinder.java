package WebService;

import java.io.IOException;
import java.util.*;
import java.io.*;
public class IPLocationFinder {
	public static void main(String args[])throws IOException
	{
		if(args.length == 0)
			System.out.println("You Need to enter an IP Address");
		else
		{
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("Location of this IP Address is "+geoIP.getCountryName());
		}
	}

}
