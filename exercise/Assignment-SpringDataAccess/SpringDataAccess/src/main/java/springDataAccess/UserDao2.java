package springDataAccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao2 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao3 userDao3;

    @Transactional(propagation = Propagation.MANDATORY, timeout = 1, rollbackFor = RuntimeException.class)
    public void insert(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        String sql = "INSERT INTO Person VALUES (?,?)";
        jdbcTemplate.update(sql, new Object[]{4, "jkl"});
        userDao3.insert();
    }
}
