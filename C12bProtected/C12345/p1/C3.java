package p1;

public class C3 extends C1 {
    public void doSth() {
      System.out.println("o.x = " + x);
      System.out.println("o.y = " + y);
      System.out.println("o.z = " + z);

      // Compilation error if
      // System.out.println("o.u = " + o.u);
      m();
    }
}
