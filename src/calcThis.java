import java.util.HashSet;
import java.util.Set;

public class calcThis {
    public static boolean flag = false;

    public void calc(String stringToCalc) throws calcExeption {

        stringToCalc = stringToCalc.trim();
        String[] arrToCalc = stringToCalc.split(" ");
        if (arrToCalc.length < 2) {throw new calcExeption("Введите числа и знаки через пробел, например вот так: 5 + 5 или V + VIII"); }

        int firstItem = 0, threeItem = 0;

        if (initElementSet.intRomanMap.containsValue(arrToCalc[0]) && initElementSet.intRomanMap.containsValue(arrToCalc[2])) {

            firstItem = Integer.parseInt(arrToCalc[0]);
            threeItem = Integer.parseInt(arrToCalc[2]);
            flag = false;
        } else
        if (initElementSet.intRomanMap.containsKey(arrToCalc[0]) && initElementSet.intRomanMap.containsKey(arrToCalc[2])) {

            firstItem = Integer.parseInt(initElementSet.intRomanMap.get(arrToCalc[0]));
            threeItem = Integer.parseInt(initElementSet.intRomanMap.get(arrToCalc[2]));
            flag = true;
        } else {
            throw new calcExeption("Что то пошло не так, введите целые числа от 1 до 10. Римские или арабские.");
        }


            if (initElementSet.operSet.contains(arrToCalc[1])){
                System.out.println(new operations(firstItem, arrToCalc[1], threeItem));
            } else {throw new calcExeption("Я могу работать только с / , * , + , -");}


    }
}
