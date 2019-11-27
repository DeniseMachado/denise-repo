import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {

    public void start() {

        //Use the test persistence.xml unit to configure a new
        // entity manager factory and start up JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");

        //Open a new database connection by getting a new
        //entity manager from the entity manager factory
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Result" + entityManager.createNativeQuery("select 1 + 1").getSingleResult());

        entityManager.close();

        entityManagerFactory.close();

    }
}
