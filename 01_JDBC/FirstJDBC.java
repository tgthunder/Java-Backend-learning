// Establishing connection between Java and Mysql....
import java.sql.*;
public class FirstJDBC
{
    public static void main(String args[])
    {
        // we would encounter an Exception while establishing a connection..
        try
        {
            // 1. Load the driver class
            Class.forName("com.mysql.jdbc.Driver");

            // 2. Create a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "sudarshan09";

            Connection con = DriverManager.getConnection(url , username , password);

            if(con.isClosed())
            {
                System.out.println("Connection is still closed");

            }else 
            {
                System.out.println("Connection Created");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}