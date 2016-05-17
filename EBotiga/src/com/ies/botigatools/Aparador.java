package com.ies.botigatools;
import java.util.Collections;
import java.util.LinkedList;

public class Aparador {
	
	//Se instancian objetos de tipo Artículo
	private LinkedList <Article> cataleg = new LinkedList<Article>() ;
	
	//Se crea el método addArticle con los datos necesarios para crear un articulo (nom, preu..)
	//y se añaden al catálogo
	public void addArticle(String id, String nom, String preu, String qty) {
	Article art = new Article(id, nom, preu, qty);
	cataleg.add(art);
	}
	//posición del vector 
	public Article getArticle(int i) {
	return (Article) cataleg.get(i);
	}
	//tamaño del catálogo
	public int getSize() {
	return cataleg.size( ) ;
	}
	public void sort() {
	Collections.sort(cataleg) ;
	}
	//La classe LinkedList implementa una llista enllaçada pertanyent a la List Interface
	//de Java. Cada objecte serà un objecte de la classe Articles
}
	

