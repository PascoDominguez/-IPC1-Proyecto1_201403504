package sibe;

public class Datos {

    private int maxCl = 100;
    public Cliente misClientes[] = new Cliente[maxCl];
    private int conCl = 0;

    public Datos() {
        cargarClientes();
    }

    public boolean validarUsuario(String usuario, String clave) {
        if (usuario.equals("a") && clave.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarClientes(String usuario, String clave) {
        for (int i = 0; i < conCl; i++) {
            if (misClientes[i].getUsuario().equals(usuario)
                    && misClientes[i].getPassword().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    private void cargarClientes() {
        Cliente miCliente;

        miCliente = new Cliente("pascual", "pasco", "123", 0, 10, 100);
        misClientes[conCl] = miCliente;
        conCl++;

        miCliente = new Cliente("Yeni", "yenita", "123", 0, 10, 100);
        misClientes[conCl] = miCliente;
        conCl++;

        miCliente = new Cliente("Alejandra", "colocha", "123", 1, 10, 100);
        misClientes[conCl] = miCliente;
        conCl++;
    }

    public Cliente[] getClientes() {
        return misClientes;
    }
    
    public int posicionUsuario(String Usuario, String clave){
        for (int i = 0; i <conCl; i++) {
            if (misClientes[i].getUsuario().equals(Usuario)|| misClientes[i].getPassword().equals(clave)) {
                return i;
            }
        }
        return -1;
    }
    
    public int posicionEmpresa(int empresa){
        for (int i = 0; i <conCl; i++) {
            if (misClientes[i].getEmpresa() == empresa) {
                return 0;
            }
        }
        return 1;
    }
    
    public String agregarcliente(Cliente miCliente){
        misClientes[conCl] = miCliente;
        conCl++;
        return "Cliente agregado correctamente";
    }
}
