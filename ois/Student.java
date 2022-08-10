package ois;
public class Student {
    Course c1,c2,c3;
    String name;
    String no;
    String classes;
    double avarage;
    boolean ispass;
    
    Student (String name, String no, String classes, Course c1, Course c2, Course c3){
        this.name= name;
        this.no= no;
        this.classes= classes;
        this.c1= c1;
        this.c2= c2;
        this.c3= c3;
        this.avarage= 0;
        this.ispass= false;
    }
    void addbulkexemnote(int note1, int note2, int note3){
     if (note1 >= 0 && note1 <= 100) {
        this.c1.note=note1;
        }
     
     if (note2 >= 0 && note2 <= 100) {
        this.c2.note=note2;
        }
     
     if (note3 >= 0 && note3 <= 100) {
        this.c3.note=note3;
        }     
    }
    void addverbal(int verbal1,int verbal2,int verbal3){
        if (verbal1 >= 0 && verbal1 <= 100) {
        this.c1.verbal=verbal1;
        }
     
     if (verbal2 >= 0 && verbal2 <= 100) {
        this.c2.verbal=verbal2;
        }
     
     if (verbal3 >= 0 && verbal3 <= 100) {
        this.c3.verbal=verbal3;
        } 
    }
  
    void ispass(){
        this.avarage = ((this.c1.note * 0.8 + this.c1.verbal * 0.2)
                + (this.c2.note * 0.8 + this.c2.verbal * 0.2)
                + (this.c3.note * 0.8 + this.c3.verbal * 0.2)) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı Geçtiniz.");
            this.ispass=true;
        }
        else{
            System.out.println("Sınıfta Kaldınız.");
            this.ispass=false;
        }
        
        printnote();
    }
    void printnote(){
        System.out.println(this.c1.name+" Dersi Notunuz: "+this.c1.note);
        System.out.println(this.c2.name+" Dersi Notunuz: "+this.c2.note);
        System.out.println(this.c3.name+" Dersi Notunuz: "+this.c3.note);
        System.out.println("Ortalamanız: "+this.avarage+"\n");
    }
}
