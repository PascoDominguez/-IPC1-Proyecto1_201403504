package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Admin extends JFrame {

    private JPanel contentpane;
    private JLabel lblNombre, lblUsuario, lblPassword, lblSaldo_inicial, lblMonto_maximo, lblEmpresa;
    private JLabel lblAdministrador;
    private JTextField txtNombre, txtUsuario, txtPassword, txtSaldo_inicial, txtMonto_maximo;
    private JButton btnGuardar, btnBuscar, btnSalir;
    private Icon icoAdministrador, icoGuardar, icoBuscar, icoSalir;
    private TextPrompt placeholder;
    private JComboBox cmbEmpresa;
    private String empresa[] = {"cash-money", "proPisto"};

    //crear un objeto de tipo cliente dentro de la clase Admin
    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;
        
    }

    public Admin() {
        this.init_componenet();
    }

    public void init_componenet() {
        /*
         cada vez que se envia un objeto se envia su posicion de memoria en la cual
         la podemos asignar a cualquier objeto del mismo tipo en otra classe
         por lo que podemos asignar su posicion de memoria
         */

        setSize(900, 450);
        setLocationRelativeTo(null);
        setTitle("MODULO ADMINISTRADOR");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.contentpane = (JPanel) this.getContentPane();
        this.contentpane.setLayout(null);
        this.contentpane.setSize(900, 450);

        //********************************************************************//
        //                      Jtextfield y Jlabel                           //
        //********************************************************************//
        this.lblAdministrador = new JLabel();
        this.icoAdministrador = new ImageIcon(getClass().getResource("/imagenes/Administrador.png"));
        this.lblAdministrador.setIcon(icoAdministrador);
        this.lblAdministrador.setSize(256, 256);
        this.lblAdministrador.setLocation(30, 60);
        this.contentpane.add(this.lblAdministrador);

        //nombre
        this.lblNombre = new JLabel("Nombre");
        this.lblNombre.setSize(100, 30);
        this.lblNombre.setLocation(350, 30);
        this.contentpane.add(this.lblNombre);

        this.txtNombre = new JTextField();
        this.placeholder = new TextPrompt("Nombre del Usuario", this.txtNombre);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtNombre.setSize(300, 30);
        this.txtNombre.setLocation(455, 30);
        this.contentpane.add(this.txtNombre);

        //usuario
        this.lblUsuario = new JLabel("Usuario");
        this.lblUsuario.setSize(100, 30);
        this.lblUsuario.setLocation(350, 70);
        this.contentpane.add(this.lblUsuario);

        this.txtUsuario = new JTextField();
        this.placeholder = new TextPrompt("Usuario", this.txtUsuario);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtUsuario.setSize(300, 30);
        this.txtUsuario.setLocation(455, 70);
        this.contentpane.add(this.txtUsuario);

        //contrasenia
        this.lblPassword = new JLabel("Password");
        this.lblPassword.setSize(100, 30);
        this.lblPassword.setLocation(350, 110);
        this.contentpane.add(this.lblPassword);

        this.txtPassword = new JPasswordField();
        this.placeholder = new TextPrompt("Ingrese su contraseña", this.txtPassword);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtPassword.setSize(300, 30);
        this.txtPassword.setLocation(455, 110);
        this.contentpane.add(this.txtPassword);

        //saldo inicial
        this.lblSaldo_inicial = new JLabel("Saldo Inicial");
        this.lblSaldo_inicial.setSize(100, 30);
        this.lblSaldo_inicial.setLocation(350, 150);
        this.contentpane.add(this.lblSaldo_inicial);

        this.txtSaldo_inicial = new JTextField();
        this.placeholder = new TextPrompt("Saldo Inicial", this.txtSaldo_inicial);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtSaldo_inicial.setSize(300, 30);
        this.txtSaldo_inicial.setLocation(455, 150);
        this.contentpane.add(this.txtSaldo_inicial);

        //monto maximo
        this.lblMonto_maximo = new JLabel("Monto Máximo");
        this.lblMonto_maximo.setSize(100, 30);
        this.lblMonto_maximo.setLocation(350, 190);
        this.contentpane.add(this.lblMonto_maximo);

        this.txtMonto_maximo = new JTextField();
        this.placeholder = new TextPrompt("Monto Máximo", this.txtMonto_maximo);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtMonto_maximo.setSize(300, 30);
        this.txtMonto_maximo.setLocation(455, 190);
        this.contentpane.add(this.txtMonto_maximo);

        //empresa
        this.lblEmpresa = new JLabel("Empresa");
        this.lblEmpresa.setSize(100, 30);
        this.lblEmpresa.setLocation(350, 230);
        this.contentpane.add(this.lblEmpresa);

        this.cmbEmpresa = new JComboBox(empresa);
        this.cmbEmpresa.setSize(300, 30);
        this.cmbEmpresa.setLocation(455, 230);
//        this.cmbEmpresa.addItem("CASH-MONEY");
//        this.cmbEmpresa.addItem("PRO-PISTO");
        this.contentpane.add(this.cmbEmpresa);

        //********************************************************************//
        //                      botones                                       //
        //********************************************************************//
        this.btnSalir = new JButton();
        this.icoSalir = new ImageIcon(getClass().getResource("/imagenes/exit.png"));
        this.btnSalir.setIcon(icoSalir);
        this.btnSalir.setSize(35, 35);
        this.btnSalir.setLocation(620, 275);
        this.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSalir(evt);
            }
        });
        this.contentpane.add(this.btnSalir);

        //boton buscar
        this.btnBuscar = new JButton();
        this.icoBuscar = new ImageIcon(getClass().getResource("/imagenes/buscar.png"));
        this.btnBuscar.setIcon(icoBuscar);
        this.btnBuscar.setSize(35, 35);
        this.btnBuscar.setLocation(580, 275);
        this.btnBuscar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnBuscar(evt);
            }
        });
        this.contentpane.add(this.btnBuscar);

        //boton guardar
        this.btnGuardar = new JButton();
        this.icoGuardar = new ImageIcon(getClass().getResource("/imagenes/guardar.png"));
        this.btnGuardar.setIcon(icoGuardar);
        this.btnGuardar.setSize(35, 35);
        this.btnGuardar.setLocation(540, 275);
        this.btnGuardar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnGuardar(evt);
            }
        });
        this.contentpane.add(this.btnGuardar);
    }

    //************************************************************************//
    //                        eventos de los botones                          //
    //************************************************************************//
    public void btnSalir(ActionEvent evt) {
        this.setVisible(false);
    }

    public void btnBuscar(ActionEvent evt) {

    }

    public void btnGuardar(ActionEvent evt) {
        if (this.txtNombre.getText().equals("") || this.txtUsuario.getText().equals("")
                || this.txtPassword.getText().equals("") || this.txtSaldo_inicial.getText().equals("")
                || this.txtMonto_maximo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos de texto");

        }
 
        
        Cliente miClinete = new Cliente(
                this.txtNombre.getText(),
                this.txtUsuario.getText(),
                this.txtPassword.getText(),
                this.cmbEmpresa.getSelectedIndex(),
                Double.parseDouble(this.txtSaldo_inicial.getText()),
                Double.parseDouble(this.txtMonto_maximo.getText()));

        String msg = misDatos.agregarcliente(miClinete);
        JOptionPane.showMessageDialog(this, msg);

        this.limpiar();
    }

    private void limpiar() {
        this.txtNombre.setText("");
        this.txtUsuario.setText("");
        this.txtPassword.setText("");
        this.txtSaldo_inicial.setText("");
        this.txtMonto_maximo.setText("");
    }
}
