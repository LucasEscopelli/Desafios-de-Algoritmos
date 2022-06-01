package classe;

import javax.swing.JOptionPane;

public class Testando {
	public static void main(String[] args) {
		int contactServerEntry = JOptionPane.showConfirmDialog(null,
                "Is the contact server up", "Please select",
                JOptionPane.YES_NO_OPTION);
		
		System.out.println(contactServerEntry);
		
	}
}
