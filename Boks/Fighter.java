package Boks;
public class Fighter {
 String name;
 int damage;
 int health;
 int weight;
 int dodge;
 int change = 50;
 
 Fighter(String name, int damage, int health, int weight, int dodge){
  this.name = name;
  this.damage = damage;
  this.health = health;
  this.weight = weight;
  if (this.dodge >= 0 && this.dodge <=100) {
    this.dodge=dodge;
  }else{
    this.dodge = 0; 
 }
 }
 
 int hit(Fighter foe){
     System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu." );
     if (foe.isDodge()) {
         System.out.println(foe.name + " Gelen Hasarı Engelledi.\n");
         return foe.health;
     }
     
     if (foe.health - this.damage < 0) {
         return 0;
     }
     
     return foe.health - this.damage;
 }
 
 boolean isDodge(){
     double randomnumber = Math.random() * 100;
     return randomnumber <= this.dodge;
     
 }
 
 boolean isChange(){
     double rendomn = Math.random() * 100;
     return rendomn <= this.change;
 }
 
 
}
