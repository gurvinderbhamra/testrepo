package springDataAccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User("kamlesh", "3456", "kamlesh", 20, "30-03-1999");
        return user;
    }
}
