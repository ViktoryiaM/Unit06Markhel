package com.epam.unit06.task01;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println(counter.getCurrentValue());
    counter.increase();
    System.out.println(counter.getCurrentValue());
    counter.decrease();
    System.out.println(counter.getCurrentValue());
    Random rand = new Random();
    Counter counter1 = new Counter(3, 999);
    System.out.println(counter1.getCurrentValue());
    counter1.increase();
    System.out.println(counter1.getCurrentValue());
    counter1.decrease();
    System.out.println(counter1.getCurrentValue());

    try {
      Counter counter2 = new Counter(5, 4);
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
    Counter counter3 = new Counter(3, 999, 45);
    System.out.println(counter3.getCurrentValue());
    counter3.increase();
    System.out.println(counter3.getCurrentValue());
    counter3.decrease();
    System.out.println(counter3.getCurrentValue());

    try {
      Counter counter4 = new Counter(5, 4, 4);
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
    try {
      Counter counter5 = new Counter(2, 40, 41);
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
    Counter counter6 = new Counter(3, 666, 666);
    try {
      counter6.increase();
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
    Counter counter7 = new Counter(3, 666, 3);
    try {
      counter7.decrease();
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
    }
  }
}