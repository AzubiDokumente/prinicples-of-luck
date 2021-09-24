package wiederholung;

import javax.swing.JOptionPane;

public class caseConverter {

	public static void main(String[] args) {
		
		String vName = JOptionPane.showInputDialog("Eingabe vorname");
		String nName = JOptionPane.showInputDialog("Nachname");
		String upperCaseName = "";
		String zeich;
		String zuName = "";
		ausgabe(nName + ", " + vName);
		
		ausgabe("Länge des Vornames: " + vName.length());
		
		
		for(int y = 0; y < nName.length(); y++) {
			if(y < 3) {
				zuName = zuName + nName.charAt(y);
			}
		}
		for(int i = 0; i < vName.length(); i++) {
			if(i >= vName.length() - 3) {
				zuName = zuName + vName.charAt(i);
			}
		}
		
		ausgabe(zuName);
	
		
		for(int i = 0; i < vName.length(); i++) {
			char c = vName.charAt(i);
			zeich = Character.toString(c);
			zeich = zeich.toUpperCase();
			
			upperCaseName = upperCaseName + zeich + " ";
			
		}

		ausgabe(upperCaseName);
		
		
		
		
	}
	
	public static void ausgabe(String a) {
		System.out.println(a);
	}

}
