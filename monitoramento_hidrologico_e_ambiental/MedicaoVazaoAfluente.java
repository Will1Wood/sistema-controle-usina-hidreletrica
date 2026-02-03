package monitoramento_hidrologico_e_ambiental;

public class MedicaoVazaoAfluente {

    private double nivelDeAgua; // H
    private LarguraCalhaParshall larguraCalha;

    public MedicaoVazaoAfluente(double nivelDeAgua, LarguraCalhaParshall larguraCalha) {
        this.nivelDeAgua = nivelDeAgua;
        this.larguraCalha = larguraCalha;
    }

    public double calcularVazao() {
        return larguraCalha.getCoeficiente() *
               Math.pow(nivelDeAgua, larguraCalha.getExpoente());
    }
}

