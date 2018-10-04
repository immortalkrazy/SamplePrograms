package p2;

import p1.C1;

public class C4 extends C1 {
  public void doSth() {
    System.out.println("o.x = " + x);
    System.out.println("o.y = " + y);
    // Compilation error if
    //   System.out.println("o.z = " + z);

    // Compilation error if
    // System.out.println("o.u = " + o.u);
    m();
  }
}
