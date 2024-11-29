import java.sql.*;
public class InsertJDBC {
    public static void main(String args[])
    {
        try
        {
            // 1. Load the driver class
            Class.forName("com.mysql.jdbc.Driver");

            // 2. Create a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "sudarshan09";

            Connection con = DriverManager.getConnection(url , username , password);
        
        String query = "create table table1(tID int(10) primary key auto_increment,tName varchar(200) , tCity varchar(400))";

        Statement stmt = con.createStatement();

        stmt.executeUpdate(query);
        System.out.println("table created in database successfully...");
        con.close();
        if(con.isClosed()){
            System.out.println("Connection is Closed");
        }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
       

    }
}
