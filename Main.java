import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Window window = new Window("Калькулятор", 400, 300);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        String path = "C:\\Users\\akkau\\IdeaProjects\\MyCalculator\\src\\Image\\png-transparent-computer-icons-calculator-symbol-calculation-calculator-purple-blue-electronics.png";
        ImageIcon icon = new ImageIcon(path);
        window.setIconImage(icon.getImage());
    }
}

