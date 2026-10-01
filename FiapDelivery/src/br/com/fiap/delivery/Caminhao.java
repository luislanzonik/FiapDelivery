package br.com.fiap.delivery;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos > 0) {
            this.eixos = eixos;
        } else {
            System.out.println("Quantidade de eixos inválida");
        }
    }
}