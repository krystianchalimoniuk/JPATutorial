package krystian.tutorial.jpa.encje;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainActivity {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=emf.createEntityManager();
		//operacje
Produkt p=em.find(Produkt.class,1);
System.out.println(p.getSkladniki().get(0).getZamowienie().getKlient().getNazwisko());
		em.close();
	}

}
