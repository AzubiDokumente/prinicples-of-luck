package wiederholung;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class stringCounter {
	
	 private static List chars = new ArrayList<>();

	    public static void main(String[] args) {
	       
	        printCountOfDuplicateCharacter(JOptionPane.showInputDialog("Text eingebne"));
	    

	    }

	    private static void printCountOfDuplicateCharacter(String input) {

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (isProcessedChar(ch))
	                continue;

	            int count = 0;
	            for (int j = 0; j < input.length(); j++) {
	                if (ch == input.charAt(j)) {
	                    count++;
	                }
	            }
	            System.out.println(ch + " : " + count);
	        }
	        chars.clear();
	    }

	    private static boolean isProcessedChar(char ch) {

	        if (chars.contains(Character.toString(ch))) {
	            return true;
	        } else {
	            chars.add(Character.toString(ch));
	        }
	        return false;
	    }

}
