
    public class EX2Checker {
        public static void main(String[] arr) {
            System.out.println("--- Main Started ---");
            ID_EX2 sc = new ID_EX2();
            Class c = sc.getClass();
            System.out.println("Checking " + c);


            int x = 7016;
            System.out.println("1.sumDigits(" + x + ")= " + sc.sumDigits(x));


            System.out.println("2.countDigitsBiggerThan5(" + x +")= " +
                    sc.countDigitsBiggerThan5(x));

            int n = 6;
            System.out.println("3.countDigitsBiggerThanN(" + x + "," + n+ ")= "+
                    sc.countDigitsBiggerThanN(x, n));
            System.out.println("4. sumEvenDigits(" + x + ")=" + sc.sumEvenDigits(x));
            System.out.println("5. sumOddDigits(" + x + ")=" + sc.sumOddDigits(x));


            n = 2;
            x = 760;
            System.out.println("6. getDigitAtIndexN(" + x +"," + n + ")=" + sc.getDigitAtIndexN(x, n));

            n = 0;
            System.out.println("6b. getDigitAtIndexN(" + x + "," + n + ")=" + sc.getDigitAtIndexN(x, n));

            x = 0;
            System.out.println("6c. getDigitAtIndexN(" + x + "," + n + ")=" + sc.getDigitAtIndexN(x, n));
            n = 1;
            System.out.println("6d. getDigitAtIndexN(" + x + "," + n + ")=" + sc.getDigitAtIndexN(x, n));

            int a = 5465;
           int b = 416;
            System.out.println("7a. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));

            a = 540;
            b = 40;
            System.out.println("7b. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));

            a = 0;
            b = 0;
            System.out.println("7c. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));
            a = 23;
            b = 10;

            System.out.println("7d. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));
            a = 4321;
            b= 987;
            System.out.println("7f. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));
            a = 3303;
            b = 4404;
            System.out.println("7e. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));
            a = 3401;
            b = 304;
            System.out.println("7h. firstIdenticalDigitIn2Numbers(" + a + "," + b + ")=" +
                    sc.firstIdenticalDigitIn2Numbers(a, b));

            System.out.println("8. getMaxDigit(" + b + ")=" + sc.getMaxDigit(b));

            b = 541;
            System.out.println("8. getMaxDigit(" + b + ")=" + sc.getMaxDigit(b));

            System.out.println("8a. getMaxDigit(" + b + ")=" + sc.getMaxDigit(b));
            b = 0;
            System.out.println("8b. getMaxDigit(" + b + ")=" + sc.getMaxDigit(b));
            b = 99;
            System.out.println("8c. getMaxDigit(" + b + ")=" + sc.getMaxDigit(b));
            b = 2309;
            System.out.println("9a. getMinDigit(" + b + ")=" + sc.getMinDigit(b));

            b = 0;
            System.out.println("9b. getMinDigit(" + b + ")=" + sc.getMinDigit(b));

            x = 12340;
            //System.out.println("10. sumDigitsInEvenIndex(" + x + ")=" + sc.sumDigitsInEvenLocation(x));
            //System.out.println("11. sumDigitsInOddIndex(" + x + ")=" + sc.sumDigitsInOddIndex(x));

            System.out.println("10. sumDigitsInEvenLocation(" + x + ")=" + sc.sumDigitsInEvenLocation(x));
            System.out.println("11. sumDigitsInOddLocation(" + x + ")=" + sc.sumDigitsInOddLocation(x));

            System.out.println("--- Main Ended (11 tasks overall) ---");

            /**/
        }
    }

