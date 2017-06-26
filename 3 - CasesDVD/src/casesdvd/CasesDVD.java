
package casesdvd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;


public class CasesDVD {

    
    public static void main(String[] args) {
        ArrayList<DVD> colecao = new ArrayList<DVD>();
        String input, titulo, genero, tituloAlterar;
        int escolha = -1;
        
        do {
            input = JOptionPane.showInputDialog(null, "[I]ncluir, [A]lterar, [E]xcluir, [LT]Listar Titulo, [LG]Listar Genero, [LC]Listar Caixa");
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
                    
                    if(colecao.size() < 25){
                        colecao.add(new DVD(titulo, genero, colecao.size() / 5));
                    }else{
                        JOptionPane.showMessageDialog(null, "Não há mais caixas disponíveis");
                    }
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
                if ("LC".equals(input)){
                    ArrayList<DVD> caixa0 = new ArrayList<DVD>();
                    ArrayList<DVD> caixa1 = new ArrayList<DVD>();
                    ArrayList<DVD> caixa2 = new ArrayList<DVD>();
                    ArrayList<DVD> caixa3 = new ArrayList<DVD>();
                    ArrayList<DVD> caixa4 = new ArrayList<DVD>();
                    
                    Map<Integer, ArrayList<DVD> > caixas = new TreeMap<Integer, ArrayList<DVD>>();
                    
                    for(DVD d : colecao){
                        if( d.numeroCaixa == 0 ){
                            caixa0.add(d);
                        }                        
                        if( d.numeroCaixa == 1 ){
                            caixa1.add(d);
                        }
                        if( d.numeroCaixa == 2 ){
                            caixa2.add(d);
                        }
                        if( d.numeroCaixa == 3 ){
                            caixa3.add(d);
                        }
                        if( d.numeroCaixa == 4 ){
                            caixa4.add(d);
                        }
                        
                    }
                    
                    caixas.put(0, caixa0);
                    caixas.put(1, caixa1);
                    caixas.put(2, caixa2);
                    caixas.put(3, caixa3);
                    caixas.put(4, caixa4);                    
                    
                    boolean continua = true;
                    do{
                        int caixa;
                        caixa = (Integer.parseInt(JOptionPane.showInputDialog(null, "Qual caixa deseja consultar?\n 1 , 2 , 3 , 4 , 5")))-1;
                        
                        switch(caixa){
                            case 0:
                                for(DVD d : caixas.get(0)){
                                    System.out.println(d.titulo+" - "+d.genero);
                                }
                                
                                continua = false;
                                break;
                            case 1:
                                for(DVD d : caixas.get(1)){
                                    System.out.println(d.titulo+" - "+d.genero);
                                }
                                
                                continua = false;
                                break;
                            case 2:
                                for(DVD d : caixas.get(2)){
                                    System.out.println(d.titulo+" - "+d.genero);
                                }
                                continua = false;
                                break;
                            case 3:
                                for(DVD d : caixas.get(3)){
                                    System.out.println(d.titulo+" - "+d.genero);
                                }
                                continua = false;
                                break;
                            case 4:
                                for(DVD d : caixas.get(4)){
                                    System.out.println(d.titulo+" - "+d.genero);
                                }
                                continua = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Caixa não existente");
                        }
                        
                        
                    }while(continua);
                }
            }
        } while (input != null);
        System.out.println("Obrigado por utilizar nosso software!");
    }
    
}
