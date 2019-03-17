package springDataAccess;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class DataSourceEx {

//    @Autowired
//    DataSource dataSource;

    @Autowired
    BasicDataSource dataSource;

//    @Autowired
//    SingleConnectionDataSource dataSource;

    void printUsers()throws SQLException{
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.print("Name : " + resultSet.getString("NAME") + ", ");
            System.out.print("Age : " + resultSet.getString("AGE") + ", ");
            System.out.println("DOB : " + resultSet.getString("DOB"));
        }
    }
}
