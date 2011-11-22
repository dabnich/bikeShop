import java.util.ArrayList;
import java.util.List;





public class Main {

	public static void main (String [] args){
		List<Bike> bikes = new ArrayList<Bike>();
		bikes.add(new Bike ("Author",	"Basic",	"XC"));
		bikes.add(new Bike("Giant",		"TCR ",		"Racing"));
		bikes.add(new Bike("Wigry",		"3",		"Touring"));
		/*Biker d=new Biker("Janek","Mysliciel",bikes, bikes);*/

		Bike c = new Bike();
		c.printBike();
   }

}