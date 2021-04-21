package club.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import club.Club;
import club.Jugador;
import java.util.Scanner;

public class JugadorArrayList extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private static ArrayList<Jugador> ar=new ArrayList<Jugador>();
	private String nombre;
	private Club club;
	 static Jugador jug1= new Jugador();
	 static Jugador jug2=new Jugador();
	 static Jugador jug3=new Jugador();
	 static Jugador jug4=new Jugador();
	private String seleccion;

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Club getClub() {
		return club;
	}


	public void setClub(Club club) {
		this.club = club;
	}


	public void aniadirJugador() {
		Scanner src=new Scanner(System.in);
		boolean continuar=true;
		
		while(continuar==true) {
		nombre=JOptionPane.showInputDialog("Alta a un /a jugador/a. ¿Teclea su nombre?");
		
		Object[] clubs = {"Sestao","Santurtzi","Barakaldo","Ortuella","Getxo",
				"Bermeo"};
		JComboBox combo1=new JComboBox(clubs);
		seleccion=JOptionPane.showInputDialog(null, combo1, "Visualiza y escribe el club", JOptionPane.QUESTION_MESSAGE);
		Club clu=new Club();
		
		jug1.setNombre(nombre);
		jug2.setNombre(nombre);
		jug3.setNombre(nombre);
		jug4.setNombre(nombre);
		if(seleccion.equals("Barakaldo")) {
			clu.setNombre("Barakaldo");
		}else if(seleccion.equals("Sestao")) {
			clu.setNombre("Sestao");
		}else if(seleccion.equals("Ortuella")) {
			clu.setNombre("Ortuella");
		}else if(seleccion.equals("Bermeo")) {
			clu.setNombre("Bermeo");
		}else if(seleccion.equals("Getxo")) {
			clu.setNombre("Getxo");
		}else if(seleccion.equals("Santurtzi")){
			clu.setNombre("Santurtzi");
		}
		jug1.setClub(clu);
		jug2.setClub(clu);
		jug3.setClub(clu);
		jug4.setClub(clu);
		ar.add(jug1);
		ar.add(jug2);
		ar.add(jug3);
		ar.add(jug4);
		
		
		
		int confirmar=JOptionPane.showConfirmDialog(null, "Quieres añadir otro jugador?");
		if(JOptionPane.OK_OPTION==confirmar) {
			continuar=true;
		}else {
			continuar=false;
		}
			
		}
	}


	public String getSeleccion() {
		return seleccion;
	}


	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	
	public void rec() {
Iterator<Jugador> recor=ar.iterator();
		
		while(recor.hasNext()) {
			jug1=recor.next();
			System.out.println(jug1.getNombre()+" "+jug1.getClub().getNombre());
	}
	}
}


