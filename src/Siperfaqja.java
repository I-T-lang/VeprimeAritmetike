import javax.swing.JOptionPane;
import java.util.Scanner;

public class Siperfaqja {

	private static Scanner input;

	public static void main(String[] args) {
		String emriInput = JOptionPane.showInputDialog("Emri: ");
		String lartesiaInput = JOptionPane.showInputDialog("Lartesia e Trekendeshit:");
		String bazaInput = JOptionPane.showInputDialog("Baza e Trekendeshit:");

		double lartesi = Double.parseDouble(lartesiaInput);
		double baze = Double.parseDouble(bazaInput);
		double siperfaqe;

		siperfaqe = (lartesi * baze) / 2;

		String mesazh = "\nEmri: " + emriInput + "\nLartesia: " + lartesi + "\nBaza: " + baze + "\nSiperfaqja: "
				+ siperfaqe;
		JOptionPane.showMessageDialog(null, mesazh);

		try {
			input = new Scanner(System.in);
			System.out.println("Emri: ");
			String emri = input.nextLine();
			System.out.println("Lartesia: ");

			while (!input.hasNextDouble()) {
				System.out.println("Ju lutem vendosni nje numer");
				input.nextLine();
			}
			lartesi = input.nextDouble();

			System.out.println("Baza: ");

			while (!input.hasNextDouble()) {
				System.out.println("Ju lutem vendosni nje numer");
				input.nextLine();

			}

			baze = input.nextDouble();

			siperfaqe = (lartesi * baze) / 2;

			mesazh = "\nEmri: " + emriInput + "\nLartesia: " + lartesi + "\nBaza: " + baze + "\nSiperfaqja: "
					+ siperfaqe;
			System.out.println(mesazh);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
