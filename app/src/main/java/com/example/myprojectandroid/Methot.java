package com.example.myprojectandroid;

public class Methot {
    public static String charDeleteMetod (String str) {
        char[] chars = str.toCharArray ();
        String strFinal = "";

        for (int i = 0; i < chars.length - 1; i++) {
            strFinal += chars[i];
        }
        return strFinal;
    }

    public static double reseltDouble (String str, double a, double b) {
        double reselt = 0;

        switch (str) {
            case "/" :
                reselt = a / b;
                break;
            case "*" :
                reselt = a * b;
                break;
            case "-" :
                reselt = a - b;
                break;
            case "+" :
                reselt = a + b;
                break;
        }

        return reselt;
    }

    public static boolean isNamberFol (String str) {
        boolean booleanFinal = false;

        if (str.length () < 6) {
            booleanFinal = true;
        }

        return booleanFinal;
    }

    public static boolean isPoint (String str) {
        boolean booleanFinal = true;
        char[] chars = str.toCharArray ();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                booleanFinal = false;
            }
        }

        return booleanFinal;
    }

    public static boolean isEqually (String str) {
        boolean booleanFinal = true;

        char[] chars = str.toCharArray ();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '=') {
                booleanFinal = false;
            }
        }

        return booleanFinal;
    }

    public static String isMyMetod (String str) {
        String[] strings = str.split(" ");
        char strFinal = ' ';

        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case "÷" :
                    strFinal = '÷';
                    break;
                case "×" :
                    strFinal = '×';
                    break;
                case "-" :
                    strFinal = '-';
                    break;
                case "+" :
                    strFinal = '+';
                    break;
            }

            if (strFinal !=  ' ') {
                break;
            }
        }

        int pox = str.indexOf(strFinal);
        int pox1 = str.indexOf('+');
        int pox2 = str.indexOf('-');
        int pox3 = str.indexOf('*');

        int intFinal = 0;

        if (pox <= 7 ) {
            intFinal = pox;
        } else if (pox1 <= 7) {
            intFinal = pox1;
        } else if (pox2 <= 7) {
            intFinal = pox2;
        } else if (pox3 <= 7) {
            intFinal = pox3;
        }

        String strFinal1 = "";

        char[] chars = str.toCharArray();
        for (int i = intFinal + 2; i < chars.length; i++) {
            strFinal1 += chars[i];
        }

        return strFinal1;
    }

    public static boolean isPoop (String str) {

        boolean booleanFinal = false;
        char[] chars = str.toCharArray ();
        int a = 0;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '÷' :
                    a++;
                    break;
                case '×' :
                    a++;
                    break;
                case '-' :
                    a++;
                    break;
                case '+' :
                    a++;
                    break;
            }
        }

        if (a == 2) {
            booleanFinal = true;
        }

        return booleanFinal;
    }
}
