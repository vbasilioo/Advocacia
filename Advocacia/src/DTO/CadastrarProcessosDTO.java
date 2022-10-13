package DTO;


public class CadastrarProcessosDTO{
    
    private int id_processo;
    private String nome_processo, tipo_processo, natureza_processo, situacao_processo, artigo_processo, descricao_processo;

    public int getId_processo() {
        return id_processo;
    }

    public void setId_processo(int id_processo) {
        this.id_processo = id_processo;
    }

    public String getNome_processo() {
        return nome_processo;
    }

    public void setNome_processo(String nome_processo) {
        this.nome_processo = nome_processo;
    }

    public String getTipo_processo() {
        return tipo_processo;
    }

    public void setTipo_processo(String tipo_processo) {
        this.tipo_processo = tipo_processo;
    }

    public String getNatureza_processo() {
        return natureza_processo;
    }

    public void setNatureza_processo(String natureza_processo) {
        this.natureza_processo = natureza_processo;
    }

    public String getSituacao_processo() {
        return situacao_processo;
    }

    public void setSituacao_processo(String situacao_processo) {
        this.situacao_processo = situacao_processo;
    }

    public String getArtigo_processo() {
        return artigo_processo;
    }

    public void setArtigo_processo(String artigo_processo) {
        this.artigo_processo = artigo_processo;
    }

    public String getDescricao_processo() {
        return descricao_processo;
    }

    public void setDescricao_processo(String descricao_processo) {
        this.descricao_processo = descricao_processo;
    }
    
}
