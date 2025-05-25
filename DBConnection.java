import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/online_voting";
        String user = "root";
        String password = "your_password"; // <- Update this
        return DriverManager.getConnection(url, user, password);
    }
}
