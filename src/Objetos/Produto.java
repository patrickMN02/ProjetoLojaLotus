
package Objetos;


public class Produto extends Cliente{
    private String id;
    private String codBarras;
    private String precoCusto;
    private String precoVenda;
    private String colecao;
    private String marca;
    private String tipo_tecido;
    private String cor;
    private String tamanho;
    
    
    public Produto(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }   
    

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getTipo_tecido() {
        return tipo_tecido;
    }

    public void setTecido(String tecido) {
        this.tipo_tecido = tecido;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
