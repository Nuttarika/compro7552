
package th.ac.nu.students.u54347552.compro.ch02;

public class MaximumValue1 {
    public static void main(String [] args){
      int num1 = 2147483647;
      System.out.println(num1);   // 2147483647
      System.out.println(num1+1);   // -2147483648
      int num2 = -2147483648;
      System.out.println(num2);   //-2147483648
      System.out.println(num2-1);   // 2147483647
    }
}
