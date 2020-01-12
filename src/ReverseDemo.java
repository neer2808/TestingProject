public class ReverseDemo {
  public static int reverseInteger(int number) {
    //boolean isNegative = number < 0 ? true : false;
    boolean isNegative= false;
    if(number<0)
    {
      isNegative = true;
      number *= -1;
    }

    long reverse = 0;
    int lastDigit = 0;

    while (number >= 1) {
      lastDigit = number % 10; // gives you last digit
      reverse = reverse * 10 + lastDigit;
      number = number / 10; // get rid of last digit
    }
    if(reverse>Integer.MAX_VALUE)
    {
      return 0;
    }
    return  isNegative ? (int)(-1*reverse) : (int)reverse;

  }

  public static void main(String[] args) {
    System.out.println(reverseInteger(2147483647));
    //System.out.println(Integer.MAX_VALUE);
    //System.out.println(reverseInteger());
  }

}
