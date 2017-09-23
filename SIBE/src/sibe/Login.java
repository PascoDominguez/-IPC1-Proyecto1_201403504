package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends JFrame {

    private JPanel contentpane;
    private JLabel lblUsuario, lblPassword, lblFondo;
    private JTextField txtUsuario, txtPassword;
    private Icon icoUsuario, icoPassword, icoFondo;
    private TextPrompt placeholder;
    private JButton btnLogin, btnSalir;
    Transaccion miTransaccion = new Transaccion();
    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;
    }

    public Login() {
        this.init_component();
        this.getContentPane().setBackground(Color.darkGray);
    }

    public void init_component() {
        setSize(900, 450);
        setLocationRelativeTo(null);
        setTitle("LOGIN");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.contentpane = (JPanel) this.getContentPane();
        this.contentpane.setLayout(null);
        this.contentpane.setSize(900, 450);

        //fondo ****************************************************************
        this.lblFondo = new JLabel("");
        this.icoFondo = new ImageIcon(getClass().getResource("/imagenes/ingenieria.png"));
        this.lblFondo.setIcon(icoFondo);
        this.lblFondo.setSize(200, 200);
        this.lblFondo.setLocation(30, 30);
        this.contentpane.add(this.lblFondo);

        //usuario *************************************************************
        this.lblUsuario = new JLabel("");
        this.icoUsuario = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
        this.lblUsuario.setIcon(icoUsuario);
        this.lblUsuario.setSize(100, 100);
        this.lblUsuario.setLocation(300, 110);
        this.contentpane.add(this.lblUsuario);

        this.txtUsuario = new JTextField();
        this.placeholder = new TextPrompt("Ingrese su Usuario", this.txtUsuario);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtUsuario.setSize(400, 30);
        this.txtUsuario.setLocation(340, 145);
        this.contentpane.add(this.txtUsuario);

        //password ************************************************************
        this.lblPassword = new JLabel("");
        icoPassword = new ImageIcon(getClass().getResource("/imagenes/password.png"));
        this.lblPassword.setIcon(icoPassword);
        this.lblPassword.setSize(100, 100);
        this.lblPassword.setLocation(300, 160);
        this.contentpane.add(this.lblPassword);

        this.txtPassword = new JPasswordField();
        this.placeholder = new TextPrompt("Ingrese su Password", this.txtPassword);
        this.placeholder.setForeground(Color.black);
        this.placeholder.changeAlpha(0.4f);
        this.txtPassword.setSize(400, 30);
        this.txtPassword.setLocation(340, 195);
        this.contentpane.add(this.txtPassword);

        //boton de login ******************************************************
        this.btnLogin = new JButton("LOGIN");
        this.btnLogin.setToolTipText("LOGIN");
        this.btnLogin.setSize(80, 30);
        this.btnLogin.setLocation(570, 250);
        this.btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnLogin(evt);
            }
        });
        this.contentpane.add(this.btnLogin);

        //boton salir ********************************************************
        this.btnSalir = new JButton("SALIR");
        this.btnSalir.setToolTipText("SALIR");
        this.btnSalir.setSize(80, 30);
        this.btnSalir.setLocation(660, 250);
        this.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSalir(evt);
            }
        });
        this.contentpane.add(this.btnSalir);

    }

    public void btnLogin(ActionEvent evt) {
        if (this.txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN USUARIO");
            this.txtUsuario.requestFocusInWindow();
            return;
        }
        //valida el usuario ***************************************************
        Datos misDatos = new Datos();
        if (!misDatos.validarUsuario(this.txtUsuario.getText(), this.txtPassword.getText())
                && !misDatos.validarClientes(this.txtUsuario.getText(), this.txtPassword.getText())) {
            JOptionPane.showMessageDialog(this, "CREDENCIALES INCORRECTAS");
            this.txtUsuario.setText("");
            this.txtPassword.setText("");
            this.txtUsuario.requestFocusInWindow();
            return;
        } else {
            if (misDatos.validarClientes(this.txtUsuario.getText(), this.txtPassword.getText())) {
                
                miTransaccion.setDatos(misDatos);
                miTransaccion.init_component();
                mostrarDAtos();
                tipoEmpresa();
                this.txtPassword.setText("");
                this.txtUsuario.setText("");
                return;
            }
        }
        // si todo esta bien se abre la ventana del Admin
        Admin miAdmin = new Admin();
        miAdmin.setDatos(misDatos);
        miAdmin.show();
        this.txtPassword.setText("");
        this.txtUsuario.setText("");

    }

    private void btnSalir(ActionEvent evt) {
        System.exit(0);
    }

    private void mostrarDAtos() {
        String registro[] = new String[3];
        for (int i = 0; i < misDatos.numeroCliente(); i++) {
            registro[0] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getUsuario();
            registro[1] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getSaldoInicial();
            registro[2] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getMontoMaximo();
            System.out.println("usuario: " + registro[0]);
            System.out.println("saldo inicial: " + registro[1]);
            System.out.println("monto maximo: " + registro[2]);
            break;
        }
        System.out.println("******************************");
        System.out.println("*********   CONSULTA    **********");
    }

    private void tipoEmpresa() {
        String registro[] = new String[1];
        for (int i = 0; i < misDatos.numeroCliente(); i++) {
            registro[0] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getEmpresa();
            if (registro[0].equals("1")) {
                miTransaccion.getContentPane().setBackground(Color.GRAY);
                String bancoPro = "PRO*PISTO";
                Transaccion.lblPropisto.setText(bancoPro);
            } else {
                if (registro[0].equals("0")) {
                    miTransaccion.getContentPane().setBackground(Color.GREEN);
//                    String bancoPro = "CASH-MONEY";
//                Transaccion.lblCashMoney.setText(bancoPro);
                }
            }

            break;
        }
    }
}
