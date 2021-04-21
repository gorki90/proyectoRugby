package club;

public class Jugador {
	
	private long numLicencia;
	private String nombre, apellidos, nacionalidad;
	private static String posicion;
	private static float estatura;
	private static int peso;
	private Club club;
	
	public long getNumLicencia() {
		return numLicencia;
	}
	public void setNumLicencia(long numLicencia) {
		this.numLicencia = numLicencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	
	public void visualizar3() {
		System.out.println("El jugador "+getNombre()+" juega en el club "+club.getNombre());
	}

	public static void altura() {
		int altura=0;
		if(estatura>=1.70F) {
			altura++;
		}
	}
	public static void pos() {
		int pos=0;
		if(posicion.equalsIgnoreCase("Medio mele")) {
			pos++;
		}
	}
	public static void peso() {
		int pes=0;
		if(peso>=70) {
			pes++;
		}
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
