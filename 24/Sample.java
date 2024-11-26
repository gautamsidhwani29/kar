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
            String updateSQL = "UPDATE STUD24 SET NAME = 'David' WHERE NAME = 'Jack'";
            System.out.println("Name Updated from Jack TO David");
            stmt.executeUpdate(updateSQL);
            System.out.println("Record Updated From Student Table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
drop table:-

DROP TABLE IF EXISTS STUD24;

create table :- 

 CREATE TABLE IF NOT EXISTS STUD24 (
    id INT PRIMARY KEY,
    name VARCHAR(100)
);

insert data:- 

INSERT INTO STUD24 (id, name)
VALUES 
(1, 'Jack'),
(2, 'Pushkar');

 */


 /* 
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