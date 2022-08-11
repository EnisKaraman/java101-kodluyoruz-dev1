package Boks;
public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ahmet",10,100,100,25);
        Fighter f2=new Fighter("Hasan",10,100,85,25);
        
        Match match=new Match(f1,f2,85,100);
        match.run();
    }
  
}
