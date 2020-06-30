package edu.neu.ccs.cs5004.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
  BinaryTree testBinaryTree;
  Node node;

  @Before
  public void setUp() throws Exception {
    testBinaryTree = new BinaryTree(10);
  }

  @Test
  public void add() {
    testBinaryTree.add(node, 15);
    testBinaryTree.add(node, 7);
    assertEquals(testBinaryTree.root.right.value, 15, 0);
    assertEquals(testBinaryTree.root.left.value, 7, 0);
  }
}