package sibe;

public class Datos {
    public static Cliente misClientes[] = new Cliente[100];
    public static int conCl = 0;
    public  static int conUsu = 0;
    private  int contador = 0;

    public Datos() {
        cargarClientes();
    }

    //valida el administrador

    public boolean validarUsuario(String usuario, String clave) {
        if (usuario.equals("a") && clave.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

//valida los cliententes
    public boolean validarClientes(String usuario, String clave) {
        conUsu = contador-1;
        for (int i = 0; i < conCl; i++) {
            contador++;
            if (misClientes[i].getUsuario().equals(usuario)
                    && misClientes[i].getPassword().equals(clave)) {
                
                return true;
            }
        }
        return false;
    }


    private void cargarClientes() {
        Cliente miCliente;
//
//        miCliente = new Cliente("pascual", "pasco", "123", 0, 10, 100);
//        misClientes[conCl] = miCliente;
//        conCl++;
//
//        miCliente = new Cliente("Yeni", "yenita", "123", 0, 10, 100);
//        misClientes[conCl] = miCliente;
//        conCl++;
//
//        miCliente = new Cliente("Alejandra", "colocha", "123", 1, 10, 100);
//        misClientes[conCl] = miCliente;
//        conCl++;
//        
//        miCliente = new Cliente("sayra", "saya", "456", 1, 10, 100);
//        misClientes[conCl] = miCliente;
//        conCl++;
    }

    public Cliente[] getClientes() {
        return misClientes;
    }


    public String agregarcliente(Cliente miCliente) {
        misClientes[conCl] = miCliente;
        conCl++;
        return "Cliente agregado correctamente";
    }

    public int posicionCliente() {
        return conUsu;
    }
    public int numeroCliente(){
        return conCl;
    }
}
