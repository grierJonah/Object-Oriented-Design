package edu.neu.ccs.cs5004.problem3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PostOrder implements Iterator {

  Stack<Node> stack = new Stack<>();
  private Node currentNode;
  private Node lastNodeVisited = null;


  public PostOrder(Node root) {
    this.currentNode = root;
  }

  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return false;
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Node next() {
    if (currentNode == null) {
      throw new NoSuchElementException("No elements to search through");
    }
    while (!stack.isEmpty() || currentNode != null) {
      if (currentNode != null) {
        stack.push(currentNode);
        currentNode = currentNode.left;
      } else {
        Node peekNode = stack.peek();
        if (peekNode.right != null && lastNodeVisited != peekNode.right) {
          currentNode = currentNode.right;
        } else {
          lastNodeVisited = stack.pop();
          return currentNode;
        }
      }
    }
    return null;
  }
}
