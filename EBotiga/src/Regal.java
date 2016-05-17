import com.ies.botigatools.*;
public class Regal {
	
	public static void main(String[] args) {
		
		Aparador magatzem = new Aparador();
		magatzem.addArticle("1" , "SABATES", "99.99" , "350") ;
		magatzem.addArticle("2" , "BOSSA ESPORTIVA", " 51.03" , "123" );
		magatzem.addArticle("3" , "SUADORA", "120.36" , "500") ;
		magatzem.addArticle("4" , "CAMISETA" , "36.25", "40") ;
		magatzem.sort();
		for (int i = 0; i < magatzem.getSize(); i++) {
		Article mostrar = ( Article) magatzem.getArticle(i) ;
		System.out.println( "\nArticulos ID: " + mostrar.getId( ) +
		" \nNombre: " + mostrar.getNom() +
		" \nPrecio Detalle: " + mostrar.getDetall() + " €" +
		" \nPrecio: " + mostrar.getPreu() + " €" +
		" \nCantidad: " + mostrar.getQty() ) ;
		}
		
		
	}
}
