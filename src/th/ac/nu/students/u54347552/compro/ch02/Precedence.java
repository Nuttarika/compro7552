
package th.ac.nu.students.u54347552.compro.ch02;

public class Precedence {
    public static void main(String[] args) {
        System.out.println(1 + 2 * 3); // 7
        System.out.println((1 + 2) * 3); // 9
        System.out.println(1 + (2 * 3)); // 7
    }
}
