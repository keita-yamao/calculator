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
   InputProcess inputProcess = new InputProcess();

    //入力処理
    value1 = inputProcess.inputValue();
    operator = inputProcess.inputOperator();
    value2 = inputProcess.inputValue();

    //フラグを立てる
    flag = true;

    //計算処理
    result = calculator.calculator(value1, operator, value2, flag);
    System.out.println("計算結果---------------");
    System.out.println(result);

    //継続確認処理
    flag = inputProcess.getUserContinue();

    while (flag) {

      //計算結果の保存
      value1 = result;

      //入力処理
      operator = inputProcess.inputOperator();
      value2 = inputProcess.inputValue();

      //計算処理
      result = calculator.calculator(value1, operator, value2, flag);
      System.out.println("計算結果---------------");
      System.out.println(result);

      //継続確認処理
      flag = inputProcess.getUserContinue();

    }
  }
}
