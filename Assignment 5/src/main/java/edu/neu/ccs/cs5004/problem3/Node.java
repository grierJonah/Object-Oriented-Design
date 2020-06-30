package edu.neu.ccs.cs5004.problem3;

public class Node {

  protected Integer value;
  protected Node left;
  protected Node right;


  public Node() {
  }

  /**
   * Constructs a single node (leaf node).
   *
   * @param value value of the node
   */
  public Node(Integer value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Constructs a parent node that has a left and right child.
   *
   * @param left the node to the left
   * @param right the node to the right
   * @param value the value of the current node
   */
  public Node(Node left, Node right, Integer value) {
    this.left = left;
    this.right = right;
    this.value = value;
  }
}
