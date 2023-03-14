package org.example;
public class Empresa {
    private Empresa() {};
    private static Empresa instance = new Empresa();
    public static Empresa getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String cnpjEmpresa;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
