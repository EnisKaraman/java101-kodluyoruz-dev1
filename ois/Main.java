package ois;
public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher ("Ali Dursun","TRH","51235");
        Teacher t2=new Teacher ("Şimşek Caka","FZK","555");
        Teacher t3=new Teacher ("Furkan As","BIO","666");
        
        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        
        Course FZK=new Course("Fizik","201","FZK");
        FZK.addTeacher(t2);
        
        Course BIO=new Course("Biyoloji","301","BIO");
        BIO.addTeacher(t3);
        
        
        Student s1=new Student("Ahmet Ka","111","4",tarih,FZK,BIO);
        s1.addbulkexemnote(100, 60, 80);
        s1.addverbal(60, 40, 80);
        s1.ispass();
    
        Student s2=new Student("Efe Ada","112","4",tarih,FZK,BIO);
        s2.addbulkexemnote(10, 20, 70);
        s2.addverbal(100, 100, 100);
        s2.ispass();
        
       
    }     
}
