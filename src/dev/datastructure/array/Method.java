package dev.datastructure.array;

import java.util.Arrays;

public class Method {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    int[] subArray;
    System.out.println(array.length);
    subArray = array.clone();
    System.out.println(Arrays.toString(subArray));
  }
}
