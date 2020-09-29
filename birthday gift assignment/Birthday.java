import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Birthday {
	public static void main (String[] args) {
		
		System.out.println("Birthday Gifts");
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children.");
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		double totalCost = 0;
		boolean flag = true;
		
		do {
			boolean cancelRequest = false;
			
			String name = JOptionPane.showInputDialog(null, "What is the child's name?");
			String ageString = JOptionPane.showInputDialog(null, "How old is the child?");
			String toy = JOptionPane.showInputDialog(null, "Choose one toy: Plushie, Blocks, or Book");
			
			int age = Integer.parseInt(ageString);
			
			Toy a = new Toy(toy, age);
			
			if (a.ageOK() == false) {
				String ageNotOK = JOptionPane.showInputDialog(null, "This toy is not age-appropriate. Do you want to cancel the request? (Yes or No)");
				if (ageNotOK.equalsIgnoreCase("yes")) {
					cancelRequest = true;
				}
			}
			if (cancelRequest == false) {
				String card = JOptionPane.showInputDialog(null, "Would you like a card with the toy? (Yes or No)");
				a.addCard(card);
				
				String Balloon = JOptionPane.showInputDialog(null, "Would you like a balloon with the toy? (Yes or No)");
				a.addBalloon(Balloon);
				
				double cost = a.getCost();
				
				JOptionPane.showMessageDialog(null, a.toString());
				
				totalCost += cost;
				
				String secondtoy = JOptionPane.showInputDialog(null, "Do you want another toy? (Yes or No)");
				if (secondtoy.equalsIgnoreCase("no")) {
					flag = false;
				
				}
				
			}
			
		} while (flag == true);
		
		int orderNumber = (int)((Math.random() * 90000) + 10000);
		
		JOptionPane.showMessageDialog(null, "They total cost of your order is $" + dollar.format(totalCost) + " (Order Number: " + orderNumber + "\nProgrammer Name: Aelina Pogosian");
	}
}
