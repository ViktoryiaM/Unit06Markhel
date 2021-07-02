package com.epam.unit06.task02;

public class Main {
  public static void main(String[] args) {
    Timer timer = new Timer(23, 59, 59);
    timer.addSeconds(1);
    System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());
    Timer timer1 = new Timer();
    timer1.addMinutes(-10);
    System.out.println(timer1.getHours() + ":" + timer1.getMinutes() + ":" + timer1.getSeconds());
    Timer timer2 = new Timer();
    timer2.addHours(-5);
    System.out.println(timer2.getHours() + ":" + timer2.getMinutes() + ":" + timer2.getSeconds());
  }
}