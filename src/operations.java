public class operations {
    private int firstNumber = 0;
    private int secondNumber = 0;
    private double result = 0;


    public operations (int firstNumber, String oper, int secondNumber) {
    switch (oper) {
        case ("/"):
            result = (double) firstNumber / secondNumber;
            break;
        case ("*"):
            result = firstNumber * secondNumber;
            break;
        case ("-"):
            result = firstNumber - secondNumber;
            break;
        case ("+"):
            result = firstNumber + secondNumber;
            break;
    }
    }

    @Override
    public String toString() {

          if (calcThis.flag) {
              if (result >= 1) {
                  return "Ответ " + arabToRim.convertIntegerToRoman((int) result);
              } else {return "Число не отображается римскими цифрами";
              }
          } else {
              return "Ответ " + result;
          }


    }
}
