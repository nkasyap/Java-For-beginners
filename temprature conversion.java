// Create a Main class
public class Main {
 
  // Create a celcius() method
  public void celcius(int f) {
     int c =(f-32)*5/9;
    System.out.println("Temprature in celcius is:"+ c);
  }

  // Create a ferenheit() method and add a parameter
  public void ferenheit(int c) {
    int f=c*(9/5)+32;
    System.out.println("Temprature in Farenheit is: "+ f);
  }

  // Inside main, call the methods on the temp object
  public static void main(String[] args) {
    Main temp = new Main();     // Create a temp object
    temp.celcius(30);      // Call the celcius() method
    temp.ferenheit(20);          // Call the ferenheit() method
  }
}
