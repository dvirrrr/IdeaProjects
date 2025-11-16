public class Main {
    public static void main(String[] args) {
        // 1. שימוש בבנאי עם ערך התחלתי (num = 10)
        // הערך num מאותחל דרך הבנאי, אין צורך ב-setNum
        Calculator calc = new Calculator(10);

        // הדפסת התוצאה ההתחלתית (השימוש ב-getResult הכרחי כדי לראות את הערך)
        System.out.println("Start (num=10, result=0.0).");

        // --- הדגמת פעולות חשבון ---

        // 1. פעולת חיבור: result = 0.0 + 10 + 5 = 15.0
        try {
            calc.add(5);
            System.out.println("After add(5): " + calc.getResult()); // 15.0
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // 2. פעולת חילוק (ללא שינוי של num)
        // result = 15.0 / 3 = 5.0
        try {
            calc.div(3);
            System.out.println("After divide(3): " + calc.getResult()); // 5.0
        } catch (ArithmeticException e) {
            System.err.println("Divide Error: " + e.getMessage());
        }

        // 3. פעולת עצרת (משתמשת בערך num=10, מחשבת 10!)
        // result = 3,628,800.0 (משתמש ב-num המקורי: 10)
        try {
            calc.factorial();
            System.out.println("After factorial (of num=10): " + calc.getResult()); // 3628800.0
        } catch (IllegalArgumentException e) {
            System.err.println("Factorial Error: " + e.getMessage());
        }

        // --- הדגמת חריג (חילוק באפס) ---

        // 4. פעולת חילוק שתיכשל
        try {
            calc.div(0);
            System.out.println("This line will not be executed.");
        } catch (ArithmeticException e) {
            System.err.println("\nCaught Exception: " + e.getMessage());
        }

        // 5. שימוש בבנאי ברירת מחדל (num=0)
        Calculator calcDefault = new Calculator();
        System.out.println("\nStart Default (num=0, result=0.0).");

        // שימוש בפעולה שמסתמכת על num=0.0
        // result = 0.0 + 0 + 20 = 20.0
        calcDefault.add(20);
        System.out.println("Default after add(20): " + calcDefault.getResult()); // 20.0
    }
}