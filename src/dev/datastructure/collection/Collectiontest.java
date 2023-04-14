package dev.datastructure.collection;

import java.util.ArrayList;
import java.util.Collections;
public class Collectiontest {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("apple");
    arrayList.add("graph");
    arrayList.add("banana");

    System.out.println(arrayList);
    Collections.sort(arrayList);
    System.out.println(arrayList);
    Collections.reverse(arrayList);
    System.out.println(arrayList);
  }
}
