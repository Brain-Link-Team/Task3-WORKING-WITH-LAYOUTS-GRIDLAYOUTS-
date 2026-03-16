import java.awt.*;
import javax.swing.*;

public class T3 {

    JFrame frame = new JFrame();
    JPanel panelOne, panelTwo, panelThree;

    T3() {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 3));
        frame.add(panOne());
        frame.add(panTwo());
        frame.add(panThree());
        frame.setVisible(true);
    }

    JPanel panOne() {
        panelOne = new JPanel();
        panelOne.setBackground(Color.BLUE);
        return panelOne;
    }

    JPanel panTwo() {
        panelTwo = new JPanel();
        panelTwo.setBackground(Color.WHITE);
        return panelTwo;
    }

    JPanel panThree() {
        panelThree = new JPanel();
        panelThree.setBackground(Color.red);
        return panelThree;
    }

    public static void main(String[] args) {
        new T3();
    }
}
