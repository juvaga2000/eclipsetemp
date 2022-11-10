

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Ejercicio1Listener
 *
 */
public class Ejercicio1Listener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Ejercicio1Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	
    	HashMap<String,String> tareas= (HashMap) sce.getServletContext().getAttribute("notificaciones");
    	try {
    		ObjectInputStream ois = new ObjectInputStream (
    		new FileInputStream("C:\\Users\\vaqgalju\\Desktop\\listener.dat"));
			tareas = (HashMap) ois.readObject();
			ois.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {
    	HashMap<String,String> tareas= (HashMap) sce.getServletContext().getAttribute("notificaciones");
    	try {
    	ObjectOutputStream oos = new ObjectOutputStream (
    	new FileOutputStream("C:\\Users\\vaqgalju\\Desktop\\listener.dat"));
    	oos.writeObject(tareas);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
	
}
