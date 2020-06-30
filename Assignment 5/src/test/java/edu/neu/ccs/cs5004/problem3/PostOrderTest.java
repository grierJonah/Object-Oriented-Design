package edu.neu.ccs.cs5004.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PostOrderTest {
  BinaryTree BinaryTree;
  PostOrder postOrderTest;
  Node node;

  @Before
  public void setUp() throws Exception {
    BinaryTree = new BinaryTree(10);
    node = new Node();
    BinaryTree.root.right = new Node(15);
    BinaryTree.root.left = new Node(7);
    BinaryTree.root.left.left = new Node(6);
    BinaryTree.root.left.right = new Node(8);
    BinaryTree.root.right.left = new Node(14);
    BinaryTree.root.right.right = new Node(19);

    postOrderTest = new PostOrder(BinaryTree.root);
  }

  @Test
  public void hasNext() {

  }

  @Test
  public void next() {
  }
}