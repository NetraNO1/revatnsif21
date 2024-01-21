package assignment1;
import java.util.*;
public class SkyAirlines2 {

	public static void main(String[] args) {
		
				SkyAirlines sky = new SkyAirlines();
				
				Scanner sc=new Scanner(System.in);
				
				
				System.out.println("Eneter the name");
				String name=sc.nextLine();
				
				System.out.println("Enter the source");
				String source=sc.nextLine();
				
				System.out.println("Enter the distination");
				String distination=sc.nextLine();
	
				
				sky.setName(name);
				sky.setSource(source);
				sky.setDistination(distination);
				
				
				System.out.println(sky);
				}

	
}



