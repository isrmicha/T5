
public class DVD implements Comparable<DVD> {
	String titulo,genero;
	int numeroCaixa;
	public DVD(String titulo, String genero, int numeroCaixa){
		this.titulo = titulo;
		this.genero = genero;
		this.numeroCaixa = numeroCaixa;
	}
        public int compareTo(DVD dvdOutro){
            if(this.titulo.compareTo(dvdOutro.titulo) < 0){
                return -1;
            }
            
            if(this.titulo.compareTo(dvdOutro.titulo) >= 0){
                return 1;
            }
            
            return 0;
        }
}
