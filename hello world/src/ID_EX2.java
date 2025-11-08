public class ID_EX2
{
    public static int sumDigits(int num) // 1
    {
        if (num/10==0)
        {
            return num;
        }
        return sumDigits(num/10) + num%10;
    }
    public static int countDigitsBiggerThan5(int num) // 2
    {
        int count=0;
        if (num%10>5)
        {
            count=1;
        }
        if (num/10==0)
        {
            return count;
        }
        return countDigitsBiggerThan5(num/10) + count;
    }
    public static int countDigitsBiggerThanN(int x, int n) // 3
    {
        int count=0;
        if (x%10>n)
        {
            count=1;
        }
        if (x/10==0)
        {
            return count;
        }
        return countDigitsBiggerThanN(x/10, n) + count;
    }
    public static int sumEvenDigits(int num) // 4
    {
        if (num/10==0 && num%2==0)
        {
            return num;
        }
        if (num%2==0)
        {
            return sumEvenDigits(num/10) + num%10;
        }
        else 
        {
            return sumEvenDigits(num/10);
        }
    }
    public static int sumOddDigits(int num) // 5
    {
        if ((num/10==0 && num%2==1 || num==0 ))
        {
            return num;
        }
        if (num%2==1)
        {
            return sumOddDigits(num/10) + num%10;
        }
        else 
        {
            return sumOddDigits(num/10);
        }
    }
    public static int getDigitAtIndexN(int x, int i) // 6
    {
        int rv;
        if (i==0)
        {
            return x%10;
        }
        else
        {
            rv = getDigitAtIndexN(x/10, i-1);
            if (rv==0 && x/10==0)
            {
                return -1;
            }
            else
            {
                return rv;
            }
        }
    }
    public static int firstIdenticalDigitIn2Numbers(int num1, int num2) // 7
    {
        int rv;
        if (num1%10==num2%10)
        {
            return num1%10;
        }
        else
        {
            rv = firstIdenticalDigitIn2Numbers(num1 / 10, num2 / 10);
            if (rv==0 && (num1/10==0 || num2/10==0))
            {
                return -1;
            }
            else
            {
                return rv;
            }
        }
    }
    public static int getMaxDigit(int num) // 8
    {
        int rv=0;
        if (num!=0)
        {
            rv += getMaxDigit(num/10);
            if (num%10>rv)
            {
                rv = num%10;
            }
        }
        return rv;
    }
    public static int getMinDigit(int num) // 9
    {
        int rv;
        if (num!=0)
        {
            rv = getMinDigit(num/10);
            if (num%10<rv)
            {
                rv = num%10;
            }
        }
        else
        {
            rv=num;
        }
        return rv;
    }
    public static int sumDigitsInEvenLocation(int n) // 10
    {
        n /= 10;
        int rv=0;
        if (n > 0) {
            rv += n%10+sumDigitsInEvenLocation(n/10);
        }
        return rv;
    }
    public static int sumDigitsInOddLocation(int n) // 11
    {
        int rv=0;
        if (n > 0) {
            rv += n%10+sumDigitsInOddLocation(n/100);
        }
        return rv;
    }
    
}// עזרתי לגיא לשם ויונתן פרג

