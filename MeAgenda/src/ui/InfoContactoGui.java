package ui;
import java.io.File;
/* import java.util.ArrayList;
import java.util.List; */
import java.util.Scanner;
import bll.ContactoBll;
import dol.InfoContacto;
import util.Validaciones;

public class InfoContactoGui
{
	Scanner scan = new Scanner(System.in);
	Validaciones v = new Validaciones(scan);
	
	public void pedirDatos()
	{	
		InfoContacto contacto = new InfoContacto();
		contacto.setFirstName(v.validarNombre("Ingrese el Nombre : "));
		contacto.setLastname(v.validarNombre("Ingrese el Apellido : "));
		System.out.println("Direccion de domicilio : ");
		contacto.setDireccionDomicilio(scan.nextLine());
		contacto.setNumeroDeTelefono(v.ValidaInt("Ingresa el numero de Telefono: \n"));	
		// ** se envia a guardar el setContactoData la informacion del contacto **
		ContactoBll cb= new ContactoBll();
		cb.setContactoData(contacto);
		System.out.print(cb.getMascaraImprimir());
		System.out.println("Indica la ruta donde guardar el archivo");
		//cb.guardar(v.validaRuta("Indica la ruta correcta"));
		cb.guardar(v.validaRutaGuardar("Ingrese una ruta correcta") + "/" + contacto.getFirstName() + ".bin" );	
		System.out.println("Contacto guardado con exito");
	}
	public void mostrarContacto()
	{
		ContactoBll c = new ContactoBll();
		InfoContacto contacto = new InfoContacto();
		System.out.println("Indica la ruta y el nombre del archivo a mostrar :");
		contacto = c.get(v.validaLectura("Ingresa un archivo existente"));
		c.setContactoData(contacto);
		System.out.println(c.getMascaraImprimir());
	}
    public void eliminarContacto()
    {
    	//ContactoBll c = new ContactoBll();
    	System.out.println("Ingrese la ruta del archivo a eliminar");
    	File file = new File (scan.nextLine());
    	if(file.exists())
    	{
    		file.delete();
    		System.out.println("Archivo eliminado con exito " + "\n Nombre del Archivo eliminado " + file.getName());
    	}
    	else
    	{
    		System.out.println("Archivo no existe, intente una nueva ruta");
    	}
    }
    public void actualizarContacto()
    {
    	ContactoBll c = new ContactoBll();
		@SuppressWarnings("unused")
		InfoContacto contacto = new InfoContacto();
    	System.out.println("Indica la ruta del archivo a actualizar");
    	System.out.println("Posteriormente indica los cambios a realizar");
        //pedir la ruta donde se almacena el archivo	
		contacto = c.get(v.validaLectura("Ingresa Ruta Valida"));
		//c.setContactoData(contacto);
		//System.out.println(c.getMascaraImprimir());
		System.out.println("Si alguno de los valores no seran cambiados, favor ingresarlo a como esta en pantalla");
		// actualizar datos
		pedirDatos();
    }
}
