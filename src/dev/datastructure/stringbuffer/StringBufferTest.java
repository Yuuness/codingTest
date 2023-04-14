package dev.datastructure.stringbuffer;

public class StringBufferTest {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("123");
    sb.insert(2, "333");
    System.out.println(sb);
  }
}
