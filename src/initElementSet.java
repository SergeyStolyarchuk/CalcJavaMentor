import java.util.HashMap;
import java.util.HashSet;

public class initElementSet {
    static final HashSet <String> operSet = new HashSet<String>();
    static final HashMap <String, String> intRomanMap = new HashMap<String, String>();

    initElementSet(){

        intRomanMap.put("I", "1");
        intRomanMap.put("II", "2");
        intRomanMap.put("III", "3");
        intRomanMap.put("IV", "4");
        intRomanMap.put("V", "5");
        intRomanMap.put("VI", "6");
        intRomanMap.put("VII", "7");
        intRomanMap.put("VIII", "8");
        intRomanMap.put("IX", "9");
        intRomanMap.put("X", "10");

        operSet.add("/");
        operSet.add("*");
        operSet.add("+");
        operSet.add("-");
    }
}
