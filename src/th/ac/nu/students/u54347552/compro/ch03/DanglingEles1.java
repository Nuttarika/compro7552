
package th.ac.nu.students.u54347552.compro.ch03;

public class DanglingEles1 {
    public static void main(String[] args) {
           int x = 5;
         if (x < 5)
             if (x > 5)
                 System.out.println('b');
         else
             System.out.println('a');

    }

    
}
