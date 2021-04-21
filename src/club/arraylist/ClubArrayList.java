package club.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import club.Club;

public class ClubArrayList {

	private static ArrayList<Club> al= new ArrayList<Club>();
	
	static Club club1= new Club("127","Sestao","Av/Pintor nº5 5D","sestao@sestao.com","942568714", (short)2000);
	static Club club2= new Club("128","Santurtzi","Av/Lekuona nº8 7D","santurtzi@santurtzi.com","942563287", (short)1981);
	static Club club3= new Club("129","Bermeo","Av/Iturri nº25 9I","bermeo@bermeo.com","945236147", (short)1998);
	static Club club4= new Club("130","Getxo","Av/Sancho nº7 1B","getxo@getxo.com","948564106", (short)2015);
	
	public void addItems() {
		al.add(club1);
		al.add(club2);
		al.add(club3);
		al.add(club4);
		
	}
	
	public void recorrer() {
		
		Iterator<Club> recor=al.iterator();
		
		while(recor.hasNext()) {
			club1=recor.next();
			System.out.println(club1.getNombre()
					+","+club1.getCodigo()+","+club1.getAnyofundacion()
					+","+club1.getTelefono()+","+club1.getMail()
					+","+club1.getSedeSocial());
		}	
		
	}
	
	public void borrar() {
		Iterator<Club> recor=al.iterator();
		while(recor.hasNext()) {
			club1=recor.next();
			if(club1.getAnyofundacion()>=2000) {
				recor.remove();
			}
		}
		
	}
	public ClubArrayList() {
		
		
	}
	
	public void aniadir(Club club) {
		al.add(club);
	}
	public static void contar() {
		Iterator<Club> recor=al.iterator();
		int contar=0;
		int anio=0;
	
		while(recor.hasNext()) {
			club1=recor.next();
			if(club1.getNombre()!=null) {
				contar++;	
			}
			
		
			
			if(club1.getAnyofundacion()<2000) {
				anio++;
				
			}
		}
		System.out.println(contar);
		System.out.println(anio);
	}
	public void borrar2() {
		Iterator<Club> recor=al.iterator();
		while(recor.hasNext()) {
			recor.remove();
		}
	}
	
}
