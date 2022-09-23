package application;

import dominio.Pessoas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        /*
        Objeto pessoas
        Pessoas p1 = new Pessoas(null, "Carlos Santos", "carlos@gmail.com");
        Pessoas p2 = new Pessoas(null, "Vinicius Inhesta", "inhesta@gmail.com");
        Pessoas p3 = new Pessoas(null, "Nicolas Pires", "nicolas@gmail.com");
         */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        /*
        Criando as pessoas no banco de dados
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
         */

        Pessoas p = em.find(Pessoas.class, 2);
        System.out.println(p);

        //Remove o que foi encontrado no find
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto");
        em.close();
        emf.close();
    }
}