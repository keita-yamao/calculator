package org.example;

public class Main {

  public static void main(String[] args) {
    //変数宣言
    double value1;
    double value2;
    String operator;
    boolean flag;
    double result;

    //オブジェクトのインスタンス化
   Calculator calculator = new Calculator();

    //入力処理
    value1 = calculator.inputValue();
    operator = calculator.inputOperator();
    value2 = calculator.inputValue();

    //フラグを立てる
    flag = true;

    //計算処理
    result = calculator.calculator(value1, operator, value2, flag);
    System.out.println("計算結果---------------");
    System.out.println(result);

    //継続確認処理
    flag = calculator.getUserContinue();

    while (flag == true) {

      //計算結果の保存
      value1 = result;

      //入力処理
      operator = calculator.inputOperator();
      value2 = calculator.inputValue();

      //計算処理
      result = calculator.calculator(value1, operator, value2, flag);
      System.out.println("計算結果---------------");
      System.out.println(result);

      //継続確認処理
      flag = calculator.getUserContinue();

    }
  }
}
