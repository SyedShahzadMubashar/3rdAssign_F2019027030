package CitiesTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class cities {

    public static Connection Connect() {
        Connection conn = null;
        try {
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/shahzad";
            String userName = "postgres";
            String password = "shahzadyyt38";
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {

            ex.printStackTrace();

        }
        return conn;
    }

    //public static Connection table() {
//try {  
    //   Connection conn;
    // String dbURL = "jdbc:postgresql://127.0.0.1:5432/shahzad";
    //String userName = "postgres";
    //String Password = "shahzadyyt38";
//            conn = DriverManager.getConnection(dbURL, userName, Password);
    //          String query="Select * from citiesdata.citiestable1";
    //        Statement stm;
    //      stm=conn.createStatement();
    //    ResultSet rs=stm.executeQuery(query);
    //  rs.next();
    //System.out.println(rs.getInt("City_ID"));
    //  while(rs.next())
    //{
    //  System.out.println(rs.getInt("City_ID"));
    //}
    //} catch (Exception ex) {
    //  ex.printStackTrace();
    //}
}
// }

