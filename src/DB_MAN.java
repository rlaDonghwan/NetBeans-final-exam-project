import java.sql.*;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author inhatc
 */
public class DB_MAN {

    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "jdbc:mysql://localhost:3306/java_project?characterEncoding=UTF-8&&serverTimezone=UTC";

    String user = "root";
    String password = "202044059!";

    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    PreparedStatement pstmt;
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, user, password);
            DB_stmt = DB_con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (SQLException e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}

