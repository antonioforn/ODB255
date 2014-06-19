

package forms;

import entities.Cup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LoadData {

    public static void main(String[] args ){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("c:/base/CupTeam.odb");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        Cup c = new Cup("Libertadores");
        em.persist(c);        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
