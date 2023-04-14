package dev.datastructure.queue;

import java.util.Queue;
import java.util.LinkedList;
public class QueueTest {
  public static void main(String[] args) {
    Queue que = getQueue();
    que.add(1);
    que.offer(2);
    que.offer(3);
    que.offer(4);
    System.out.println(que);
    System.out.println(que.peek());
    System.out.println(que);
    System.out.println(que.poll());
    System.out.println(que);
    System.out.println(que.element());
    System.out.println(que.remove());
    System.out.println(que);
    System.out.println(que.size());
    System.out.println(que.isEmpty());
  }
  static Queue<Integer> queue = new LinkedList<Integer>();
  static public Queue<Integer> getQueue() {
    return queue;
  }
}
