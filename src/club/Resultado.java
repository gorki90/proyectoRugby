package club;

public class Resultado {
	
	private byte codPartido;
	private Jugador jugador;
	private String primerTiempo, segundoTiempo;
	private String puntuacionEnsayo;
	
	public byte getCodPartido() {
		return codPartido;
	}
	public void setCodPartido(byte codPartido) {
		this.codPartido = codPartido;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public String getPrimerTiempo() {
		return primerTiempo;
	}
	public void setPrimerTiempo(String primerTiempo) {
		this.primerTiempo = primerTiempo;
	}
	public String getSegundoTiempo() {
		return segundoTiempo;
	}
	public void setSegundoTiempo(String segundoTiempo) {
		this.segundoTiempo = segundoTiempo;
	}
	public String getPuntuacionEnsayo() {
		return puntuacionEnsayo;
	}
	public void setPuntuacionEnsayo(String puntuacionEnsayo) {
		this.puntuacionEnsayo = puntuacionEnsayo;
	}
	
	public void visualizar4() {
		System.out.println("El Jugador/a: "+jugador.getNombre()+ " de nacionalidad:"+jugador.getNacionalidad()+" del club: "+jugador.getClub().getNombre()+" ha jugado el partido cod: "+getCodPartido());
	}

}
