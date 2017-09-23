package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TransDenominacion extends JFrame {

    private JPanel contentPane;
    private JLabel lblMonto, nombreUsuario;
    private JComboBox cmbDenominacion, cmbAmigo;
    private JButton btnTransferir, btnCancelar;
    private int Denominacion[] = {5, 10, 20, 50, 100, 200, 300, 500, 1000};
    Transaccion tra = new Transaccion ();
    public  String[] amigos = tra.amigo;

    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;
    }

    public TransDenominacion() {
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

        this.nombreUsuario = new JLabel("LISTA DE AMIGOS");
        this.nombreUsuario.setSize(150, 30);
        this.nombreUsuario.setLocation(10, 30);
        this.contentPane.add(nombreUsuario);
      
        this.cmbAmigo = new JComboBox();
        for (String amigo : amigos) {
            this.cmbAmigo.addItem(amigo);
        }
        this.cmbAmigo.setSize(160, 30);
        this.cmbAmigo.setLocation(150, 30);
        this.contentPane.add(cmbAmigo);

        this.lblMonto = new JLabel("MONTO", (int) JLabel.LEFT_ALIGNMENT);
        this.lblMonto.setSize(150, 30);
        this.lblMonto.setLocation(10, 80);
        this.contentPane.add(lblMonto);

        this.cmbDenominacion = new JComboBox();
        for (int i = 0; i < Denominacion.length; i++) {
            this.cmbDenominacion.addItem(Denominacion[i]);
        }
        this.cmbDenominacion.setSize(160, 30);
        this.cmbDenominacion.setLocation(150, 80);
        this.contentPane.add(this.cmbDenominacion);

        //BOTONES **********************************************************
        //boton transferir ----------------------------
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

        //boton cancelar -------------------------------
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
        TransDenominacion tf = new TransDenominacion();
        tf.show();
    }

    public void btnTransferir(ActionEvent e) {
     
    }

    public void btnCancelar(ActionEvent e) {
        this.setVisible(false);
    }



}
