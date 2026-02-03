package monitoramento_hidrologico_e_ambiental;

public class MedicaoVazaoDefluente {

    private double coeficienteDescarga;
    private double larguraSoleira;
    private double cargaHidraulica;
    private TipoVertedor tipoVertedor;

    public MedicaoVazaoDefluente(double coeficienteDescarga,
                                double larguraSoleira,
                                double cargaHidraulica,
                                TipoVertedor tipoVertedor) {
        this.coeficienteDescarga = coeficienteDescarga;
        this.larguraSoleira = larguraSoleira;
        this.cargaHidraulica = cargaHidraulica;
        this.tipoVertedor = tipoVertedor;
    }

    public double calcularVazaoDefluente() {
        if (cargaHidraulica < 0) {
            throw new IllegalArgumentException("Carga hidráulica não pode ser negativa");
        }

        return tipoVertedor.calcularVazao(
                coeficienteDescarga,
                larguraSoleira,
                cargaHidraulica
        );
    }
}


