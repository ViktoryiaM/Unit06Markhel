package com.epam.unit06.task02;

public class Timer {
  private int hours;
  private int minutes;
  private int seconds;

  public Timer() {
    hours = 0;
    minutes = 0;
    seconds = 0;
  }

  public Timer(int hours, int minutes, int seconds) {
    setTimer(hours, minutes, seconds);
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int value) {
    if (value >= 0 && value <= 23) {
      this.hours = value;
    } else {
      this.hours = 0;
    }
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int value) {
    if (value >= 0 && value <= 59) {
      this.minutes = value;
    } else {
      this.minutes = 0;
    }
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int value) {
    if (value >= 0 && value <= 59) {
      this.seconds = value;
    } else {
      this.seconds = 0;
    }
  }

  public void setTimer(int hours, int minutes, int seconds) {
    this.setHours(hours);
    this.setMinutes(minutes);
    this.setSeconds(seconds);
  }

  public void addHours(int hours) {
    int newHours = hours + this.hours;
    if (newHours > 23) {
      do {
        newHours = newHours - 24;
      } while (newHours > 23);
    }
    if (newHours < 0) {
      do {
        newHours = newHours + 24;
      } while (newHours < 0);
    }
    this.hours = newHours;
  }

  public void addMinutes(int minutes) {
    int newMinutes = minutes + this.minutes;
    if (newMinutes > 59) {
      do {
        newMinutes = newMinutes - 60;
        this.addHours(1);
      } while (newMinutes > 59);
    }
    if (newMinutes < 0) {
      do {
        newMinutes = newMinutes + 60;
        this.addHours(-1);
      } while (newMinutes < 0);
    }
    this.minutes = newMinutes;
  }

  public void addSeconds(int seconds) {
    int newSeconds = seconds + this.seconds;
    if (newSeconds > 59) {
      do {
        newSeconds = newSeconds - 60;
        this.addMinutes(1);
      } while (newSeconds > 59);
    }
    if (newSeconds < 0) {
      do {
        newSeconds = newSeconds + 60;
        this.addMinutes(-1);
      } while (newSeconds < 0);
    }
    this.seconds = newSeconds;
  }
}