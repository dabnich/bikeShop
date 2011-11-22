import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class CopyOfBiker {

	public String name;
	public String alias;


	public biker(String name, String alias){
		this.name=name;
		this.alias=alias;
	}

	public biker(String name, String alias, List<Bike> bike, List<Bike> bikes){
		this.name=name;
		this.alias=alias;
		this.bikes=bikes;
	}

	public List<Bike> bikes= new ArrayList<Bike>();
	private static Logger logger = Logger(CopyOfBiker.class);

	public void buyBike(Bike m){
		bikes.add(m);
		logger.info("rowerek zakupiony "+ m);
	}

	private static Logger Logger(Class<CopyOfBiker> class1) {
		return null;
	}

	public void sellBike (Bike m){
		mangas.remove(m);
		logger.info("rowerek sprzedany");
	}

	public Bike beBike(Bike m) throws Wyjatek {
		if (bikes.indexOf(m) != -1){
			return m;
		}
		else
		System.out.println("brak roweru");

		throw new Wyjatek ("brak roweru w bazie");

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
		logger.info("rower zamieniony");
	}


	public void printBikes(){
		for(Bike o : this.bikes)
			o.printBike();
    }


}




