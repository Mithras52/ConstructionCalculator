import java.util.Scanner;

public class StuccoMaterials {

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
		Scanner scnr = new Scanner(System.in);
		double totalStucco;
		
		System.out.println("How much stucco is on the building?");
		totalStucco = scnr.nextDouble();
		
		System.out.println("You will need " + StuccoCement(totalStucco) + " 80lb bags.");
		System.out.println("The finish coat will require " + StuccoFinish(totalStucco) + " bags.");
	}		

}


