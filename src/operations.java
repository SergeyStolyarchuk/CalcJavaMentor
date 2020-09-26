public class operations {
    private int firstNumber = 0;
    private int secondNumber = 0;
    private int result = 0;


    public operations (int firstNumber, String oper, int secondNumber) {
    switch (oper) {
        case ("/"):
            result = firstNumber / secondNumber;
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
              return "Ответ " + arabToRim.convertIntegerToRoman(result);
          } else {
              return "Ответ " + result;
          }


    }
}
