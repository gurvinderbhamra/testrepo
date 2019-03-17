package springDataAccess;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
public class UserDao {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    UserDao2 userDao2;

    void userCount(){
        String sql = "select COUNT(*) from user";
        System.out.println("\nNumber of users : "  + jdbcTemplate.queryForObject(sql, Integer.class));
    }

    String getUserName(String username){
        String sql = "SELECT name FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, String.class);
    }

    void insertUser(User user){
        String sql = "INSERT INTO user VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getAge(),
                user.getDob()
        });
        System.out.println("\nNew User inserted successfully...");
    }

    void queryForMapEx(String username){
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println("\nQuery for Map result:\n"
                + jdbcTemplate.queryForMap(sql, new Object[]{"rajesh"})
        );
    }

    void queryForListEx(){
        String sql = "SELECT * FROM user";
        System.out.println("\nQuery for list result:\n" + jdbcTemplate.queryForList(sql));
    }

    User getUser(){
        String sql = "select * from user where username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"ramesh"}, new UserMapper());
    }

    void setSessionFactoryEx(){
        String sql = "select COUNT(*) from Person";
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println("\nHibernate session factory result:" + query.uniqueResult());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertPerson() {
        try{
            Thread.sleep(2000L);
        }
        catch(InterruptedException e){}
        String sql = "INSERT INTO Person VALUES(?,?)";
        jdbcTemplate.update(sql, new Object[]{3, "xyz"});
        try{
            userDao2.insert();
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
        }catch (Exception e){
            System.out.println("Transaction exception");
        }
    }
}
