package edu.neu.ccs.cs5004.problem3;

import static jdk.nashorn.internal.objects.NativeArray.push;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PreOrder implements Iterator {

  Stack<Node> stack = new Stack<>();
  private Node root;

  public PreOrder() {
    if (root == null) {
      stack.push(root);
    }
  }

  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return (!stack.isEmpty());
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Node next() {
    if (!hasNext()) {
      throw new NoSuchElementException("Next node is null! Nothing to get next from");
    }
    while (!stack.isEmpty()) {
      Node current = stack.pop();
      if (current.right != null) {
        stack.push(current.right);
      }
      if (current.left != null) {
        stack.push(current.left);
      }
      return current;
    }
    return null;
  }
}
