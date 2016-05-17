package com.ies.botigatools;
import java.util.*; 
public class Article implements Comparable {
	
	//Atributos
	private String id;
	private String nom;
	private double detall;
	private int qty;
	private double preu;
	
		//Getters
	public String getId(){
		return this.id;
	}
	public String getNom(){
		return this.nom;
	}
	public double getDetall(){
		return this.detall;
	}
	public int getQty(){
		return this.qty;
	}
	public double getPreu(){
		return this.preu;
	}
	
	//compareTo(). Ens servirà per comparar dos objectes
	public int compareTo(Object obj) {
		Article temp= (Article) obj;
		if (this.preu < temp.preu)
		return 1;
		else if (this.preu > temp.preu)
		return -1 ;
		return 0;
		}
	
	//constructor de la classe
	Article(String idIn, String nomIn, String detallIn, String qtyIn) {
		id = idIn; //nombre que le pones al valor para diferenciar del atributo
		nom = nomIn;
		detall = Double.parseDouble(detallIn); //conversión de String a double
		qty = Integer.parseInt(qtyIn);
		if (qty > 400)
		preu = detall*.5D; //0,5 double
		else if (qty > 200)
		preu = detall*.6D;
		else
		preu = detall*.7D;
		preu = Math.floor( preu*100+.5 ) / 100; //floor redondea hacia arriba
		}
	
	
	
}
