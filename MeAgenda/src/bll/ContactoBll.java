package bll;
import java.io.File;
// import java.util.List;
import java.util.Scanner;
import dal.ContactoFile;
import dol.InfoContacto;

public class ContactoBll 
{
	private InfoContacto contacto;
	private ContactoFile file;
	Scanner scan = new Scanner(System.in);
	
	public ContactoBll()
	{
		file = new ContactoFile();
	}
	public void setContactoData(InfoContacto c)
	{
		contacto = c;
		file = new ContactoFile();
	}
	public String getMascaraImprimir()
	{
		String infoConFormato;
		infoConFormato = " *-------------------------------------------------------------\n*";
		infoConFormato +=" Nombre(s) **  Apellido(s)  **  Direccion  **  N.Telefono  **  \n";
		infoConFormato += String.format("|   %s   |   %s  |  %s   |  %d  \n", contacto.getFirstName(), contacto.getLastname(), contacto.getDireccionDomicilio(), contacto.getNumeroDeTelefono());
		return infoConFormato;
	}
	public void guardar(String path)
	{
		File miRuta = new File(path);
		if(miRuta!=null) {
			file.guardar(miRuta, contacto);
		}
	}
	public InfoContacto  get(String path)
	{
		File miRuta = new File(path);
		if(miRuta!= null)
		{
			contacto = file.leer(miRuta);
		}
		return contacto;
	}
}
