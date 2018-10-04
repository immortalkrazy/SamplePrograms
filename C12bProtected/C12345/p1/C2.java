package p1;

public class C2 {
  C1 o = new C1();

  public void doSth() {
    System.out.println("o.x = " + o.x);
    System.out.println("o.y = " + o.y);
    System.out.println("o.z = " + o.z);

    // Compilation error if
    // System.out.println("o.u = " + o.u);
    o.m();
  }
}
