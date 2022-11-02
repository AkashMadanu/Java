import java.io.FilterOutputStream;
import java.util.Random;

public class PassGenerator{
    public static void main(String[] args) {
        Random rand = new Random();

        int ralpha1 =rand.nextInt(26);
        int rAlpha1 =rand.nextInt(27);
        int rSymbol1= rand.nextInt(18);
        int rNumbers1 = rand.nextInt(10);

        int ralpha2 =rand.nextInt(26);
        int rAlpha2 =rand.nextInt(27);
        int rSymbol2= rand.nextInt(18);
        int rNumbers2 = rand.nextInt(10);

        int ralpha3 =rand.nextInt(26);
        int rAlpha3 =rand.nextInt(27);
        int rSymbol3= rand.nextInt(18);
        int rNumbers3 = rand.nextInt(10);

        String alphabets = "qwertyuioplkjhgfdsazxcvbnm";
        String Alphabets = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String symbols   = "!@#$%^&*()/*-+`~,.";


        String alpha1 = String.valueOf(alphabets.charAt(ralpha1));
        String Alpha1 = String.valueOf(Alphabets.charAt(rAlpha1));
        String symbol1 = String.valueOf(symbols.charAt(rSymbol1));

        String alpha2 = String.valueOf(alphabets.charAt(ralpha2));
        String Alpha2 = String.valueOf(Alphabets.charAt(rAlpha2));
        String symbol2 = String.valueOf(symbols.charAt(rSymbol2));

        String alpha3 = String.valueOf(alphabets.charAt(ralpha3));
        String Alpha3 = String.valueOf(Alphabets.charAt(rAlpha3));
        String symbol3 = String.valueOf(symbols.charAt(rSymbol3));

        String passWord = Alpha3 + symbol1 + rNumbers2 + alpha3 + alpha2 + rNumbers1 + symbol2 + Alpha2 + alpha1 + Alpha1 + symbol3 + rNumbers3;

        System.out.println(passWord);
    }
}