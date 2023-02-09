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
    ResultSet resultSet2 = statement.executeQuery(
        "SELECT course_name, COUNT(course_name)/(MAX(MONTH(subscription_date)) - MIN(MONTH(subscription_date))) AS Coefficient FROM PurchaseList GROUP BY course_name");
    while (resultSet2.next()) {
      String result =
          resultSet2.getString("course_name") + " - " + resultSet2.getString("Coefficient");
      System.out.println(result);

    }

    resultSet2.close();
    statement.close();
    connection.close();


  }
}