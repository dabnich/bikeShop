

import java.util.ArrayList;
import java.util.List;



public class Biker {

public String name;
public String alias;


public Biker(String name, String alias)
{
    this.name=name;
    this.alias=alias;
}
public Biker(String name, String alias, List<Bike> bike, List<Bike> bikes)
{
    this.name=name;
    this.alias=alias;
    this.bike=bike;
}

public List<Bike> mangas= new ArrayList<Bike>();
private static Logger logger = Logger(Biker.class);

public void buyBike(Bike m){
bikes.add(m);
logger.info("Rower zakupiony "+ m);
}

private static Logger Logger(Class<Biker> class1) {
	// TODO Auto-generated method stub
	return null;
}
public void sellBike (Bike m){
bikes.remove(m);
logger.info("Rower sprzedany");
}

public Bike beBike(Bike m) throws Wyjatek {
if (bikes.indexOf(m) != -1)
{
return m;
}
else
System.out.println("Brak roweru");
throw new Wyjatek ("Nie ma takiego roweru w bazie");

}

public void findBike(BikeTypes type) {
	int position = 0;
	for (Bike game : bikes) {
	if (game.getType().equals(type)) {
	System.out.println("Something"+position);
	}
	position++;
	}
	}



public void changeBike(Bike m, String newTitle, BikeTypes newType){
m.title= newTitle;
m.type = newType;
logger.info("manga has been changed");
}


public void printBikes()
{
    for(Bike o : this.bikes)
    
        o.printBike();
    
}


}