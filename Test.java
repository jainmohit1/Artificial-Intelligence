
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String test = "city(albanyGA,        31.58,  84.17).\n" + "city(albanyNY,        42.66,  73.78).\n"
//				+ "city(albuquerque,     35.11, 106.61).\n" + "city(atlanta,         33.76,  84.40).\n"
//				+ "city(augusta,         33.43,  82.02).\n" + "city(austin,          30.30,  97.75).\n"
//				+ "city(bakersfield,     35.36, 119.03).\n" + "city(baltimore,       39.31,  76.62).\n"
//				+ "city(batonRouge,      30.46,  91.14).\n" + "city(beaumont,        30.08,  94.13).\n"
//				+ "city(boise,           43.61, 116.24).\n" + "city(boston,          42.32,  71.09).\n"
//				+ "city(buffalo,         42.90,  78.85).\n" + "city(calgary,         51.00, 114.00).\n"
//				+ "city(charlotte,       35.21,  80.83).\n" + "city(chattanooga,     35.05,  85.27).\n"
//				+ "city(chicago,         41.84,  87.68).\n" + "city(cincinnati,      39.14,  84.50).\n"
//				+ "city(cleveland,       41.48,  81.67).\n" + "city(coloradoSprings, 38.86, 104.79).\n"
//				+ "city(columbus,        39.99,  82.99).\n" + "city(dallas,          32.80,  96.79).\n"
//				+ "city(dayton,          39.76,  84.20).\n" + "city(daytonaBeach,    29.21,  81.04).\n"
//				+ "city(denver,          39.73, 104.97).\n" + "city(desMoines,       41.59,  93.62).\n"
//				+ "city(elPaso,          31.79, 106.42).\n" + "city(eugene,          44.06, 123.11).\n"
//				+ "city(europe,          48.87,  -2.33).\n" + "city(ftWorth,         32.74,  97.33).\n"
//				+ "city(fresno,          36.78, 119.79).\n" + "city(grandJunction,   39.08, 108.56).\n"
//				+ "city(greenBay,        44.51,  88.02).\n" + "city(greensboro,      36.08,  79.82).\n"
//				+ "city(houston,         29.76,  95.38).\n" + "city(indianapolis,    39.79,  86.15).\n"
//				+ "city(jacksonville,    30.32,  81.66).\n" + "city(japan,           35.68, 220.23).\n"
//				+ "city(kansasCity,      39.08,  94.56).\n" + "city(keyWest,         24.56,  81.78).\n"
//				+ "city(lafayette,       30.21,  92.03).\n" + "city(lakeCity,        30.19,  82.64).\n"
//				+ "city(laredo,          27.52,  99.49).\n" + "city(lasVegas,        36.19, 115.22).\n"
//				+ "city(lincoln,         40.81,  96.68).\n" + "city(littleRock,      34.74,  92.33).\n"
//				+ "city(losAngeles,      34.03, 118.17).\n" + "city(macon,           32.83,  83.65).\n"
//				+ "city(medford,         42.33, 122.86).\n" + "city(memphis,         35.12,  89.97).\n"
//				+ "city(mexia,           31.68,  96.48).\n" + "city(mexico,          19.40,  99.12).\n"
//				+ "city(miami,           25.79,  80.22).\n" + "city(midland,         43.62,  84.23).\n"
//				+ "city(milwaukee,       43.05,  87.96).\n" + "city(minneapolis,     44.96,  93.27).\n"
//				+ "city(modesto,         37.66, 120.99).\n" + "city(montreal,        45.50,  73.67).\n"
//				+ "city(nashville,       36.15,  86.76).\n" + "city(newHaven,        41.31,  72.92).\n"
//				+ "city(newOrleans,      29.97,  90.06).\n" + "city(newYork,         40.70,  73.92).\n"
//				+ "city(norfolk,         36.89,  76.26).\n" + "city(oakland,         37.80, 122.23).\n"
//				+ "city(oklahomaCity,    35.48,  97.53).\n" + "city(omaha,           41.26,  96.01).\n"
//				+ "city(orlando,         28.53,  81.38).\n" + "city(ottawa,          45.42,  75.69).\n"
//				+ "city(pensacola,       30.44,  87.21).\n" + "city(philadelphia,    40.72,  76.12).\n"
//				+ "city(phoenix,         33.53, 112.08).\n" + "city(pittsburgh,      40.40,  79.84).\n"
//				+ "city(pointReyes,      38.07, 122.81).\n" + "city(portland,        45.52, 122.64).\n"
//				+ "city(providence,      41.80,  71.36).\n" + "city(provo,           40.24, 111.66).\n"
//				+ "city(raleigh,         35.82,  78.64).\n" + "city(redding,         40.58, 122.37).\n"
//				+ "city(reno,            39.53, 119.82).\n" + "city(richmond,        37.54,  77.46).\n"
//				+ "city(rochester,       43.17,  77.61).\n" + "city(sacramento,      38.56, 121.47).\n"
//				+ "city(salem,           44.93, 123.03).\n" + "city(salinas,         36.68, 121.64).\n"
//				+ "city(saltLakeCity,    40.75, 111.89).\n" + "city(sanAntonio,      29.45,  98.51).\n"
//				+ "city(sanDiego,        32.78, 117.15).\n" + "city(sanFrancisco,    37.76, 122.44).\n"
//				+ "city(sanJose,         37.30, 121.87).\n" + "city(sanLuisObispo,   35.27, 120.66).\n"
//				+ "city(santaFe,         35.67, 105.96).\n" + "city(saultSteMarie,   46.49,  84.35).\n"
//				+ "city(savannah,        32.05,  81.10).\n" + "city(seattle,         47.63, 122.33).\n"
//				+ "city(stLouis,         38.63,  90.24).\n" + "city(stamford,        41.07,  73.54).\n"
//				+ "city(stockton,        37.98, 121.30).\n" + "city(tallahassee,     30.45,  84.27).\n"
//				+ "city(tampa,           27.97,  82.46).\n" + "city(thunderBay,      48.38,  89.25).\n"
//				+ "city(toledo,          41.67,  83.58).\n" + "city(toronto,         43.65,  79.38).\n"
//				+ "city(tucson,          32.21, 110.92).\n" + "city(tulsa,           36.13,  95.94).\n"
//				+ "city(uk1,             51.30,   0.00).\n" + "city(uk2,             51.30,   0.00).\n"
//				+ "city(vancouver,       49.25, 123.10).\n" + "city(washington,      38.91,  77.01).\n"
//				+ "city(westPalmBeach,   26.71,  80.05).\n" + "city(wichita,         37.69,  97.34).\n"
//				+ "city(winnipeg,        49.90,  97.13).\n" + "city(yuma,            32.69, 114.62).";
//
//		test = test.replace("city", "");
//		test = test.replace(" ", "");
//		test = test.replace(").", "");
//		test = test.replace("(", "");
//		test = test.replace(").", "");
////		test = test.replace("\\^", "\\$\\$\\$\\$");
//		String testArray[] = test.split("\\n");
//		// test = test.replaceFirst(",", "\",");
//		for (int i = 0; i < testArray.length; i++) {
//			testArray[i] = testArray[i].replaceFirst(",", "\",");
//			String testArray2[] = testArray[i].split("\",");
//			// System.out.println(testArray2[0].toString());
//
//			System.out.println("cityInformation.put(\"" + testArray2[0].toString() + "\",new CityInformation(\""
//					+ testArray[i] + "));");
//		}
//		// System.out.println(test);

		String nodeInfo = "road(albanyNY, montreal, 226). road(albanyNY, boston, 166). road(albanyNY, rochester, 148).\n"
				+ "road(albanyGA, tallahassee, 120). road(albanyGA, macon, 106).\n"
				+ "road(albuquerque, elPaso, 267).  road(albuquerque, santaFe, 61).\n"
				+ "road(atlanta, macon, 82). road(atlanta, chattanooga, 117).\n"
				+ "road(augusta, charlotte, 161).  road(augusta, savannah, 131).\n"
				+ "road(austin, houston, 186).  road(austin, sanAntonio, 79).\n"
				+ "road(bakersfield, losAngeles, 112).  road(bakersfield, fresno, 107).\n"
				+ "road(baltimore, philadelphia, 102).  road(baltimore, washington, 45).\n"
				+ "road(batonRouge, lafayette, 50).  road(batonRouge, newOrleans, 80).\n"
				+ "road(beaumont, houston, 69).  road(beaumont, lafayette, 122).\n"
				+ "road(boise, saltLakeCity, 349). road(boise, portland, 428).\n" + "road(boston, providence, 51).\n"
				+ "road(buffalo, toronto, 105). road(buffalo, rochester, 64).  road(buffalo, cleveland, 191).\n"
				+ "road(calgary, vancouver, 605).  road(calgary, winnipeg, 829).\n"
				+ "road(charlotte, greensboro, 91).\n" + "road(chattanooga, nashville, 129).\n"
				+ "road(chicago, milwaukee, 90).  road(chicago, midland, 279).\n"
				+ "road(cincinnati, indianapolis, 110).  road(cincinnati, dayton, 56).\n"
				+ "road(cleveland, pittsburgh, 157).  road(cleveland, columbus, 142).\n"
				+ "road(coloradoSprings, denver, 70).  road(coloradoSprings, santaFe, 316).\n"
				+ "road(columbus, dayton, 72).\n" + "road(dallas, denver, 792).  road(dallas, mexia, 83).\n"
				+ "road(daytonaBeach, jacksonville, 92).  road(daytonaBeach, orlando, 54).\n"
				+ "road(denver, wichita, 523).  road(denver, grandJunction, 246).\n"
				+ "road(desMoines, omaha, 135).  road(desMoines, minneapolis, 246).\n"
				+ "road(elPaso, sanAntonio, 580). road(elPaso, tucson, 320).\n"
				+ "road(eugene, salem, 63).  road(eugene, medford, 165).\n" + "road(europe, philadelphia, 3939).\n"
				+ "road(ftWorth, oklahomaCity, 209).\n" + "road(fresno, modesto, 109).\n"
				+ "road(grandJunction, provo, 220).\n"
				+ "road(greenBay, minneapolis, 304). road(greenBay, milwaukee, 117).\n"
				+ "road(greensboro, raleigh, 74).\n" + "road(houston, mexia, 165).\n"
				+ "road(indianapolis, stLouis, 246).\n"
				+ "road(jacksonville, savannah, 140).  road(jacksonville, lakeCity, 113).\n"
				+ "road(japan, pointReyes, 5131).  road(japan, sanLuisObispo, 5451).\n"
				+ "road(kansasCity, tulsa, 249).  road(kansasCity, stLouis, 256). road(kansasCity, wichita, 190).\n"
				+ "road(keyWest, tampa, 446).\n" + "road(lakeCity, tampa, 169).  road(lakeCity, tallahassee, 104).\n"
				+ "road(laredo, sanAntonio, 154). road(laredo, mexico, 741).\n"
				+ "road(lasVegas, losAngeles, 275).  road(lasVegas, saltLakeCity, 486).\n"
				+ "road(lincoln, wichita, 277).  road(lincoln, omaha, 58).\n"
				+ "road(littleRock, memphis, 137). road(littleRock, tulsa, 276).\n"
				+ "road(losAngeles, sanDiego, 124).  road(losAngeles, sanLuisObispo, 182).\n"
				+ "road(medford, redding, 150).\n" + "road(memphis, nashville, 210).\n"
				+ "road(miami, westPalmBeach, 67).\n" + "road(midland, toledo, 82).\n"
				+ "road(minneapolis, winnipeg, 463).\n" + "road(modesto, stockton, 29).\n"
				+ "road(montreal, ottawa, 132).\n" + "road(newHaven, providence, 110).  road(newHaven, stamford, 92).\n"
				+ "road(newOrleans, pensacola, 268).\n" + "road(newYork, philadelphia, 101).\n"
				+ "road(norfolk, richmond, 92).  road(norfolk, raleigh, 174).\n"
				+ "road(oakland, sanFrancisco, 8). road(oakland, sanJose, 42).\n" + "road(oklahomaCity, tulsa, 105).\n"
				+ "road(orlando, westPalmBeach, 168). road(orlando, tampa, 84).\n" + "road(ottawa, toronto, 269).\n"
				+ "road(pensacola, tallahassee, 120).\n"
				+ "road(philadelphia, pittsburgh, 319). road(philadelphia, newYork, 101). road(philadelphia, uk1, 3548).\n"
				+ "road(philadelphia, uk2, 3548).\n" + "road(phoenix, tucson, 117).  road(phoenix, yuma, 178).\n"
				+ "road(pointReyes, redding, 215).  road(pointReyes, sacramento, 115).\n"
				+ "road(portland, seattle, 174).  road(portland, salem, 47).\n"
				+ "road(reno, saltLakeCity, 520).  road(reno, sacramento, 133).\n"
				+ "road(richmond, washington, 105).\n"
				+ "road(sacramento, sanFrancisco, 95).  road(sacramento, stockton, 51).\n"
				+ "road(salinas, sanJose, 31).  road(salinas, sanLuisObispo, 137).\n" + "road(sanDiego, yuma, 172).\n"
				+ "road(saultSteMarie, thunderBay, 442).  road(saultSteMarie, toronto, 436).\n"
				+ "road(seattle, vancouver, 115).\n" + "road(thunderBay, winnipeg, 440).";
		nodeInfo = nodeInfo.replace(" ", "");
		nodeInfo = nodeInfo.replace("(", "(\"");

		// System.out.println(nodeInfo);
		String testArray1[] = nodeInfo.split("\\.");
		// test = test.replaceFirst(",", "\",");
		for (int i = 0; i < testArray1.length; i++) {
			// testArray[i] = testArray[i].replaceFirst("\\(", "\\(\"");
			// String testArray2[] = testArray[i].split("\",");
			// System.out.println(testArray2[0].toString());
			testArray1[i] = testArray1[i].replaceFirst(",", "\",\"");
			StringBuilder tr = new StringBuilder();
			tr.append(testArray1[i]);
			// System.out.println(tr.toString());
			String new1 = tr.reverse().toString();
			// System.out.println(new1);
			new1 = new1.replaceFirst(",", ",\"");
			// System.out.println(new1);
			StringBuilder tr1 = new StringBuilder();
			testArray1[i] = tr1.append(new1).reverse().toString();
//parseGraphInformation
			testArray1[i] = testArray1[i].replaceFirst("road", "parseGraphInformation");
			testArray1[i] = testArray1[i].replaceFirst("\\)", ",graphInformation\\);");
			// testArray1[i] = testArray1[i].replaceFirst(",", ",\"");
			System.out.println(testArray1[i]);
		}

	}

}
