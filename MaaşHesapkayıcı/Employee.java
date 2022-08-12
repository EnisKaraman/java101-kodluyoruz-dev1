package MaaşHesapkayıcı;
public class Employee {
 String name;
 int salary;
 int workHours;
 int hireYear;
 double tax;
 int bonus;
 int year=2021;
 int maas;
         
  Employee(String name,int salary,int workHours,int hireYear){
   this.name=name;
   this.salary=salary;
   this.workHours=workHours;
   this.hireYear=hireYear;
  }
  public void tax(){
      if (this.salary >= 1000) {
        tax=(this.salary*0.03);
      }
      else{
        tax=0;  
      }
  }
  int bonus(){
      if (this.workHours > 40) {
       bonus=30*(this.workHours - 40);      
      }
      else{
       bonus=10;
      }
      return bonus;
  }
  public void raiseSalary(){
      if (this.year - this.hireYear < 10) {
        this.maas+=this.salary*0.05;  
      }
      if (this.year - this.hireYear > 9 && this.year - this.hireYear < 20) {
          this.maas+=this.salary*0.1;
      }
      if (this.year - this.hireYear > 19 ) {
          this.maas+=this.salary*0.15;
      }
   
  }
  public void run(){
      bonus();
      raiseSalary();
      tax();
      System.out.println("Adı: "+this.name+"\nMaaşı: "+this.salary+"\nÇalışma Saati: "+this.workHours+"\nBaşlangıç Yılı: "+this.hireYear+"\nVergi: "+tax+"\nBonus: "+bonus+"\nMaaş Artışı: "+maas+"\nVergi ve Bonuslar ile Maaş: "+(this.salary+bonus-tax)+"\nToplam Maaş: "+(this.salary+bonus+maas-tax)+"\n---------------------------------------------\n");   
  }
  
}
