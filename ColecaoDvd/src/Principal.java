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
					titulo = JOptionPane.showInputDialog(null,"Qual título?");
					genero = JOptionPane.showInputDialog(null,"Qual genero? Ação,Animação,Aventura,Chanchada,Cinema catástrofe,Comédia,Comédia romântica,\nComédia dramática,Comédia de ação,Cult,Dança,Documentários,Drama,Espionagem,Erótico,Fantasia,Faroeste (ou western),\nFicção científica,Franchise/Séries,Guerra,Machinima,Masala,Musical,Filme noir,Policial,\nPornochanchada,Pornográfico,Romance,Seriado,Suspense,Terror,Trash");
					colecao.add(new DVD(titulo,genero,colecao.size()/5));
				}
				if ("A".equals(input)) {
					tituloAlterar = JOptionPane.showInputDialog(null,"Qual título que deseja alterar?");
					titulo = JOptionPane.showInputDialog(null,"Qual novo título?");
					genero = JOptionPane.showInputDialog(null,"Qual genero? Ação,Animação,Aventura,Chanchada,Cinema catástrofe,Comédia,Comédia romântica,\nComédia dramática,Comédia de ação,Cult,Dança,Documentários,Drama,Espionagem,Erótico,Fantasia,Faroeste (ou western),\nFicção científica,Franchise/Séries,Guerra,Machinima,Masala,Musical,Filme noir,Policial,\nPornochanchada,Pornográfico,Romance,Seriado,Suspense,Terror,Trash");
					colecao.add(colecao.indexOf(titulo), new DVD(titulo,genero,colecao.indexOf(titulo)/5));
				}
				if ("E".equals(input)) {
					titulo = JOptionPane.showInputDialog(null,"Qual título?");
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

// [ColecaoDVD] Uma pessoa possui uma coletânea de DVDs. Para organiza-la, definiu uma classe DVD com três campos: título, gênero e o número da caixa
// (case de cds/dvds) onde a mídia é guardada. O campo gênero possui um domínio
// de valores possíveis, entre eles Ação, Romance, Ficção, etc. O programa deve apresentar um menu de opções que
// permite incluir, alterar, excluir título, e listar em ordem pelos dois primeiros campos.

//[CasesDVD] Incremente o programa anterior, criando uma nova opção para listar os títulos contidos 
//em uma determinada caixa. Crie uma coleção que, para cada número de caixa, armazene os títulos (DVDs) que estão guardados nela.
//Use uma coleção do tipo Map, que é mais adequada para este caso.