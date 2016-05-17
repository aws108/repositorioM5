package com.ies.botigatools;
import java.util.Collections;
import java.util.LinkedList;

public class Aparador {
	
	//Se instancian objetos de tipo Art�culo
	private LinkedList <Article> cataleg = new LinkedList<Article>() ;
	
	//Se crea el m�todo addArticle con los datos necesarios para crear un articulo (nom, preu..)
	//y se a�aden al cat�logo
	public void addArticle(String id, String nom, String preu, String qty) {
	Article art = new Article(id, nom, preu, qty);
	cataleg.add(art);
	}
	//posici�n del vector 
	public Article getArticle(int i) {
	return (Article) cataleg.get(i);
	}
	//tama�o del cat�logo
	public int getSize() {
	return cataleg.size( ) ;
	}
	public void sort() {
	Collections.sort(cataleg) ;
	}
	//La classe LinkedList implementa una llista enlla�ada pertanyent a la List Interface
	//de Java. Cada objecte ser� un objecte de la classe Articles
}
	

