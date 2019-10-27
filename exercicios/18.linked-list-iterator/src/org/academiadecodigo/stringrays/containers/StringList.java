package org.academiadecodigo.stringrays.containers;

public class StringList<T> {

  private final LinkedList delegate = new LinkedList();

  public void add(String str) {
      delegate.add(str);
  }

  public String get(int index) {
      return (String) delegate.get(index);
  }
}
