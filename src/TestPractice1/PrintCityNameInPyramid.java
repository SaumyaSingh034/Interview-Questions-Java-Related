package TestPractice1;

public class PrintCityNameInPyramid {
	/*
	 * Bangalore Banaglore Delhi Bangaalore Delhi Maharata
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String[] cityName = { "Delhi", "Mumbai", "Pune", "Bangalore", "Chennai", "Hyderabad" };
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(cityName[j]+"  ");
			}
			System.out.println();
		}

	}
}