package Heranca;

public class Veiculo {
    private String modelo; // PROTEGENDO VALOR PARA QUE SEJA ACESSADO DO MODO QUE EU QUEIRA
    protected String marca; // PROTEGENDO VALOR PARA QUE SEJA ACESSADO DO MODO QUE EU QUEIRA DENTRO DO MESMO PACKAGE

    public void setMarca(String marcaPassada) {
        this.marca = marcaPassada;
    }

    public void setModelo(String modeloPassado) {
        this.modelo = modeloPassado;
    }

    protected String printaModelo() {
        return "Modelo -> " + modelo;
    }
}
