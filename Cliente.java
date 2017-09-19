
package sibe;

public class Cliente {
    public String nombreUsuario;
    public String Usuario;
    public String password;
    public int Empresa;
    public double SaldoInicial;
    public double MontoMaximo;
    

    Cliente(String nombreUsuario, String Usuario, String password, int Empresa, double SaldoInicial, double MontoMaximo) {
        this.nombreUsuario = nombreUsuario;
        this.Usuario = Usuario;
        this.password = password;
        this.Empresa = Empresa;
        this.SaldoInicial = SaldoInicial;
        this.MontoMaximo = MontoMaximo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(int Empresa) {
        this.Empresa = Empresa;
    }

    public double getSaldoInicial() {
        return SaldoInicial;
    }

    public void setSaldoInicial(double SaldoInicial) {
        this.SaldoInicial = SaldoInicial;
    }

    public double getMontoMaximo() {
        return MontoMaximo;
    }

    public void setMontoMaximo(double MontoMaximo) {
        this.MontoMaximo = MontoMaximo;
    }
    
    
    
}
