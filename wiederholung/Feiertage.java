package wiederholung;

import javax.swing.JOptionPane;

public class Feiertage {

	public static void main(String[] args) {
		
		try {
			String jahr = JOptionPane.showInputDialog("Jahr eingeben");
			int j = Integer.parseInt(jahr);
			
			zellerformel(1,1, j);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}
	
	public static int zellerformel(int )

}
