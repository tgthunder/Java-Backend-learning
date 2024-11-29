import java.sql.*;
public class PreparedJDBC {
    public static void main(String args[])
    {
        try
        {
            // PreparedStatment is USed to fire dyamic quries like if we want to insert query into databse dynamically we could use PreparedStatement interface 
            // we set ? at the place of where the dynamic data comes...

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "sudarshan09";

            Connection con =  DriverManager.getConnection(url,username,password);

            String query = "insert into table1(tName,tCity) values(?,?)";

            PreparedStatement pstmt =  con.prepareStatement(query);
            // while giving dynamic query to prepareStatement method we should pass the query
            

            pstmt.setString(1, "Rahul");
            pstmt.setString(2, "Udaypur");

            // you could use bufferReader and inputStreamReader to get input from user
            System.out.println("Inserted Successfully....");
            
            con.close();


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
