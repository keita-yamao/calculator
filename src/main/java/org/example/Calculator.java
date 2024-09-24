package org.example;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {

  //変数宣言
  private String operator;

  //Scannerオブジェクトの作成
  Scanner scanner = new Scanner(System.in);

  //計算処理
  public double calculator(double value1, String operator, double value2, boolean flag) {

    //変数宣言
    double result = 0;

    //計算処理
    switch (operator) {
      case "+":
        result = value1 + value2;
        break;
      case "-":
        result = value1 - value2;
        break;
      case "*":
        result = value1 * value2;
        break;
      case "/":
        if (value2 == 0) {
          System.out.println("*****0除算エラー*****");
          break;
        } else {
          result = value1 / value2;
          break;
        }
    }
    if (flag == false) {
      scanner.close();//scannerを閉じる
    }
    return result;
  }
}
