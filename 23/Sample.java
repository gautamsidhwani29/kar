import java.sql.*;
public class Sample
{
    public static void main(String args[]) throws Exception{
        String dbProtocol = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(dbProtocol, username, password);
        Statement stmt = con.createStatement();
        String selectQuery = "SELECT id, name  FROM STUD23 where percentage >70.00";
        System.out.println("SQL Query: SELECT id, name  FROM STUD23 where percentage >70.00");
        ResultSet result = stmt.executeQuery(selectQuery);
        System.out.println("Roll No\tName");
        while (result.next()) {
            Integer sid = result.getInt(1);
            String sname = result.getString(2);
            System.out.println(sid+"\t"+sname);
        }
        result.close();
        stmt.close();
        con.close();
    }
}
//to get the url goto -> mysql cmd line -> Select @@hostname -> Show variables like 'port' -> Select database()
/*Suppose the results of the above commands are:

/* 

delete table:-
DROP TABLE IF EXISTS STUD23;

create table:- 

 CREATE TABLE IF NOT EXISTS STUD23 (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    dept VARCHAR(100),
    percentage FLOAT
);

Insert Data :- 

INSERT INTO STUD23 (id, name, dept, percentage) 
VALUES 
(1, 'Mohit', 'CS', 85.0),
(2, 'Ishak', 'EE', 88.5),
(3, 'Abhinav', 'ME', 79.0),
(4, 'Shresth', 'IT', 91.2);


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
