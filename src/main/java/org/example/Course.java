 package org.example;

 import com.mysql.cj.protocol.ColumnDefinition;
 import jakarta.persistence.Column;
 import jakarta.persistence.Entity;
 import jakarta.persistence.EnumType;
 import jakarta.persistence.Enumerated;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
 import jakarta.persistence.Table;

 @Entity
 @Table(name = "Courses")
 public class Course {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private int duration;
   @Enumerated(EnumType.STRING)
   @Column(columnDefinition = "enum")
   private CourseType type;
   private String description;
   @Column(name = "teacher_id")
   private int teacherId;


   @Column(name = "student_count")
   private int studentsCount;
   private int price;
   @Column(name = "price_per_hour")
   private float pricePerHour;

   public int getId() {
    return id;
  }

   public void setId(int id) {
     this.id = id;
   }

   public String getName() {
    return name;
  }

   public void setName(String name) {
    this.name = name;
  }

   public int getDuration() {
    return duration;
  }

   public void setDuration(int duration) {
    this.duration = duration;
  }

   public CourseType getType() {
    return type;
  }

   public void setType(CourseType type) {
    this.type = type;
  }

   public String getDescription() {
    return description;
  }

   public void setDescription(String description) {
    this.description = description;
  }

   public int getTeacherId() {
    return teacherId;
  }

   public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

   public int getStudentsCount() {
    return studentsCount;
  }

   public void setStudentsCount(int studentsCount) {
    this.studentsCount = studentsCount;
  }

   public int getPrice() {
     return price;
   }

   public void setPrice(int price) {
    this.price = price;
  }

   public float getPricePerHour() {
    return pricePerHour;
  }

   public void setPricePerHour(float pricePerHour) {
    this.pricePerHour = pricePerHour;
  }
 }
