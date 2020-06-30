package edu.neu.ccs.cs5004.problem1;

import java.util.Collection;
import java.util.Iterator;

public interface IList<E> extends Collection<E> {

  /**
   * Returns the number of elements in this list.
   */
  int size();

  /**
   * Returns <tt>true</tt> if this list contains no elements.
   */
  boolean isEmpty();

  /**
   * Returns <tt>true</tt> if this list contains the specified element.
   */
  boolean contains(Object o);

  /**
   * Returns an iterator over the elements in this list in proper sequence.
   */
  Iterator<E> iterator();

  /**
   * Appends the specified element to the end of this list (optional operation).
   */
  boolean add(E e);

  /**
   * Removes the first occurrence of the specified element from this list, if it is present
   * (optional operation).
   */
  boolean remove(Object o);

  /**
   * Returns <tt>true</tt> if this list contains all of the elements of the specified collection.
   */
  boolean containsAll(Collection<?> c);

  /**
   * Removes all of the elements from this list (optional operation).
   */
  void clear();

  /**
   * Returns the element at the specified position in this list.
   */
  E get(int index);

  /**
   * Inserts the specified element at the specified position in this list
   */
  void add(int index, E element);

  /**
   * Removes the element at the specified position in this list
   */
  E remove(int index);
}