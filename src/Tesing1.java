public class Tesing1 {
  static int arr[] = new int[10];
  public void display()
  {
    for (int i =0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public void initialize()
  {
    for (int i =0;i<arr.length;i++)
    {
      arr[i] = i;
    }
  }
  public int searchElement()
  {
    int j;
    int val= 4;
    for(j =0;j<arr.length;j++)
    {
        if(arr[j]==val)
        {
          break;
        }
    }
    if(j == arr.length)
    {
      return -1;
    }
    else
    {
      return j;
    }
  }
  public void delete()
  {
    int i;
    int indexposition = searchElement();
    for( i = indexposition;i<arr.length-1;i++)
    {
      arr[i]= arr[i+1];

    }
    arr[i]= 0;
  }
  public static void main(String[] args) {
    Tesing1 obj = new Tesing1();
    obj.initialize();
   // obj.display();
   int position =  obj.searchElement();
   if(position == -1)
   {
     System.out.println("element not found");
   }
   System.out.println(position);
   obj.delete();
   obj.display();
  }
}
