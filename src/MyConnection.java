
//import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MagicDra
 */
public class MyConnection {

    public Connection getConnection() {
        try {
//            String url = "jdbc:mysql://localhost/quanlytaikhoan?user=root&password=";
//            Connection con = (Connection) DriverManager.getConnection(url);

            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=quanlytaikhoan";
            Connection con = (Connection) DriverManager.getConnection(url, "sa", "123456");

            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Loi khi ket noi db!!!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
