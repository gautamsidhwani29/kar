import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Sample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root"; 
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String deleteSQL1 = "delete from product where product_id = 'A003'";
            String deleteSQL2 = "delete from product where price > 500";
            String deleteSQL3 = "delete from product where price > 500 and product_id= 'A003'";

            
            stmt.executeUpdate(deleteSQL1);

            stmt.executeUpdate(deleteSQL2);

            stmt.executeUpdate(deleteSQL3);

            System.out.println("Record Deleted From Product Table");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




/*
  NOTE:
  if you face error: "Error: Could not find or load main class Sample"
  then try compiling without jar file and also try compiling with and without jar file in vs code
  
 */

/*

DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product (
    product_id VARCHAR(255),
    price INT
);

INSERT INTO product (product_id, price) VALUES 
('A001', 400),
('A002', 550),
('A003', 650);


 */


//to get the url goto -> mysql cmd line -> Select @@hostname -> Show variables like 'port' -> Select database()
/*Suppose the results of the above commands are:

Hostname: localhost
Port: 3306
Database: test_db
You can form the JDBC URL manually:

jdbc:mysql://localhost:3306/test_db */






//NOTE: to run this use normal cmd. DONT USE VS CODE CMD!!!!!!!

/* TO RUN THIS: 

C:\Users\hp\Desktop\mypracs\20>javac -cp .;a.jar Sample.java

C:\Users\hp\Desktop\mypracs\20>java -cp .;a.jar Sample
 */
