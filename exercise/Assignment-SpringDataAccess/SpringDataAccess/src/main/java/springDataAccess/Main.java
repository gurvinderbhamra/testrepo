package springDataAccess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DataSourceEx dataSourceEx = context.getBean(DataSourceEx.class);
        dataSourceEx.printUsers();

        UserDao userDao = context.getBean(UserDao.class);
        userDao.userCount();
        System.out.println("\nSearching name of user with parameterized query : " + userDao.getUserName("ramesh"));

        User user = new User("rajesh", "100", "rajesh", 23, "03-09-1995");
//        userDao.insertUser(user);

        userDao.queryForMapEx(user.getUsername());
        userDao.queryForListEx();

        //getting user via usermapper
        user = userDao.getUser();
        System.out.println("\nGetting user with usermapper:\n" + user);

        userDao.setSessionFactoryEx();

        //transaction
        userDao.insertPerson();
    }
}
