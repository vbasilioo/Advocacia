package DTO;

public class ProcessosDTO{
    
    private int id_processo;
    private String cliente;
    private String usuario_associado;

    public int getId_processo() {
        return id_processo;
    }

    public void setId_processo(int id_processo) {
        this.id_processo = id_processo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUsuario_associado() {
        return usuario_associado;
    }

    public void setUsuario_associado(String usuario_associado) {
        this.usuario_associado = usuario_associado;
    }
    
}