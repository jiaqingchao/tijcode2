package exceptions;//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.

public class Cleanup {//构造阶段可能抛出的异常
  public static void main(String[] args) {
    try {//最外层嵌套
      InputFile in = new InputFile("Cleanup.java");//读入流
      try {
        String s;//字符串
        int i = 1;//
        while((s = in.getLine()) != null)//
          ; // Perform line-by-line processing here...
      } catch(Exception e) {
        System.out.println("Caught Exception in main");
        e.printStackTrace(System.out);
      } finally {
        in.dispose();
      }
    } catch(Exception e) {
      System.out.println("InputFile construction failed");
    }
  }
} /* Output:
dispose() successful
*///:~
