package Boks;
public class Match {
 Fighter f1,f2;
 int minWeight;
 int maxWeight;
 
  Match (Fighter f1, Fighter f2, int minWeight, int maxWeight){
   this.f1=f1;
   this.f2=f2;
   this.maxWeight=maxWeight;
   this.minWeight=minWeight;


   
  }
  public void run(){
      if (isCheck()) {
          while(this.f1.health > 0 && this.f2.health > 0 ){
              if (this.f1.isChange()) {
                  this.f2.health = this.f1.hit(this.f2);
                  this.f1.health = this.f2.hit(this.f1);
              }
              else{
              this.f1.health = this.f2.hit(this.f1);
              this.f2.health = this.f1.hit(this.f2);}
              
              if (isWin()) {
                  break;
              }
              
              if (isWin()) {
                  break;
              }
              System.out.println(("\n"+this.f1.name+"'in Kalan Canı: "+this.f1.health+"\n")+
                                (this.f2.name+"'ın Kalan Canı: "+this.f2.health));
              System.out.println("\n----- Yeni ----- Raund -----");
          }
      }else{
          System.out.println("Sporcuların Sikletleri Uymuyor.");
      }
  }
  boolean isCheck(){
      return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
  }
  boolean isWin(){
      if (this.f1.health == 0) {
          System.out.println(("\n"+this.f1.name+"'in Kalan Canı: "+this.f1.health+"\n")+
                            (this.f2.name+"'ın Kalan Canı: "+this.f2.health+"\n"));
          System.out.println("Kaznan: "+this.f2.name);
          return true;
      }
      if (this.f2.health == 0) {
          System.out.println(("\n"+this.f1.name+"'in Kalan Canı: "+this.f1.health+"\n")+
                            (this.f2.name+"'ın Kalan Canı: "+this.f2.health+"\n"));
          System.out.println("Kaznan: "+this.f1.name);
          return true;
  }
      return false;
}
}        