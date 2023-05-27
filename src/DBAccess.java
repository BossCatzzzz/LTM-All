
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;


/**
 *
 * @author MagicDra
 */
public class DBAccess {
    private Connection con;
    private Statement stmt;



    public DBAccess() {
        try {
            MyConnection mycon=new MyConnection();
            this.con = (Connection) mycon.getConnection();
            this.stmt = (Statement) con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Loi khi ket noi db", 0);
        }
    }
    
    public int Update(String s){
        try {
            return stmt.executeUpdate(s);//tra ve so hang da duoc update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Loi khi thuc hien update", 0);
            return -1;
        }
    }
    public ResultSet Query(String query){
        try {
            ResultSet rs=stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Loi khi thuc hien truy van", 0);
            return null;
        }
    }
    
}
