import java.util.ArrayList;
import java.util.Scanner;

public class JobsiteInfo {
	
	public static double StuccoCement(double stuccoSqft) {
		final double bagCement = 12.5;
		double totalBags;
		
		totalBags = stuccoSqft / bagCement;
		return totalBags;
	}
	
	public static double StuccoFinish(double stuccoSqft) {
		final double bagFinish = 50.0;
		double totalFinish;
		
		totalFinish = stuccoSqft / bagFinish;
		return totalFinish;
	}


	
	public static void main(String[] args) {
		
		ArrayList<Double> richCrest = new ArrayList<Double>();
		
		richCrest.add((double) 12200);
		richCrest.add((double) 15600);
		richCrest.add((double) 13800);
		richCrest.add((double) 12200);
		
		
		
		Scanner scnr = new Scanner(System.in);
		double fieldMeasure = 0.0;
		int buildNumber = 0;
		
		System.out.println("What building Number?");
		buildNumber = scnr.nextInt();
		
		while (buildNumber > 4) {
			System.out.println("Invalid Number");
			System.out.println("What building Number?");
			buildNumber = scnr.nextInt();
			
		}
		
		System.out.println("How much stucco has been measured?");
		fieldMeasure = scnr.nextDouble();
		
		
		double stuccoLeft = (richCrest.get((int) (buildNumber - 1)) - fieldMeasure);
		
		System.out.println("There is " + stuccoLeft + " square feet of stucco left.");
		System.out.println("There is "  + StuccoCement(stuccoLeft) + " bags of scratch and brown still needed.");
	
	}

}
