package agenda.telefonica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class ventanita extends JFrame {

    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JLabel lblResultado = new JLabel("total");
     
    public ventanita() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void insertpanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null);
}
    public void insertarEtiquetas() {
        JLabel lblValor1 = new JLabel("Teléfono");
        lblValor1.setBounds(20, 10, 200, 10);
        panelInicio.add(lblValor1);

        JLabel lblValor2 = new JLabel("Nombre");
        lblValor2.setBounds(20, 10, 170, 150);
        panelInicio.add(lblValor2);
        
        JLabel lblValor3 = new JLabel("Correo");
        lblValor3.setBounds(20, 10, 150, 150);
        panelInicio.add(lblValor3);


        lblResultado.setBounds(20, 180, 200, 25);
        panelInicio.add(lblResultado);
}
}