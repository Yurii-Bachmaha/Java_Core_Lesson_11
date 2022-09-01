package task02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Enter 1 to display array elements.");
		System.out.println("Enter 2 to set a single object of class auto for all objects of this array.");
	}

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(5);
		int b = random.nextInt(5);
		Auto[][] auto = new Auto[a][b];
		String[] TypeOfMaterial = { "leather", "plastic", "alcantara", "wood" };

		while (true) {
			Scanner sc = new Scanner(System.in);
			menu();

			switch (sc.next()) {

			case "1": {

				for (int c = 0; c < a; c++) {
					for (int d = 0; d < b; d++) {
						auto[c][d] = new Auto(random.nextInt(100, 300), (random.nextInt(1980, 2022)),
									 new Engine(random.nextInt(2, 8)), 
									 new SteeringWheel(random.nextDouble(14, 16),TypeOfMaterial[random.nextInt(TypeOfMaterial.length)]));
					}
				}
				System.out.println(Arrays.deepToString(auto) + "\n");

				break;
			}

			case "2": {

				Auto autoArray = new Auto(random.nextInt(100, 300), (random.nextInt(1980, 2022)),
								 new Engine(random.nextInt(2, 8)), 
								 new SteeringWheel(random.nextDouble(14, 16),TypeOfMaterial[random.nextInt(TypeOfMaterial.length)]));

				for (Auto[] autoB : auto) {
					Arrays.fill(autoB, autoArray);
				}

				System.out.println(Arrays.deepToString(auto));
				break;
			}
			
			default:{
				System.err.println("Enter 1 or 2");
			}
			}
		}
	}
}