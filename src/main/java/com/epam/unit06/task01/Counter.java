package com.epam.unit06.task01;

public class Counter {
  private int currentValue;
  private int minValue;
  private int maxValue;


  public Counter() {
    currentValue = 0;
    minValue = 0;
    maxValue = 666;
  }

  public Counter(int minValue, int maxValue) {
    if (minValue > maxValue) {
      throw new IllegalArgumentException("Минимальное значение не может быть больше максимального значения!!");
    }
    currentValue = minValue;
    this.minValue = minValue;
    this.maxValue = maxValue;
  }

  public Counter(int minValue, int maxValue, int initialValue) {
    if (minValue > maxValue) {
      throw new IllegalArgumentException("Минимальное значение не может быть больше максимального значения!!");
    }
    this.minValue = minValue;
    this.maxValue = maxValue;
    if (initialValue >= minValue && initialValue <= maxValue) {
      currentValue = initialValue;
    } else {
      throw new IllegalArgumentException("Текущее значение за пределами допустимого диапазона!!");
    }
  }


  public void increase() {
    if (currentValue == maxValue) {
      throw new RuntimeException("Увеличение счетчика приведет к выходу за пределы допустимого диапазона!!");
    }
    currentValue++;
  }

  public void decrease() {
    if (currentValue == minValue) {
      throw new RuntimeException("Уменьшение счетчика приведет к выходу за пределы допустимого диапазона!!");
    }
    currentValue--;
  }

  public int getCurrentValue() {
    return currentValue;
  }
}