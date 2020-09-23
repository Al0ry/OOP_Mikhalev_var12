
//Реализовать класс позволяющий выполнять арифметические действия (+,-,*,/) над всеми элементами массива действительных чисел.  Массив чисел, знак операции и операнд задаётся извне объекта этого класса.

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    int size;
    char operator;
    double operand;

    System.out.println("Введите количество чисел в массиве");
    size = Calc.inputInt();
    double[] arr = new double[size];

    System.out.println("Заполните массив");
    for (int i = 0; i < size; i++) {
      arr[i] = Calc.inputDouble();
    }

    System.out.println("Введите оператор: +, -, *, /");
    operator = Calc.inputChar();

    System.out.println("Введите операнд");
    operand = Calc.inputDouble();

    Calc.calculate(arr, operator, operand);

    Calc.print(arr);

  }
}

class Calc {
  private static Scanner in = new Scanner(System.in);

  static public void calculate(double[] array, char oper, double operand) {

    switch (oper) {
    case '-': {
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i] - operand;
      }
      break;
    }
    case '+': {
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i] + operand;
      }
      break;
    }
    case '*': {
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i] * operand;
      }
      break;
    }
    case '/': {
      for (int i = 0; i < array.length; i++) {
        array[i] = array[i] / operand;
      }
      break;
    }
    }
  }

  public static void print(double[] array) {
    for (double i : array)
      System.out.println(i);
  }

  static public int inputInt() {

    int x;
    while (true) {
      try {
        x = in.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("Ошибка! Введите число!");
      }
    }
    return x;
  }

  static public double inputDouble() {

    double x;
    while (true) {
      try {
        x = in.nextDouble();
        break;
      } catch (Exception e) {
        System.out.println("Ошибка! Введите число!");
      }
    }
    return x;
  }

  static public char inputChar() {

    char x;
    while (true) {
      char[] n = in.next().toCharArray();
      if (n.length == 1) {
        x = n[0];
        if (x == '+' || x == '-' || x == '*' || x == '/') {
          break;
        } else {
          System.out.println("Ошибка! Введите верный оператор!");
        }
      } else {
        System.out.println("Ошибка! Введите верный оператор!");
      }
    }
    return x;
  }
}
