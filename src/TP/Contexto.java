package TP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Contexto {
	
	public ArrayList<Producto>listaDeProductos = new ArrayList<Producto>();
	
	public void ingresandoProducto() {
		
		listaDeProductos.add(new Bebida("Coca Zero","Bebida",20,1500));
		listaDeProductos.add(new Bebida("Coca","Bebida",18,1500));
		listaDeProductos.add(new Fruta("Frutilla","Fruta",64,"Kilo"));
		listaDeProductos.add(new ArtDeLimpieza("Sedal","ArtDeLimpieza",19,500));
		
	}
	
	public void MostrarLista() {
		for( Producto p: listaDeProductos) {
			System.out.println(p);
		}
	}
	

	public void MostrarMayor() {
		Collections.sort(listaDeProductos, new Comparator<Producto>(){	
			@Override
			public int compare( Producto o1, Producto o2) {
				
				return new Integer(o2.getPrecio()).compareTo(new Integer(o1.getPrecio()));
			}	
		});
	}
}

/*
	MANERAS DE ORDENAR CON EL METODO COLLECTIONS.SORT:
	
 		ArrayList<Integer>lista = new ArrayList<Integer>();
		lista.add(String nombres[]);
		lista.add(34);
		lista.add(78);
		lista.add(8);
		
		1_) Collections.sort(lista);
		
		for (Integer numeroOrdenados : lista) {
			System.out.println(numeroOrdenados);
		}
		
		O ASI: 
		
		2_) lista.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(lista);
	}*/
