package org.observerPattern;

public class Exec {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Product phone=new Product("Banana Phone");
          Person khalid=new Person("khalid");
          Person sami=new Person("sami");
          Person Bushra=new Person("Bushra");

          phone.add(khalid);
          phone.add(sami);
          phone.add(Bushra);

          for (int i=0;i<5;i++){
              boolean avaiable= i% 2== 0;
              phone.setAvailability(true);
              if (i==2){
                  phone.remove(sami);
              }
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
              }
              System.out.printf(".................");

          }
    }
}