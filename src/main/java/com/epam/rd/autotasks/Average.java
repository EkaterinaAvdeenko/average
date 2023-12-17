package com.epam.rd.autotasks;


import java.util.Scanner;

public class Average {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    int value = 0, sum = 0, count = 0;
    while ((value = scan.nextInt()) != 0) {
      count++;
      sum = sum + value;
    }
    System.out.println(sum / count);
  }
}












