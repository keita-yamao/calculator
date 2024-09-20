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

  //値の入力
  public double inputValue() {
    //変数宣言
    double value = 0;

    //入力処理
    while (true) {
      try {
        System.out.println("数値の入力---------------");
        value = scanner.nextDouble();
        scanner.nextLine();//バッファのクリア
        break;//ループを抜ける
      } catch (InputMismatchException e) {
        e.printStackTrace();
        System.out.println("数値を入力してください---------------");
        scanner.nextLine();//バッファのクリア
      } catch (NoSuchElementException e) {
        e.printStackTrace();
        System.out.println("入力がありません---------------");
        scanner.nextLine();//バッファのクリア
      }
    }
    return value;
  }

  //演算子の入力
  public String inputOperator() {
    //入力処理
    while (true) {
      try {
        System.out.println("演算子(+,-,*,/)を入力してください----------");
        operator = scanner.nextLine();
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*")
            && !operator.equals("/")) {
          System.out.println("演算子が入力されていません----------");
        } else {
          break;
        }
      } catch (NoSuchElementException e) {
        e.printStackTrace();
        System.out.println("入力がありません---------------");
      }
    }
    return operator;
  }

  //処理を継続するか確認
  public boolean getUserContinue() {
    //変数宣言
    String userResponse;
    boolean flag = true;
    while (true) {
      try {
        System.out.println("処理を継続しますか？(yesまたはnoを入力)----------");
        userResponse = scanner.nextLine();
        switch (userResponse) {
          case "yes":
            break;
          case "no":
            System.out.println("=====終了=====");
            flag = false;
            break;
          default:
            System.out.println("無効な文字列です。再入力してください。----------");
            continue;
        }
        break;
      } catch (NoSuchElementException e) {
        e.printStackTrace();
        System.out.println("入力がありません---------------");
      }
    }
    return flag;
  }
}