import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DVD> colecao = new ArrayList<DVD>();
		String input,titulo,genero,tituloAlterar;
		do {
			input = JOptionPane.showInputDialog(null,"[I]ncluir, [A]lterar, [E]xcluir, [LT]Listar Titulo, [LG]Listar Genero");
			if (input != null) {
				if ("I".equals(input)) {
					titulo = JOptionPane.showInputDialog(null,"Qual t�tulo?");
					genero = JOptionPane.showInputDialog(null,"Qual genero? A��o,Anima��o,Aventura,Chanchada,Cinema cat�strofe,Com�dia,Com�dia rom�ntica,\nCom�dia dram�tica,Com�dia de a��o,Cult,Dan�a,Document�rios,Drama,Espionagem,Er�tico,Fantasia,Faroeste (ou western),\nFic��o cient�fica,Franchise/S�ries,Guerra,Machinima,Masala,Musical,Filme noir,Policial,\nPornochanchada,Pornogr�fico,Romance,Seriado,Suspense,Terror,Trash");
					colecao.add(new DVD(titulo,genero,colecao.size()/5));
				}
				if ("A".equals(input)) {
					tituloAlterar = JOptionPane.showInputDialog(null,"Qual t�tulo que deseja alterar?");
					titulo = JOptionPane.showInputDialog(null,"Qual novo t�tulo?");
					genero = JOptionPane.showInputDialog(null,"Qual genero? A��o,Anima��o,Aventura,Chanchada,Cinema cat�strofe,Com�dia,Com�dia rom�ntica,\nCom�dia dram�tica,Com�dia de a��o,Cult,Dan�a,Document�rios,Drama,Espionagem,Er�tico,Fantasia,Faroeste (ou western),\nFic��o cient�fica,Franchise/S�ries,Guerra,Machinima,Masala,Musical,Filme noir,Policial,\nPornochanchada,Pornogr�fico,Romance,Seriado,Suspense,Terror,Trash");
					colecao.add(colecao.indexOf(titulo), new DVD(titulo,genero,colecao.indexOf(titulo)/5));
				}
				if ("E".equals(input)) {
					titulo = JOptionPane.showInputDialog(null,"Qual t�tulo?");
					colecao.remove(colecao.indexOf(titulo));
					System.out.println(titulo + "Removido");
				}
				if ("LT".equals(input)) {
					for(DVD a : colecao){
						System.out.println(a.titulo);
					}
				}
				if ("LG".equals(input)) {
					for(DVD a : colecao){
						System.out.println(a.genero);
					}
				}
			}
		} while (input != null);
		System.out.println("Obrigado por utilizar nosso software!");
	}
}

// [ColecaoDVD] Uma pessoa possui uma colet�nea de DVDs. Para organiza-la, definiu uma classe DVD com tr�s campos: t�tulo, g�nero e o n�mero da caixa
// (case de cds/dvds) onde a m�dia � guardada. O campo g�nero possui um dom�nio
// de valores poss�veis, entre eles A��o, Romance, Fic��o, etc. O programa deve apresentar um menu de op��es que
// permite incluir, alterar, excluir t�tulo, e listar em ordem pelos dois primeiros campos.

//[CasesDVD] Incremente o programa anterior, criando uma nova op��o para listar os t�tulos contidos 
//em uma determinada caixa. Crie uma cole��o que, para cada n�mero de caixa, armazene os t�tulos (DVDs) que est�o guardados nela.
//Use uma cole��o do tipo Map, que � mais adequada para este caso.