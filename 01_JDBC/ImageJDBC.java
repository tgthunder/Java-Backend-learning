import java.sql.*;
import java.io.*;
public class ImageJDBC {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "sudarshan09";

            Connection con =  DriverManager.getConnection(url,username,password);

            String query = "insert into Images(pic) values(?)";

            PreparedStatement pstmt =  con.prepareStatement(query);

            FileInputStream fis = new FileInputStream("perceptual-standard.jpg");

            pstmt.setBinaryStream(1, fis , fis.available());
            //  avaiable return maximum size of the file...

            pstmt.executeUpdate();
            System.out.println("Query Executed Successfully....");
            con.close();
        }catch(Exception e)
        {
            System.out.println("ERROR...");
        }
    }
}

/*
we are using blob datatype which is binary large object which will be able to store almost less than 65kb data
in database...
 */
