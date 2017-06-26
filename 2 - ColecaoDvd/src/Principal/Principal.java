
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ArrayList<DVD> colecao = new ArrayList<DVD>();
        String input, titulo, genero, tituloAlterar;
        int escolha = -1;
        
        do {
            input = JOptionPane.showInputDialog(null, "[I]ncluir, [A]lterar, [E]xcluir, [LT]Listar Titulo, [LG]Listar Genero");
            if (input != null) {
                if ("I".equals(input)) {
                    titulo = JOptionPane.showInputDialog(null, "Qual título?");
                        boolean continua = true;
                        do{
                            genero = JOptionPane.showInputDialog(null, "Qual genero?\n1 - Ação\n2 - Aventura\n3 - Comédia\n4 - Fantasia");
                            
                            switch(genero){
                                case "1": 
                                    genero = "Ação";                                    
                                    continua = false;
                                    break;
                                case "2":
                                    genero = "Aventura";
                                    continua = false;
                                    break;
                                case "3":
                                    genero = "Comédia";
                                    continua = false;
                                    break;
                                case "4":
                                    genero = "Fantasia";
                                    continua = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Genero não catalogado");
                                    break;
                            }
                        }while(continua);
                    
                    colecao.add(new DVD(titulo, genero, colecao.size() / 5));
                }
                        
                if ("A".equals(input)) {
                    tituloAlterar = JOptionPane.showInputDialog(null, "Qual título que deseja alterar?");
                    
                    titulo = JOptionPane.showInputDialog(null, "Qual novo título?");
                    
                    boolean continua = true;
                        do{
                            genero = JOptionPane.showInputDialog(null, "Qual genero?\n1 - Ação\n2 - Aventura\n3 - Comédia\n4 - Fantasia");
                            System.out.println(genero);
                            switch(genero){
                                case "1": 
                                    genero = "Ação";
                                    System.out.println(genero);
                                    continua = false;
                                    break;
                                case "2":
                                    genero = "Aventura";
                                    continua = false;
                                    break;
                                case "3":
                                    genero = "Comédia";
                                    continua = false;
                                    break;
                                case "4":
                                    genero = "Fantasia";
                                    continua = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Genero não catalogado");
                                    break;
                            }
                        }while(continua);                    
                    
                    int i=0;
                    for(DVD d : colecao){
                        if(d.titulo.equals(tituloAlterar)){
                            colecao.remove(i);
                            break;
                        }
                        i++;
                    }
                    colecao.add(new DVD(titulo, genero, colecao.size() / 5));
                }
                if ("E".equals(input)) {
                    titulo = JOptionPane.showInputDialog(null, "Qual título?");
                    int i = 0;
                    for(DVD d : colecao){
                        if(d.titulo.equals(titulo)){
                            colecao.remove(i);
                            System.out.println(titulo + "Removido");
                            break;
                        }
                        i++;
                    }
                }
                if ("LT".equals(input)) {
                    Collections.sort(colecao);
                    for (DVD a : colecao) {
                        System.out.println(a.titulo);
                    }
                }
                if ("LG".equals(input)) {
                    
                    System.out.println("\nAção:");
                    for (DVD a : colecao) {
                        if("Ação".equals(a.genero)) System.out.println(a.titulo);
                    }
                    
                    System.out.println("\nAventura:");
                    for (DVD a : colecao) {
                        if("Aventura".equals(a.genero)) System.out.println(a.titulo);
                    }
                    
                    System.out.println("\nComédia:");
                    for (DVD a : colecao) {
                        if("Comédia".equals(a.genero)) System.out.println(a.titulo);
                    }
                    
                    System.out.println("\nFantasia:");
                    for (DVD a : colecao) {
                        if("Fantasia".equals(a.genero)) System.out.println(a.titulo);
                    }
                    
                }                
            }
        } while (input != null);
        System.out.println("Obrigado por utilizar nosso software!");
    }
}