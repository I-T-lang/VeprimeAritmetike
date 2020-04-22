import javax.swing.JOptionPane;
	import java.util.Scanner;
public class Siperfaqja {
	
	public static void main(String[] args) {
		String EmriInput=JOptionPane.showInputDialog("Emri: ");
		String LartesiaInput=JOptionPane.showInputDialog("Lartesia e Trekendeshit:");
		String BazaInput=JOptionPane.showInputDialog("Baza e Trekendeshit:");
		
		
		
		double Lartesi = Double.parseDouble(LartesiaInput);
		double Baza = Double.parseDouble(BazaInput);
		double Siperfaqja;
		
		Siperfaqja = (Lartesi * Baza) / 2;
		
		
		String mesazhi = 
				"\nEmri: " + EmriInput +
				"\nLartesia: " + Lartesi +
				"\nBaza: " + Baza +
				"\nSiperfaqja: " + Siperfaqja ;
		        JOptionPane.showMessageDialog(null, mesazhi);
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Emri: ");
		String emri = input.nextLine();
		System.out.println("Lartesia: ");
		double Lartesia = input.nextDouble();
		System.out.println("Baza: ");
		double Baza1 = input.nextDouble();
		double Siperfaqja1;
		Siperfaqja = (Lartesia * Baza1)/2;
		
		String mesazhi1 = 
				"\nSiperfaqja: " + Siperfaqja ;
				 
				System.out.println(mesazhi1);


	}
}
