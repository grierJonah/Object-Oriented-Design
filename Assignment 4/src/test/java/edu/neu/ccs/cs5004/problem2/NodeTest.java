package edu.neu.ccs.cs5004.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
  Node node;
  Node node2;
  Node nextNode;


  @Before
  public void setUp() throws Exception {
    node = new Node(5, 3, nextNode);
    node2 = new Node();
  }

  @Test
  public void getCoefficient() {
    assertEquals(node.getCoefficient(), 5, 0);
    assertEquals(node2.getCoefficient(), 0,0);
  }

  @Test
  public void setCoefficient() {
    node.setCoefficient(10);
    assertEquals(node.getCoefficient(), 10, 0);
  }

  @Test
  public void getPower() {
    assertEquals(node.getPower(), 3, 0);
    assertEquals(node2.getPower(), 0,0);
  }

  @Test
  public void setPower() {
    node.setPower(10);
    assertEquals(node.getPower(), 10, 0);
  }

  @Test
  public void getNext() {
    assertEquals(node.getNext(), nextNode);
    assertEquals(node2.getNext(), null);
  }

  @Test
  public void setNext() {
    node.setNext(null);
    assertEquals(node.getNext(), null);
  }
}