package dol;
import java.io.Serializable;

public class InfoContacto implements Serializable
{

	/**
	 *  Author: Grupo{Edgard, Douglas, Camilo}
	 *  Universidad Nacional de Ingenieria
	 *  Proyecto Agenda de contactos
	 *  Implementando CRUD - Serialize process  
	 *  Date: 06-12-2021
	 */
	private static final long serialVersionUID = 1L;
	private String firstName, Lastname;
	String direccionDomicilio;
	private int numeroDeTelefono;
	//private String numeroDeTelefono;
	// setters and getters de nombre, apellido, numero y direccion
	public InfoContacto()
	{
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() 
	{
		return Lastname;
	}

	public void setLastname(String lastname) 
	{
		Lastname = lastname;
	}
	
	public String getDireccionDomicilio() 
	{
		return direccionDomicilio;
	}
	public void setDireccionDomicilio(String direccionDomicilio)
	{
		this.direccionDomicilio = direccionDomicilio;
	}
	public int getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	public void setNumeroDeTelefono(int numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public InfoContacto(String firstName, String lastname, String direccionDomicilio, int numeroDeTelefono) {
		
		this.firstName = firstName;
		this.Lastname = lastname;
		this.direccionDomicilio = direccionDomicilio;
		this.numeroDeTelefono = numeroDeTelefono;
	}
	@Override
	public String toString() {
		return "Primer nombre =" + firstName + ", Segundo = " + Lastname + ", Direccion de domicilio = "
				+ direccionDomicilio + ", Numero de Telefono=" + String.valueOf(numeroDeTelefono);
	}
}
