package club;
import java.util.Scanner;
public class Equipo {
	Scanner src=new Scanner(System.in);
	private String[] equipo=new String[5];
	private Club club;
	
	public String[] getEquipo() {
		return equipo;
	}
	public void setEquipo(String[] equipo) {
		this.equipo = equipo;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}

	public Equipo(String nombre, String nombre2,String nombre3, String nombre4, String nombre5){
		
			equipo[0]=nombre;
			equipo[1]=nombre2;
			equipo[2]=nombre3;
			equipo[3]=nombre4;
			equipo[4]=nombre5;
	
	}
	public Equipo(String[] nombre) {
		for(int x=0;x<equipo.length;x++) {
			equipo[x]=nombre[x];
		}
		
	}
	public void visualizar2() {
	
		System.out.print("El club: "+club.getNombre()+" teléfono:"+club.getTelefono()+" tiene los siguientes equipos: ");
		for(String nom:equipo) {
			System.out.print(nom+","+" ");
	}
	}
}
