package hust.soict.globalict.lab1;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String [] agrs)
    {
        int option  = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You're chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
