import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDayChooser;

public class ControlCalendario extends JFrame {

    public static void main(String[] args) {
        JFrame v = new JFrame("Mi Calendario");

        v.setLayout(new GridLayout(1, 2));
        v.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        v.add(new JLabel("Selecciona fecha"));
        v.add(new JDayChooser());

        v.pack();
        v.setVisible(true);
    }
}


