import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(5);
		String input;
		do {
			input = JOptionPane.showInputDialog(null,
					"Digite +(nome), -(nome) ou L para listar, ou cancelar para sair");
			if (input != null) {
				if (input.charAt(0) == 'L') {
					System.out.println("Listar");
					Collections.sort(ar);
					int count = 1;
					for (String s : ar) {
						System.out.println(count + ". " + s);
						count++;
					}
				}
				if (input.charAt(0) == '+') {
					System.out.println("Adicionar");
					ar.add(input.substring(1));
				}
				if (input.charAt(0) == '-') {
					System.out.println("Remover");
					ar.remove(input.substring(1));
				}
			}
		} while (input != null);
		System.out.println("Obrigado por usar nosso software");
	}
}
