package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ConsultaSaldo extends JFrame {

    private JPanel contentPane;
    private JLabel lblSaldoActual, lblEmpresa;
    public static JTextField txtSaldoActual, txtEmpresa;
    private JButton btnRegresar;

    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;

    }

    public ConsultaSaldo() {
        this.init_component();
    }

    public void init_component() {

        setTitle("CONSULTA DE SALDO");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setLayout(null);
        this.contentPane.setSize(350, 250);

        this.lblEmpresa = new JLabel("BANCO ", (int) JLabel.RIGHT);
        this.lblEmpresa.setSize(100, 30);
        this.lblEmpresa.setLocation(10, 30);
        this.contentPane.add(lblEmpresa);

        this.txtEmpresa = new JTextField();
        this.txtEmpresa.setSize(160, 30);
        this.txtEmpresa.setLocation(150, 30);
        this.contentPane.add(this.txtEmpresa);
        this.txtEmpresa.setText("pasco");

        this.lblSaldoActual = new JLabel("SALDO ACTUAL", (int) JLabel.RIGHT);
        this.lblSaldoActual.setSize(100, 30);
        this.lblSaldoActual.setLocation(10, 80);
        this.contentPane.add(lblSaldoActual);

        this.txtSaldoActual = new JTextField();
        this.txtSaldoActual.setSize(160, 30);
        this.txtSaldoActual.setLocation(150, 80);
        this.contentPane.add(this.txtSaldoActual);

        //BOTONES **********************************************************

        //boton cancelar --------------------------------------
        this.btnRegresar = new JButton("REGRESAR");
        this.btnRegresar.setSize(105, 30);
        this.btnRegresar.setLocation(205, 150);
        this.btnRegresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnRegresar(e);
            }
        });
        this.contentPane.add(this.btnRegresar);
    }


    public void btnRegresar(ActionEvent e) {
        this.setVisible(false);
    }


}
