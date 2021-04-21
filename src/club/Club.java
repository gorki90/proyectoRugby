package club;

public class Club {
	
	private String codigo, nombre, sedeSocial, mail, telefono;
	private short anyofundacion;



public Club(){
	
}

public Club (String codigo, String nombre, String sedeSocial, String mail, String telefono, short anyofundacion){
	this.codigo=codigo;
	this.nombre=nombre;
	this.sedeSocial=sedeSocial;
	this.mail=mail;
	this.telefono=telefono;
	this.anyofundacion=anyofundacion;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getSedeSocial() {
	return sedeSocial;
}

public void setSedeSocial(String sedeSocial) {
	this.sedeSocial = sedeSocial;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public short getAnyofundacion() {
	return anyofundacion;
}

public void setAnyofundacion(short anyofundacion) {
	this.anyofundacion = anyofundacion;
}
 
public void visualizar() {
	System.out.println("El club de rugby llamado: "+getNombre()+" se fundó el año "+getAnyofundacion());
}
}