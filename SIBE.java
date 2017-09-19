
package sibe;

public class SIBE {
//    public static Datos misDatos = new Datos();
    public static void main(String[] args) {
        Datos misDatos   = new Datos();
        Login miLogin = new Login();
        miLogin.setDatos(misDatos);
        miLogin.show();
    }
    
}
