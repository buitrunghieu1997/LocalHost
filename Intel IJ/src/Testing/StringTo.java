package Testing;
import javax.swing.JOptionPane;

public class StringTo {
    public static long Check (int num) {
        for(int i = 2; i <= (int)Math.sqrt(num); ++i)
            if(num % i == 0) return 0;
        return 1;
    }
    public static void main(String[] args) {
        int num, chk = 0, i = 2;
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        String msg = num + " = ";
        System.out.print("So we have: ");
        while(num != 1) {
            if(num % i == 0 && Check(i) == 1) {
                msg += i;
                num = num/i;
                if (num == 1) chk = 1;
                if (chk == 0) msg += "*";
            }
            else ++i;
        }
        JOptionPane.showMessageDialog(null, msg);
        System.out.println(msg);
    }
}
