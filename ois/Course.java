package ois;
public class Course {
 Teacher teacher;
 String name;
 String code;
 String prefix;
 double note;
 double verbal;
 
 Course(String name, String code, String prefix){
     this.name=name;
     this.code=code;
     this.prefix=prefix;
    double note=0;
     double verbal=0;
 }
 void addTeacher(Teacher teacher){
     if (teacher.branch.equals(prefix)){
         this.teacher=teacher;
         
     }else{
         System.out.println("Öğretmen ve Ders Bölümü Uyuşmamaktadır.");
     }
     
 }
 void printTeacherInfo(){
     this.teacher.print();
 }
}
