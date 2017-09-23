package sibe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Transaccion extends JFrame {

    private JPanel contentpane;
    public static JLabel lblPropisto;
    public static JLabel lblCashMoney;
    private JLabel lblBanco, lblLogo, lblSeleccioneTransaccion;
    private JLabel lblTranferencia, lblRetiro, lblConsulta, lblCompra, lblHistorial, lblGrafica;
    private Icon icoLogo, icoTransferencia, icoRetiro, icoConsulta, icoCompra;
    private Icon icoHistorial, icoGrafica, icoCerrar;
    private JButton btnTransferencia, btnRetiro, btnConsulta, btnCompra;
    private JButton btnHistorial, btnGrafica, btnCerrar;
    public static String amigo[];

    //atributos
    private Datos misDatos;

    public void setDatos(Datos datos) {
        misDatos = datos;

    }

//    public Transaccion() {
//        this.init_component();
//
//    }

    public void init_component() {
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("TRANSACCIONES");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        this.contentpane = (JPanel) this.getContentPane();
        this.contentpane.setLayout(null);
        this.contentpane.setSize(600, 500);

        this.lblLogo = new JLabel("");
        this.icoLogo = new ImageIcon(getClass().getResource("/imagenes/trebol.png"));
        this.lblLogo.setIcon(icoLogo);
        this.lblLogo.setSize(50, 50);
        this.lblLogo.setLocation(30, 30);
        this.contentpane.add(this.lblLogo);

        this.lblBanco = new JLabel("BANCO");
        this.lblBanco.setSize(100, 15);
        this.lblBanco.setLocation(90, 40);
//        this.lblBanco.setForeground(Color.red); color detexto
//        this.lblBanco.setBackground(Color.red); color de fondo
//        this.lblBanco.setOpaque(true); sin esto no pinta el fondo
        this.contentpane.add(this.lblBanco);

        this.lblPropisto = new JLabel();
        this.lblPropisto.setSize(200, 100);
        this.lblPropisto.setLocation(90, 15);
        this.lblPropisto.setFont(new java.awt.Font("Arimo", 0, 30));
        this.contentpane.add(this.lblPropisto);
        
        this.lblCashMoney = new JLabel();
        this.lblCashMoney.setSize(200, 100);
        this.lblCashMoney.setLocation(90, 15);
        this.lblCashMoney.setFont(new java.awt.Font("Arimo", 0, 30));
        this.contentpane.add(this.lblCashMoney);

        this.lblSeleccioneTransaccion = new JLabel("               "
                + "SELECCIONE EL TIPO DE TRANSACCION");
        this.lblSeleccioneTransaccion.setSize(900, 50);
        this.lblSeleccioneTransaccion.setLocation(0, 90);
        this.lblSeleccioneTransaccion.setFont(new java.awt.Font("Arimo", 0, 20));
        this.lblSeleccioneTransaccion.setBackground(Color.WHITE);
        this.lblSeleccioneTransaccion.setOpaque(true);
        this.contentpane.add(this.lblSeleccioneTransaccion);

        // imagenes ***********************************************************
        this.lblTranferencia = new JLabel("");
        this.icoTransferencia = new ImageIcon(getClass().getResource("/imagenes/transferencia.png"));
        this.lblTranferencia.setIcon(this.icoTransferencia);
        this.lblTranferencia.setSize(60, 60);
        this.lblTranferencia.setLocation(220, 160);
        this.contentpane.add(this.lblTranferencia);

        this.lblRetiro = new JLabel("");
        this.icoRetiro = new ImageIcon(getClass().getResource("/imagenes/retiro.png"));
        this.lblRetiro.setIcon(this.icoRetiro);
        this.lblRetiro.setSize(60, 60);
        this.lblRetiro.setLocation(220, 240);
        this.contentpane.add(this.lblRetiro);

        this.lblConsulta = new JLabel("");
        this.icoConsulta = new ImageIcon(getClass().getResource("/imagenes/consultar.png"));
        this.lblConsulta.setIcon(this.icoConsulta);
        this.lblConsulta.setSize(60, 60);
        this.lblConsulta.setLocation(220, 320);
        this.contentpane.add(this.lblConsulta);

        this.lblCompra = new JLabel("");
        this.icoCompra = new ImageIcon(getClass().getResource("/imagenes/compra.png"));
        this.lblCompra.setIcon(icoCompra);
        this.lblCompra.setSize(60, 60);
        this.lblCompra.setLocation(320, 160);
        this.contentpane.add(this.lblCompra);

        this.lblHistorial = new JLabel("");
        this.icoHistorial = new ImageIcon(getClass().getResource("/imagenes/historial.png"));
        this.lblHistorial.setIcon(icoHistorial);
        this.lblHistorial.setSize(60, 60);
        this.lblHistorial.setLocation(320, 240);
        this.contentpane.add(this.lblHistorial);

        this.lblGrafica = new JLabel("");
        this.icoGrafica = new ImageIcon(getClass().getResource("/imagenes/grafica.png"));
        this.lblGrafica.setIcon(icoGrafica);
        this.lblGrafica.setSize(60, 60);
        this.lblGrafica.setLocation(320, 320);
        this.contentpane.add(this.lblGrafica);

        // BOTONES ************************************************************
        this.btnTransferencia = new JButton("<html><center>TRANSFERENCIA CON DENOMINACIONES</center></html>");
        this.btnTransferencia.setSize(130, 60);
        this.btnTransferencia.setLocation(70, 160);
        this.btnTransferencia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnTransferenciaDen(e);
            }
        });
        this.contentpane.add(this.btnTransferencia);

        this.btnRetiro = new JButton("RETIRO");
        this.btnRetiro.setSize(130, 60);
        this.btnRetiro.setLocation(70, 240);
        this.btnRetiro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnRetiro(e);
            }
        });
        this.contentpane.add(this.btnRetiro);

        this.btnConsulta = new JButton("<html><center>CONSULTA DE<br>SALDO</center></html>");
        this.btnConsulta.setSize(130, 60);
        this.btnConsulta.setLocation(70, 320);
        this.btnConsulta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnConsulta(e);
            }
        });
        this.contentpane.add(this.btnConsulta);

        this.btnCompra = new JButton("<html><center>TRANSFERENCIA<br>LIBRE</center></html>");
        this.btnCompra.setSize(130, 60);
        this.btnCompra.setLocation(400, 160);
        this.btnCompra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCompra(e);
            }
        });
        this.contentpane.add(this.btnCompra);

        this.btnHistorial = new JButton("HISTORIAL");
        this.btnHistorial.setSize(130, 60);
        this.btnHistorial.setLocation(400, 240);
        this.btnHistorial.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnHistorial(e);
            }
        });
        this.contentpane.add(this.btnHistorial);

        this.btnGrafica = new JButton("GRAFICAS");
        this.btnGrafica.setSize(130, 60);
        this.btnGrafica.setLocation(400, 320);
        this.btnGrafica.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnGrafica(e);
            }
        });
        this.contentpane.add(this.btnGrafica);

        this.btnCerrar = new JButton();
        this.icoCerrar = new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
        this.btnCerrar.setIcon(this.icoCerrar);
        this.btnCerrar.setSize(100, 40);
        this.btnCerrar.setLocation(430, 400);
        this.btnCerrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCerrar(e);
            }
        });
        this.contentpane.add(this.btnCerrar);
    }

    public void btnCerrar(ActionEvent e) {
        dispose();

    }

    public static void main(String args[]) {
        Transaccion ts = new Transaccion();
        ts.show();
    }

    public void btnTransferenciaDen(ActionEvent e) {
        ami();
        TransDenominacion tf = new TransDenominacion();
        tf.setDatos(misDatos);
        
        tf.init_component();
        
    }

    public void btnRetiro(ActionEvent e) {

    }

    public void btnConsulta(ActionEvent e) {
        ConsultaSaldo miConsultaSaldo = new ConsultaSaldo();
        miConsultaSaldo.setDatos(misDatos);
        miConsultaSaldo.show();
        Consulta_saldo();
    }

    public void btnCompra(ActionEvent e) {
        TransLibre tl = new TransLibre();
        tl.show();

    }

    public void btnHistorial(ActionEvent e) {

    }

    public void btnGrafica(ActionEvent e) {

    }

    private void Consulta_saldo() {
        String registro[] = new String[2];
        for (int i = 0; i < misDatos.numeroCliente(); i++) {
            registro[0] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getSaldoInicial();
            registro[1] = "" + misDatos.getClientes()[misDatos.posicionCliente()].getEmpresa();
            ConsultaSaldo.txtSaldoActual.setText(" Q."+registro[0]);
            if(registro[1].equals("1")){
             ConsultaSaldo.txtEmpresa.setText("PRO*PISTO");   
            }else{
                if(registro[1].equals("0")){
             ConsultaSaldo.txtEmpresa.setText("CASH-MONEY");   
            }
            }
            
            break;
        }
    }

        public void ami() {
        amigo = new String[misDatos.numeroCliente()];
        for (int i = 0; i < misDatos.numeroCliente(); i++) {
            amigo[i] = misDatos.getClientes()[i].getNombreUsuario();
            System.out.println(amigo[i]);
        }
    }


}
