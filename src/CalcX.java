import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcX {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        new initElementSet();
        calcThis calcInputString = new calcThis();
        while (true) {
            try {
                inputString = reader.readLine();
                if (inputString.equalsIgnoreCase("exit")) return;
                calcInputString.calc(inputString);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (calcExeption e) {
                System.out.println(e);
            }

        }
    }
}
