import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
        f1.add(p1);
        interfaz();

        f1.repaint();
    }

    public void interfaz(){
        lbl = new JLabel("Ingrese Usuario");
        lbl.setBounds(20,10,100,20);
        p1.add(lbl);


        txtnombre = new JTextField();
        txtnombre.setBounds(150,70,100,20);
        p1.add(txtnombre);

        btnok = new JButton("ok");
        btnok.setBounds(200,200,50,20);
        p1.add(btnok);
        }




    public static void main(String[] args) {
           new john();
    }
}
