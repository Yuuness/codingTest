package dev.datastructure.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorWithIterator {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();
    v.add(1);
    v.add(3);
    System.out.println(v);
    System.out.println(v.size());
    System.out.println(v.elementAt(1));
    System.out.println(v.get(1));
    System.out.println(v.remove(1));
    System.out.println(v);

    v.add(6);
    v.add(12);
    System.out.println(v);
    Iterator<Integer> it = v.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
