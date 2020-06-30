package edu.neu.ccs.cs5004.problem3;

import java.util.Iterator;
import java.util.Stack;

public class InOrder implements Iterable {

  private Stack<Node> stack = new Stack<>();
  private Node currentNode;

  public InOrder(Node root) {
    this.currentNode = root;
  }

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   */
  @Override
  public Iterator iterator() {
    return new Iterator() {

      @Override
      public boolean hasNext() {
        return (!stack.isEmpty() || currentNode != null);
      }

      @Override
      public Node next() {
        while (currentNode != null) {          // gets left most node
          stack.push(currentNode);
          currentNode = currentNode.left;
        }
        currentNode = stack.pop();             // pops left most node
        Node node = currentNode;               // copies left most node to return
        currentNode = currentNode.right;       // sets current node to right node
        return node;
      }
    };
  }
}
