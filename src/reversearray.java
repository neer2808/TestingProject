public class reversearray {
  public static int[] reverse(int arr[]) {
    long sum = 0;
    int rem = 0;
    boolean check[] = new boolean[arr.length];
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < 0)
      {
        check[i] = true;
        arr[i] *= -1;
      }
      while (arr[i] > 0)
      {
        rem = arr[i] % 10;
        sum = sum * 10 + rem;
        arr[i] = arr[i] / 10;
      }
      if (sum > Integer.MAX_VALUE)
      {
        sum= 0;
      }
// use of Ternary Operator
      arr[i] = check[i]?(int)(-1*sum):(int)sum;
// With using if else
//      if (check[i]) {
//          arr[i] = (int) (-1 * sum);
//
//      } else {
//          arr[i] = (int)sum;
//        }
        sum = 0;
    }
      return arr;
    }
    public static void main(String[] args)
    {
      int arr[] = {123, 2147483647, -789, 680, 543, 561};

      // Static method invocation without object creation that returns array as return type
      arr = reverse(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
//        if (i < arr.length - 1) {
//          System.out.print(",");
//        }
      }
    }
 }



