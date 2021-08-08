package ObjetosConstrutores;

public class Carro {
    public String modelo;
    public String marca;
    public Integer ano;
    public String variante;

    protected Carro(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    protected Integer getAno() {
        return ano;
    }

    protected String getModelo() {
        return modelo;
    }

    protected String getMarca() {
        return marca;
    }

    protected String getVariante() {
        return variante;
    }

    protected void setVariante(String variante) {
        this.variante = variante;
    }

}
