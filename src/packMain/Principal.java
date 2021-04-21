package packMain;

import club.Club;
import club.Equipo;
import club.Jugador;
import club.Resultado;
import club.arraylist.ClubArrayList;
import club.arraylist.JugadorArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]equipo= {"Senior Masculino","Sub18","Senior Femenino","Sub16", "SeniorB"};
		
		Club club1=new Club("125", "Barakaldo","Calle Maldiva nº4 3D 48002, Bizkaia", "barakaldo@barakaldo.com", "946641606",(short) 1975);
		Club club2=new Club("126", "Ortuella","Calle Mali nº8 8I 48042, Bizkaia", "ortuella@ortuella.com", "947641686",(short) 1990);
		Equipo equipo1=new Equipo("Senior Masculino","Sub18","Senior Femenino","Sub16", "SeniorB");
		equipo1.setClub(club1);
		Equipo equipo2=new Equipo(equipo);
		equipo2.setClub(club2);
		Jugador jugador1=new Jugador();
		jugador1.setClub(club1);
		jugador1.setNombre("Juan");
		Jugador jugador2=new Jugador();
		jugador2.setClub(club1);
		jugador2.setNombre("Jordi");
		Jugador jugador3=new Jugador();
		jugador3.setClub(club2);
		jugador3.setNombre("Miguel");
		Jugador jugador4=new Jugador();
		jugador4.setClub(club2);
		jugador4.setNombre("Arantxa");
		jugador4.setNacionalidad("Angolense");
		Jugador jugador5=new Jugador();
		jugador5.setClub(club2);
		jugador5.setNombre("Miren");
		Resultado res=new Resultado();
		res.setCodPartido((byte) 12);
		res.setJugador(jugador4);
		ClubArrayList al1=new ClubArrayList(); 
		//ClubArrayList al2=new ClubArrayList();
		JugadorArrayList jug=new JugadorArrayList();
		jug.aniadirJugador();
		jug.rec();
		
		
		al1.addItems();
		al1.recorrer();
		al1.borrar();
		System.out.println("Despues de borrar");
		al1.recorrer();
		al1.aniadir(club1);
		al1.aniadir(club2);
		System.out.println("Despues de añadir");
		al1.recorrer();
		ClubArrayList.contar();
		
		
		club1.visualizar();
		club2.visualizar();
		equipo1.visualizar2();
		System.out.println();
		equipo2.visualizar2();
		System.out.println();
		jugador1.visualizar3();
		jugador2.visualizar3();
		jugador3.visualizar3();
		jugador4.visualizar3();
		jugador5.visualizar3();
		res.visualizar4();
		
	}

}
