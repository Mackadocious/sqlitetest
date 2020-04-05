import java.sql.*;

public class Main {

    public static void main(String args[]) {
        Connection conn = null;
        Statement statement;
        try {
            // db parameters
            String url = "jdbc:sqlite:Database.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            statement = conn.createStatement();

            System.out.println("Connection to SQLite has been established.");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM new");


            while(rs.next()){
                System.out.println(rs.getObject(2).toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            //close statements, statement and resultset here..
        }
    }
}
