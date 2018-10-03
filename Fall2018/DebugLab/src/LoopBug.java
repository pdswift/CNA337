/*
  The loop should print Count every iteration, but only prints at the end...
  CNA337
  Zachary Rubin zrubin@rtc.edu
*/
public class LoopBug
{
  public static void main(String[] args)
  {
    // Declare the variable.
    int Count =9;
    // Create the loop.
    for (Integer i = 0; i < 10; i++ ) {
      System.out.println(i);
    }
    {
      // Output the result.
    }      System.out.println("Count is " + Count);

  }
}