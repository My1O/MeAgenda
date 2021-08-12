package ui;
import java.util.Scanner;
import dol.InfoContacto;
import util.Validaciones;




@SuppressWarnings("unused")
public class MenuPrincipal 
{
	Scanner leer = new Scanner(System.in);
	Validaciones v;
	
	public MenuPrincipal()
	{
		v = new Validaciones(leer);
	}
	
	public void menuPrincipal()
	{
		System.out.println("*  Agenda de Contactos   *");
		System.out.println("--------------------------");
		System.out.println("    *  Opciones  *        ");
		System.out.println("--------------------------");
		System.out.println(" 1. Ver contactos         ");
		System.out.println(" 2. Agregar un Contacto   ");
		System.out.println(" 3. Actualizar  Contacto  ");
		System.out.println(" 4. Eliminar  contacto    ");
		System.out.println(" 5. Salir de la aplicacion");
		
	}
	/*
	public void mostrar()
	{
		menuPrincipal();
		short comparar = leer.nextShort();
		while (comparar <1 || comparar >5)
		{
			System.out.println("     *   Tu opcion es incorrecta    *         ");
			System.out.println("Por favor ingresa una de las opciones en lista");
			menuPrincipal();
			leer.nextShort();
		}
		ejecutarOpcionCorrecta(comparar);
	}
	*/
	public void mostrarMenu()
	{
		ejecutarOpcionCorrecta(v.ValidaRango(1, 6, "Ingresar Opcion valida \n"));
	}
	public void ejecutarOpcionCorrecta(int opcion)
	{
		InfoContactoGui contacto;
		contacto = new InfoContactoGui();
		
		
		switch(opcion) 
		{
		case 1 ->
		{
			contacto.mostrarContacto();
			menuPrincipal();
			mostrarMenu();
		}
		case 2 ->
		{
			contacto.pedirDatos();
			menuPrincipal();
			mostrarMenu();
						
		}
		case 3 ->
		{
			contacto.actualizarContacto();
			System.out.println("Contacto Actualizado con exito");
			menuPrincipal();
			mostrarMenu();
		}
		case 4 ->
		{
		   contacto.eliminarContacto();
		   menuPrincipal();
		   mostrarMenu();
		}
				
		case 5 ->
		{
		   System.out.println("La aplicacion finalizo exitosamente");
		   System.exit(0);
		   
		}	
		
	}
	}
}
