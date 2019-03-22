import com.hibernatedemo.Address;
import com.hibernatedemo.Author;
import com.hibernatedemo.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args)throws Exception {

        Author author = new Author();
        author.setFirstName("Vin");
        author.setLastName("Deisel");
        author.setAge(23);
        author.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("29/08/1998"));
        author.setSubjects(Arrays.asList("MySQL", "Java", "Spring"));

        Author author2 = new Author();
        author2.setFirstName("Paul");
        author2.setLastName("Walker");
        author2.setAge(23);
        author2.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("19/10/1998"));
        author2.setSubjects(Arrays.asList("Groovy", "Python", "PHP"));

        Book book = new Book();
        book.getAuthorSet().add(author);
        book.getAuthorSet().add(author2);
        book.setBookName("OCJP");
//        author.setBook(book);

        Book book2 = new Book();
        book2.getAuthorSet().add(author);
        book2.getAuthorSet().add(author2);
        book.setBookName("JAVA");

        //for one to many unidirectional
//        author.getBooks().add(book);
//        author.getBooks().add(book2);

        //one to many bidirectional
        Book book3 = new Book();
        book3.getAuthorSet().add(author);
        book3.getAuthorSet().add(author2);
        book.setBookName("C++");
//        book.setAuthor(author);

        Address address = new Address();
        address.setStreetNumer(2);
        address.setLocation("Okhla");
        address.setState("Delhi NCR");
        author.setAddress(address);

        Address address2 = new Address();
        address.setStreetNumer(4);
        address.setLocation("Noida");
        address.setState("Delhi NCR");
        author2.setAddress(address2);

        author.getBooks().add(book);
        author.getBooks().add(book2);
        author.getBooks().add(book3);

        author2.getBooks().add(book);
        author2.getBooks().add(book2);
        author2.getBooks().add(book3);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        create table if does not exist and insert author values into table
//        session.save(author);
//        session.save(book);
//        session.getTransaction().commit();

//        read from table if exist otherwise throws NullPointerException
//        author = session.get(Author.class,1);
//        System.out.println("Read from table Author : " );
//        System.out.println("First Name : " + author.getFirstName());
//        System.out.println("Last Name : " + author.getLastName());
//        System.out.println("Age : " + author.getAge());
//        System.out.println("DOB : " + author.getDob().toString());

//        delete from table
//        author = session.get(Author.class, "Rakesh");
//        session.delete(author);

//        update table
//        author = session.get(Author.class, "Paul");
//        author.setAge(23);
//        session.update(author);

//        session.save(author);
//        book.setAuthor(author);
//        session.save(book);
//        book2.setAuthor(author);
//        session.save(book2);
//        book3.setAuthor(author);
//        session.save(book3);

//        session.persist(author);

        session.save(author);
        session.save(author2);

        session.save(book);
        session.save(book2);
        session.save(book3);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
