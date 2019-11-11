package generics;//: generics/HijackedInterface.java
// {CompileTimeError} (Won't compile)
import typeinfo.pets.Cat;

class Cat2 implements Comparable<Cat>{
  // Error: Comparable cannot be inherited with
  // different arguments: <Cat> and <Pet>
  public int compareTo(Cat arg) { return 0; }
} ///:~
