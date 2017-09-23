package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TransLibre extends JFrame {

    private JPanel contentPane;
    private JLabel lblMonto, nombreUsuario;
    private JTextField txtMonto, txtNombreUsuario;
    private TextPrompt placeholder;
    private JComboBox cmbDenominacion;
    private JButton btnTransferir, btnCancelar;
//    private String Denominacion[] = {"5", "10", "20", "50", "100", "200", "300", "500", "1000"};
    private int Denominacion[] = {5, 10, 20, 50, 100, 200, 300, 500, 1000};

    public TransLibre() {
        this.init_component();
    }

    public void init_component() {

        setTitle("TRANSFERENCIA");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setLayout(null);
        this.contentPane.setSize(350, 250);

        this.nombreUsuario = new JLabel("NOMBRE DE USUARIO");
        this.nombreUsuario.setSize(150, 30);
        this.nombreUsuario.setLocation(10, 30);
        this.contentPane.add(nombreUsuario);

        this.txtNombreUsuario = new JTextField();
        this.placeholder = new TextPrompt("Nombre del Usuario", this.txtNombreUsuario);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtNombreUsuario.setSize(160, 30);
        this.txtNombreUsuario.setLocation(150, 30);
        this.contentPane.add(this.txtNombreUsuario);

        this.lblMonto = new JLabel("MONTO", (int) JLabel.LEFT_ALIGNMENT);
        this.lblMonto.setSize(150, 30);
        this.lblMonto.setLocation(10, 80);
        this.contentPane.add(lblMonto);

        this.txtMonto = new JTextField();
        this.placeholder = new TextPrompt("Monto a depositar", this.txtMonto);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtMonto.setSize(160, 30);
        this.txtMonto.setLocation(150, 80);
        this.contentPane.add(this.txtMonto);

        //BOTONES **********************************************************
        
        //boton transferir --------------------------------------
        this.btnTransferir = new JButton("TRANSFERIR");
        this.btnTransferir.setSize(105, 30);
        this.btnTransferir.setLocation(91, 150);
        this.btnTransferir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnTransferir(e);
            }
        });
        this.contentPane.add(this.btnTransferir);
        
        //boton cancelar --------------------------------------
        this.btnCancelar = new JButton("CANCELAR");
        this.btnCancelar.setSize(105, 30);
        this.btnCancelar.setLocation(205, 150);
        this.btnCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancelar(e);
            }
        });
        this.contentPane.add(this.btnCancelar);
    }

    public static void main(String args[]) {
        TransLibre tl = new TransLibre();
        tl.show();
    }
    public void btnTransferir (ActionEvent e){
        
    }
    public void btnCancelar (ActionEvent e){
      this.setVisible(false);
    }

}
