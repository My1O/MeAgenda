package dal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// import java.util.List;

import dol.InfoContacto;

public class ContactoFile 
{
	public void guardar(File file, InfoContacto ic)
	{
		if (file!=null)
		{
			try 
			{
				ObjectOutputStream e = new ObjectOutputStream(new FileOutputStream(file));
				e.writeObject(ic);
				e.close();
			}
			catch(IOException e)
			{
				e.getMessage();
				System.out.println("Ocurrio un error al guardar, OOS ln 28");
			}
		}
	}
	public InfoContacto leer (File file)
	{
		InfoContacto contacto = new InfoContacto();
		try
		{
			ObjectInputStream objetoIngresado = new ObjectInputStream(new FileInputStream(file));
			contacto = (InfoContacto) objetoIngresado.readObject();
		    objetoIngresado.close();
		    
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return contacto;
	}
  
}
