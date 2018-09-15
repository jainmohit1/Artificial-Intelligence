import java.util.HashMap;
import java.util.LinkedList;

public class SearchUSA {

	public static void main(String[] args) {

		SearchUSA searchUSAObj = new SearchUSA();
		HashMap<String, CityInformation> cityInformation = searchUSAObj.loadCityInformation();
		HashMap<String, LinkedList<Node>> graphInformation = searchUSAObj.loadGraphInformation();

	}

	// Parse the information and storing in the Hashmap.
	protected void parseGraphInformation(String sourceCity, String destinationCity, double pathCost,
			HashMap<String, LinkedList<Node>> graphInformation) {
		try {
			// Check if the city is already added as a key in the Hashmap
			if (graphInformation.containsKey(sourceCity)) {
				graphInformation.get(sourceCity).add(new Node(sourceCity, destinationCity, pathCost));
			}
			// New key in the hashmap
			else {
				LinkedList<Node> nodeLinkedList = new LinkedList<Node>();
				nodeLinkedList.add(new Node(sourceCity, destinationCity, pathCost));
				graphInformation.put(sourceCity, nodeLinkedList);
			}

		} catch (Exception e) {
			// Should be added in the log files
			System.out.println("Error ocurred while parsing graph information");
		}
	}

	public class Node {
		String parentCity;
		String currenCity;
		double pathCost;

		protected Node(String parentCity, String currenCity, double pathCost) {
			this.parentCity = parentCity;
			this.currenCity = currenCity;
			this.pathCost = pathCost;
		}

		public String getParentCity() {
			return parentCity;
		}

		public void setParentCity(String parentCity) {
			this.parentCity = parentCity;
		}

		public String getCurrenCity() {
			return currenCity;
		}

		public void setCurrenCity(String currenCity) {
			this.currenCity = currenCity;
		}

		public double getPathCost() {
			return pathCost;
		}

		public void setPathCost(double pathCost) {
			this.pathCost = pathCost;
		}
	}

	// POJO of city information. Should be in a separate file and using import
	// keyword, should be imported in this file
	public class CityInformation {
		String cityName;
		double latitude;
		double longitude;

		protected CityInformation(String cityName, double latitude, double longitude) {
			this.cityName = cityName;
			this.latitude = latitude;
			this.longitude = longitude;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public double getLongitude() {
			return longitude;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
	}

	// Method to load the entire graph which is used for traversal
	protected HashMap<String, LinkedList<Node>> loadGraphInformation() {
		HashMap<String, LinkedList<Node>> graphInformation = new HashMap<String, LinkedList<Node>>();
		parseGraphInformation("albanyNY", "montreal", 226, graphInformation);
		parseGraphInformation("albanyNY", "boston", 166, graphInformation);
		parseGraphInformation("albanyNY", "rochester", 148, graphInformation);

		parseGraphInformation("albanyGA", "tallahassee", 120, graphInformation);
		parseGraphInformation("albanyGA", "macon", 106, graphInformation);

		parseGraphInformation("albuquerque", "elPaso", 267, graphInformation);
		parseGraphInformation("albuquerque", "santaFe", 61, graphInformation);

		parseGraphInformation("atlanta", "macon", 82, graphInformation);
		parseGraphInformation("atlanta", "chattanooga", 117, graphInformation);

		parseGraphInformation("augusta", "charlotte", 161, graphInformation);
		parseGraphInformation("augusta", "savannah", 131, graphInformation);

		parseGraphInformation("austin", "houston", 186, graphInformation);
		parseGraphInformation("austin", "sanAntonio", 79, graphInformation);

		parseGraphInformation("bakersfield", "losAngeles", 112, graphInformation);
		parseGraphInformation("bakersfield", "fresno", 107, graphInformation);

		parseGraphInformation("baltimore", "philadelphia", 102, graphInformation);
		parseGraphInformation("baltimore", "washington", 45, graphInformation);

		parseGraphInformation("batonRouge", "lafayette", 50, graphInformation);
		parseGraphInformation("batonRouge", "newOrleans", 80, graphInformation);

		parseGraphInformation("beaumont", "houston", 69, graphInformation);
		parseGraphInformation("beaumont", "lafayette", 122, graphInformation);

		parseGraphInformation("boise", "saltLakeCity", 349, graphInformation);
		parseGraphInformation("boise", "portland", 428, graphInformation);

		parseGraphInformation("boston", "providence", 51, graphInformation);

		parseGraphInformation("buffalo", "toronto", 105, graphInformation);
		parseGraphInformation("buffalo", "rochester", 64, graphInformation);
		parseGraphInformation("buffalo", "cleveland", 191, graphInformation);

		parseGraphInformation("calgary", "vancouver", 605, graphInformation);
		parseGraphInformation("calgary", "winnipeg", 829, graphInformation);

		parseGraphInformation("charlotte", "greensboro", 91, graphInformation);

		parseGraphInformation("chattanooga", "nashville", 129, graphInformation);

		parseGraphInformation("chicago", "milwaukee", 90, graphInformation);
		parseGraphInformation("chicago", "midland", 279, graphInformation);

		parseGraphInformation("cincinnati", "indianapolis", 110, graphInformation);
		parseGraphInformation("cincinnati", "dayton", 56, graphInformation);

		parseGraphInformation("cleveland", "pittsburgh", 157, graphInformation);
		parseGraphInformation("cleveland", "columbus", 142, graphInformation);

		parseGraphInformation("coloradoSprings", "denver", 70, graphInformation);
		parseGraphInformation("coloradoSprings", "santaFe", 316, graphInformation);

		parseGraphInformation("columbus", "dayton", 72, graphInformation);

		parseGraphInformation("dallas", "denver", 792, graphInformation);
		parseGraphInformation("dallas", "mexia", 83, graphInformation);

		parseGraphInformation("daytonaBeach", "jacksonville", 92, graphInformation);
		parseGraphInformation("daytonaBeach", "orlando", 54, graphInformation);

		parseGraphInformation("denver", "wichita", 523, graphInformation);
		parseGraphInformation("denver", "grandJunction", 246, graphInformation);

		parseGraphInformation("desMoines", "omaha", 135, graphInformation);
		parseGraphInformation("desMoines", "minneapolis", 246, graphInformation);

		parseGraphInformation("elPaso", "sanAntonio", 580, graphInformation);
		parseGraphInformation("elPaso", "tucson", 320, graphInformation);

		parseGraphInformation("eugene", "salem", 63, graphInformation);
		parseGraphInformation("eugene", "medford", 165, graphInformation);

		parseGraphInformation("europe", "philadelphia", 3939, graphInformation);

		parseGraphInformation("ftWorth", "oklahomaCity", 209, graphInformation);

		parseGraphInformation("fresno", "modesto", 109, graphInformation);

		parseGraphInformation("grandJunction", "provo", 220, graphInformation);

		parseGraphInformation("greenBay", "minneapolis", 304, graphInformation);
		parseGraphInformation("greenBay", "milwaukee", 117, graphInformation);

		parseGraphInformation("greensboro", "raleigh", 74, graphInformation);

		parseGraphInformation("houston", "mexia", 165, graphInformation);

		parseGraphInformation("indianapolis", "stLouis", 246, graphInformation);

		parseGraphInformation("jacksonville", "savannah", 140, graphInformation);
		parseGraphInformation("jacksonville", "lakeCity", 113, graphInformation);

		parseGraphInformation("japan", "pointReyes", 5131, graphInformation);
		parseGraphInformation("japan", "sanLuisObispo", 5451, graphInformation);

		parseGraphInformation("kansasCity", "tulsa", 249, graphInformation);
		parseGraphInformation("kansasCity", "stLouis", 256, graphInformation);
		parseGraphInformation("kansasCity", "wichita", 190, graphInformation);

		parseGraphInformation("keyWest", "tampa", 446, graphInformation);

		parseGraphInformation("lakeCity", "tampa", 169, graphInformation);
		parseGraphInformation("lakeCity", "tallahassee", 104, graphInformation);

		parseGraphInformation("laredo", "sanAntonio", 154, graphInformation);
		parseGraphInformation("laredo", "mexico", 741, graphInformation);

		parseGraphInformation("lasVegas", "losAngeles", 275, graphInformation);
		parseGraphInformation("lasVegas", "saltLakeCity", 486, graphInformation);

		parseGraphInformation("lincoln", "wichita", 277, graphInformation);
		parseGraphInformation("lincoln", "omaha", 58, graphInformation);

		parseGraphInformation("littleRock", "memphis", 137, graphInformation);
		parseGraphInformation("littleRock", "tulsa", 276, graphInformation);

		parseGraphInformation("losAngeles", "sanDiego", 124, graphInformation);
		parseGraphInformation("losAngeles", "sanLuisObispo", 182, graphInformation);

		parseGraphInformation("medford", "redding", 150, graphInformation);

		parseGraphInformation("memphis", "nashville", 210, graphInformation);

		parseGraphInformation("miami", "westPalmBeach", 67, graphInformation);

		parseGraphInformation("midland", "toledo", 82, graphInformation);

		parseGraphInformation("minneapolis", "winnipeg", 463, graphInformation);

		parseGraphInformation("modesto", "stockton", 29, graphInformation);

		parseGraphInformation("montreal", "ottawa", 132, graphInformation);

		parseGraphInformation("newHaven", "providence", 110, graphInformation);
		parseGraphInformation("newHaven", "stamford", 92, graphInformation);

		parseGraphInformation("newOrleans", "pensacola", 268, graphInformation);

		parseGraphInformation("newYork", "philadelphia", 101, graphInformation);

		parseGraphInformation("norfolk", "richmond", 92, graphInformation);
		parseGraphInformation("norfolk", "raleigh", 174, graphInformation);

		parseGraphInformation("oakland", "sanFrancisco", 8, graphInformation);
		parseGraphInformation("oakland", "sanJose", 42, graphInformation);

		parseGraphInformation("oklahomaCity", "tulsa", 105, graphInformation);

		parseGraphInformation("orlando", "westPalmBeach", 168, graphInformation);
		parseGraphInformation("orlando", "tampa", 84, graphInformation);

		parseGraphInformation("ottawa", "toronto", 269, graphInformation);

		parseGraphInformation("pensacola", "tallahassee", 120, graphInformation);

		parseGraphInformation("philadelphia", "pittsburgh", 319, graphInformation);
		parseGraphInformation("philadelphia", "newYork", 101, graphInformation);
		parseGraphInformation("philadelphia", "uk1", 3548, graphInformation);

		parseGraphInformation("philadelphia", "uk2", 3548, graphInformation);

		parseGraphInformation("phoenix", "tucson", 117, graphInformation);
		parseGraphInformation("phoenix", "yuma", 178, graphInformation);

		parseGraphInformation("pointReyes", "redding", 215, graphInformation);
		parseGraphInformation("pointReyes", "sacramento", 115, graphInformation);

		parseGraphInformation("portland", "seattle", 174, graphInformation);
		parseGraphInformation("portland", "salem", 47, graphInformation);

		parseGraphInformation("reno", "saltLakeCity", 520, graphInformation);
		parseGraphInformation("reno", "sacramento", 133, graphInformation);

		parseGraphInformation("richmond", "washington", 105, graphInformation);

		parseGraphInformation("sacramento", "sanFrancisco", 95, graphInformation);
		parseGraphInformation("sacramento", "stockton", 51, graphInformation);

		parseGraphInformation("salinas", "sanJose", 31, graphInformation);
		parseGraphInformation("salinas", "sanLuisObispo", 137, graphInformation);

		parseGraphInformation("sanDiego", "yuma", 172, graphInformation);

		parseGraphInformation("saultSteMarie", "thunderBay", 442, graphInformation);
		parseGraphInformation("saultSteMarie", "toronto", 436, graphInformation);

		parseGraphInformation("seattle", "vancouver", 115, graphInformation);

		parseGraphInformation("thunderBay", "winnipeg", 440, graphInformation);

		return graphInformation;

	}

	// Method to load the City information. In real life this will be taken from DB.
	protected HashMap<String, CityInformation> loadCityInformation() {
		HashMap<String, CityInformation> cityInformation = new HashMap<String, CityInformation>();
		cityInformation.put("albanyGA", new CityInformation("albanyGA", 31.58, 84.17));
		cityInformation.put("albanyNY", new CityInformation("albanyNY", 42.66, 73.78));
		cityInformation.put("albuquerque", new CityInformation("albuquerque", 35.11, 106.61));
		cityInformation.put("atlanta", new CityInformation("atlanta", 33.76, 84.40));
		cityInformation.put("augusta", new CityInformation("augusta", 33.43, 82.02));
		cityInformation.put("austin", new CityInformation("austin", 30.30, 97.75));
		cityInformation.put("bakersfield", new CityInformation("bakersfield", 35.36, 119.03));
		cityInformation.put("baltimore", new CityInformation("baltimore", 39.31, 76.62));
		cityInformation.put("batonRouge", new CityInformation("batonRouge", 30.46, 91.14));
		cityInformation.put("beaumont", new CityInformation("beaumont", 30.08, 94.13));
		cityInformation.put("boise", new CityInformation("boise", 43.61, 116.24));
		cityInformation.put("boston", new CityInformation("boston", 42.32, 71.09));
		cityInformation.put("buffalo", new CityInformation("buffalo", 42.90, 78.85));
		cityInformation.put("calgary", new CityInformation("calgary", 51.00, 114.00));
		cityInformation.put("charlotte", new CityInformation("charlotte", 35.21, 80.83));
		cityInformation.put("chattanooga", new CityInformation("chattanooga", 35.05, 85.27));
		cityInformation.put("chicago", new CityInformation("chicago", 41.84, 87.68));
		cityInformation.put("cincinnati", new CityInformation("cincinnati", 39.14, 84.50));
		cityInformation.put("cleveland", new CityInformation("cleveland", 41.48, 81.67));
		cityInformation.put("coloradoSprings", new CityInformation("coloradoSprings", 38.86, 104.79));
		cityInformation.put("columbus", new CityInformation("columbus", 39.99, 82.99));
		cityInformation.put("dallas", new CityInformation("dallas", 32.80, 96.79));
		cityInformation.put("dayton", new CityInformation("dayton", 39.76, 84.20));
		cityInformation.put("daytonaBeach", new CityInformation("daytonaBeach", 29.21, 81.04));
		cityInformation.put("denver", new CityInformation("denver", 39.73, 104.97));
		cityInformation.put("desMoines", new CityInformation("desMoines", 41.59, 93.62));
		cityInformation.put("elPaso", new CityInformation("elPaso", 31.79, 106.42));
		cityInformation.put("eugene", new CityInformation("eugene", 44.06, 123.11));
		cityInformation.put("europe", new CityInformation("europe", 48.87, -2.33));
		cityInformation.put("ftWorth", new CityInformation("ftWorth", 32.74, 97.33));
		cityInformation.put("fresno", new CityInformation("fresno", 36.78, 119.79));
		cityInformation.put("grandJunction", new CityInformation("grandJunction", 39.08, 108.56));
		cityInformation.put("greenBay", new CityInformation("greenBay", 44.51, 88.02));
		cityInformation.put("greensboro", new CityInformation("greensboro", 36.08, 79.82));
		cityInformation.put("houston", new CityInformation("houston", 29.76, 95.38));
		cityInformation.put("indianapolis", new CityInformation("indianapolis", 39.79, 86.15));
		cityInformation.put("jacksonville", new CityInformation("jacksonville", 30.32, 81.66));
		cityInformation.put("japan", new CityInformation("japan", 35.68, 220.23));
		cityInformation.put("kansasCity", new CityInformation("kansasCity", 39.08, 94.56));
		cityInformation.put("keyWest", new CityInformation("keyWest", 24.56, 81.78));
		cityInformation.put("lafayette", new CityInformation("lafayette", 30.21, 92.03));
		cityInformation.put("lakeCity", new CityInformation("lakeCity", 30.19, 82.64));
		cityInformation.put("laredo", new CityInformation("laredo", 27.52, 99.49));
		cityInformation.put("lasVegas", new CityInformation("lasVegas", 36.19, 115.22));
		cityInformation.put("lincoln", new CityInformation("lincoln", 40.81, 96.68));
		cityInformation.put("littleRock", new CityInformation("littleRock", 34.74, 92.33));
		cityInformation.put("losAngeles", new CityInformation("losAngeles", 34.03, 118.17));
		cityInformation.put("macon", new CityInformation("macon", 32.83, 83.65));
		cityInformation.put("medford", new CityInformation("medford", 42.33, 122.86));
		cityInformation.put("memphis", new CityInformation("memphis", 35.12, 89.97));
		cityInformation.put("mexia", new CityInformation("mexia", 31.68, 96.48));
		cityInformation.put("mexico", new CityInformation("mexico", 19.40, 99.12));
		cityInformation.put("miami", new CityInformation("miami", 25.79, 80.22));
		cityInformation.put("midland", new CityInformation("midland", 43.62, 84.23));
		cityInformation.put("milwaukee", new CityInformation("milwaukee", 43.05, 87.96));
		cityInformation.put("minneapolis", new CityInformation("minneapolis", 44.96, 93.27));
		cityInformation.put("modesto", new CityInformation("modesto", 37.66, 120.99));
		cityInformation.put("montreal", new CityInformation("montreal", 45.50, 73.67));
		cityInformation.put("nashville", new CityInformation("nashville", 36.15, 86.76));
		cityInformation.put("newHaven", new CityInformation("newHaven", 41.31, 72.92));
		cityInformation.put("newOrleans", new CityInformation("newOrleans", 29.97, 90.06));
		cityInformation.put("newYork", new CityInformation("newYork", 40.70, 73.92));
		cityInformation.put("norfolk", new CityInformation("norfolk", 36.89, 76.26));
		cityInformation.put("oakland", new CityInformation("oakland", 37.80, 122.23));
		cityInformation.put("oklahomaCity", new CityInformation("oklahomaCity", 35.48, 97.53));
		cityInformation.put("omaha", new CityInformation("omaha", 41.26, 96.01));
		cityInformation.put("orlando", new CityInformation("orlando", 28.53, 81.38));
		cityInformation.put("ottawa", new CityInformation("ottawa", 45.42, 75.69));
		cityInformation.put("pensacola", new CityInformation("pensacola", 30.44, 87.21));
		cityInformation.put("philadelphia", new CityInformation("philadelphia", 40.72, 76.12));
		cityInformation.put("phoenix", new CityInformation("phoenix", 33.53, 112.08));
		cityInformation.put("pittsburgh", new CityInformation("pittsburgh", 40.40, 79.84));
		cityInformation.put("pointReyes", new CityInformation("pointReyes", 38.07, 122.81));
		cityInformation.put("portland", new CityInformation("portland", 45.52, 122.64));
		cityInformation.put("providence", new CityInformation("providence", 41.80, 71.36));
		cityInformation.put("provo", new CityInformation("provo", 40.24, 111.66));
		cityInformation.put("raleigh", new CityInformation("raleigh", 35.82, 78.64));
		cityInformation.put("redding", new CityInformation("redding", 40.58, 122.37));
		cityInformation.put("reno", new CityInformation("reno", 39.53, 119.82));
		cityInformation.put("richmond", new CityInformation("richmond", 37.54, 77.46));
		cityInformation.put("rochester", new CityInformation("rochester", 43.17, 77.61));
		cityInformation.put("sacramento", new CityInformation("sacramento", 38.56, 121.47));
		cityInformation.put("salem", new CityInformation("salem", 44.93, 123.03));
		cityInformation.put("salinas", new CityInformation("salinas", 36.68, 121.64));
		cityInformation.put("saltLakeCity", new CityInformation("saltLakeCity", 40.75, 111.89));
		cityInformation.put("sanAntonio", new CityInformation("sanAntonio", 29.45, 98.51));
		cityInformation.put("sanDiego", new CityInformation("sanDiego", 32.78, 117.15));
		cityInformation.put("sanFrancisco", new CityInformation("sanFrancisco", 37.76, 122.44));
		cityInformation.put("sanJose", new CityInformation("sanJose", 37.30, 121.87));
		cityInformation.put("sanLuisObispo", new CityInformation("sanLuisObispo", 35.27, 120.66));
		cityInformation.put("santaFe", new CityInformation("santaFe", 35.67, 105.96));
		cityInformation.put("saultSteMarie", new CityInformation("saultSteMarie", 46.49, 84.35));
		cityInformation.put("savannah", new CityInformation("savannah", 32.05, 81.10));
		cityInformation.put("seattle", new CityInformation("seattle", 47.63, 122.33));
		cityInformation.put("stLouis", new CityInformation("stLouis", 38.63, 90.24));
		cityInformation.put("stamford", new CityInformation("stamford", 41.07, 73.54));
		cityInformation.put("stockton", new CityInformation("stockton", 37.98, 121.30));
		cityInformation.put("tallahassee", new CityInformation("tallahassee", 30.45, 84.27));
		cityInformation.put("tampa", new CityInformation("tampa", 27.97, 82.46));
		cityInformation.put("thunderBay", new CityInformation("thunderBay", 48.38, 89.25));
		cityInformation.put("toledo", new CityInformation("toledo", 41.67, 83.58));
		cityInformation.put("toronto", new CityInformation("toronto", 43.65, 79.38));
		cityInformation.put("tucson", new CityInformation("tucson", 32.21, 110.92));
		cityInformation.put("tulsa", new CityInformation("tulsa", 36.13, 95.94));
		cityInformation.put("uk1", new CityInformation("uk1", 51.30, 0.00));
		cityInformation.put("uk2", new CityInformation("uk2", 51.30, 0.00));
		cityInformation.put("vancouver", new CityInformation("vancouver", 49.25, 123.10));
		cityInformation.put("washington", new CityInformation("washington", 38.91, 77.01));
		cityInformation.put("westPalmBeach", new CityInformation("westPalmBeach", 26.71, 80.05));
		cityInformation.put("wichita", new CityInformation("wichita", 37.69, 97.34));
		cityInformation.put("winnipeg", new CityInformation("winnipeg", 49.90, 97.13));
		cityInformation.put("yuma", new CityInformation("yuma", 32.69, 114.62));

		return cityInformation;

	}
}
