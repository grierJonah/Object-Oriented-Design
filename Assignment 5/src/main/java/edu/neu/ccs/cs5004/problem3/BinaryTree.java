package edu.neu.ccs.cs5004.problem3;

public class BinaryTree {

  protected Node root;
  protected Node left;
  protected Node right;

  /**
   * Constructs the root of the Binary Tree.
   *
   * @param value the starting root node value in the Binary Tree
   */
  public BinaryTree(Integer value) {
    this.root = new Node(value);
  }

  public Node add(Node node, Integer value) {
    if (root == null) {
      return new Node(value);
    } else if (value < root.value) {
      if (root.left == null) {
        root.left = new Node(value);
      } else {
        return root.left = add(root.left, value);
      }
    } else if (value > root.value) {
      if (root.right == null) {
        root.right = new Node(value);
      } else {
        return root.right = add(root.right, value);
      }
    }
    return null;
  }
}