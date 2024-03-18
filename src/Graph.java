import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Graph {
    
    private File cities, roads;
    private Map<City,Set<Road>> cityMap = new HashMap<>();
    private List<Road> roadList = new ArrayList<>();
    private Map<String, City> stringCityMap = new HashMap<>();

    public Graph(File cities, File roads){
        this.cities = cities;
        this.roads = roads;


        try
        {
            FileInputStream file = new FileInputStream(roads);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] lineSplit = line.split(",");

                roadList.add(new Road(Integer.parseInt(lineSplit[0]), Integer.parseInt(lineSplit[1])));

            }
            scanner.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


        try
        {
            FileInputStream file = new FileInputStream(cities);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] lineSplit = line.split(",");
                City city = new City(Integer.parseInt(lineSplit[0]),lineSplit[1],Double.parseDouble(lineSplit[2]),Double.parseDouble(lineSplit[3]));
                Set<Road> roadSet = new HashSet<>();

                for (Road road : roadList){
                    if (road.getSource() == city.getId_city()){
                        roadSet.add(road);
                    }
                }
                cityMap.put(city,roadSet);

                stringCityMap.put(lineSplit[1],city);
            }
            scanner.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



    }



    public void calculerItineraireMinimisantNombreRoutes(String departureCity, String arrivalCity) {

    }

    public void calculerItineraireMinimisantKm(String departureCity, String arrivalCity) {

    }
}
