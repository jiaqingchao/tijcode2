package exceptions;//: exceptions/Human.java
// Catching exception hierarchies.

class Annoyance extends Exception {}//自定义异常
class Sneeze extends Annoyance {}//自定义异常继承自定义异常

public class Human {
  public static void main(String[] args) {
    // Catch the exact type:
    try {
      throw new Sneeze();//抛出第二个异常
    } catch(Sneeze s) {
      System.out.println("Caught Sneeze");
    } catch(Annoyance a) {
      System.out.println("Caught Annoyance");
    }
    // Catch the base type:
    try {
      throw new Sneeze();
    } catch(Annoyance a) {//可以使用其基类的异常
      System.out.println("Caught Annoyance");
    }
  }
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
