package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/skillbox?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String pass = "ytafhbfy12";

    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement statement = connection.createStatement();
    statement.execute("SELECT pl.course_name, pl.subscription_date FROM PurchaseList pl WHERE pl.course_name = \"Веб-разработчик c 0 до PRO\"ORDER BY pl.subscription_date;");
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Students s WHERE MONTH(s.registration_date ) = 4");
    while (resultSet.next()) {
      String courseName = resultSet.getString("name");
      System.out.println(courseName);
    }
    resultSet.close();
    statement.close();
    connection.close();


  }
}