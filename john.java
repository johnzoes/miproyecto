import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class john extends JFrame {
    JLabel lbl;
    JTextField txtnombre;
    JButton btnok;
    JPanel p1;

    public john(){
        JFrame f1= new JFrame();
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setSize(400,600);
        f1.setVisible(true);
         p1 = new JPanel();
         p1.setBounds(0,0,400,600);
         p1.setVisible(true);
         p1.setLayout(null);
         p1.setBackground(new Color(34,34,34));
        f1.add(p1);
        interfaz();

        f1.repaint();
    }

    public void interfaz(){
        this.setLayout(null);
        lbl = new JLabel("Usuario");
        lbl.setBounds(10,50,100,20);
        lbl.setFont(new Font("SF Pro", 1, 20));
        lbl.setForeground(Color.white);
        p1.add(lbl);


        txtnombre = new JTextField();
        txtnombre.setBounds(100,70,100,20);
        p1.add(txtnombre);

        btnok = new JButton("Ok");
        btnok.setBounds(200,200,70,20);
        btnok.setBackground(Color.white);
        btnok.setFont(new Font("SF Pro", 1, 15));
        p1.add(btnok);
        }




    public static void main(String[] args) {
           new john();
    }
}
