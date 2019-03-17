package springDataAccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao3 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.NESTED, readOnly = true)
    void insert(){
        String sql = "INSERT INTO Person VALUES(?,?)";
        jdbcTemplate.update(sql, new Object[]{10, "mno"});
        throw new RuntimeException();
    }
}
