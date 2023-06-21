package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Pessoa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(null, "Antonio", "antonio@gmail.com");
		
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager eM = eMF.createEntityManager();
		eM.getTransaction().begin();
		
		eM.persist(p1);
		
		eM.getTransaction().commit();
		System.out.println("Success!");
		eM.clear();
		eMF.close();
		
	
	}

}
