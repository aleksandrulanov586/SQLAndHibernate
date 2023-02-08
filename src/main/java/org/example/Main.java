 package org.example;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.hibernate.boot.Metadata;
 import org.hibernate.boot.MetadataSources;
 import org.hibernate.boot.registry.StandardServiceRegistry;
 import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 public class Main {

   public static void main(String[] args) throws SQLException {

     StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure(
         "hibernate.cfg.xml").build();
     Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
     SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
     Session session = sessionFactory.openSession();
     Course course = session.get(Course.class, 1);
     System.out.println(course.getName());
     sessionFactory.close();

   }
 }