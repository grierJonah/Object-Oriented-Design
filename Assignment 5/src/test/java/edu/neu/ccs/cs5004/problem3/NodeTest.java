package edu.neu.ccs.cs5004.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
  Node node;

  @Before
  public void setUp() throws Exception {
    node = new Node(10);
  }

  @Test
  public void testGetValue() {
    assertEquals(node.value, 10, 0);
  }
}