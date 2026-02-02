package monitoramento_hidrologico_e_ambiental;

public class MedicaoNivelMontanteEJusante {
    private double profundidadeMontante;
    private double velocidadeMontante;
    private double profundidadeJusante;
    private double velocidadeJusante;

    // Construtor vazio (facilita uso no main)
    public MedicaoNivelMontanteEJusante() {
    }

    // Getters e Setters
    public double getProfundidadeMontante() {
        return profundidadeMontante;
    }

    public void setProfundidadeMontante(double profundidadeMontante) {
        if (profundidadeMontante <= 0)
            throw new IllegalArgumentException("Profundidade de montante deve ser > 0");
        this.profundidadeMontante = profundidadeMontante;
    }

    public double getVelocidadeMontante() {
        return velocidadeMontante;
    }

    public void setVelocidadeMontante(double velocidadeMontante) {
        if (velocidadeMontante < 0)
            throw new IllegalArgumentException("Velocidade de montante não pode ser negativa");
        this.velocidadeMontante = velocidadeMontante;
    }

    public double getProfundidadeJusante() {
        return profundidadeJusante;
    }

    public void setProfundidadeJusante(double profundidadeJusante) {
        if (profundidadeJusante <= 0)
            throw new IllegalArgumentException("Profundidade de jusante deve ser > 0");
        this.profundidadeJusante = profundidadeJusante;
    }

    public double getVelocidadeJusante() {
        return velocidadeJusante;
    }

    public void setVelocidadeJusante(double velocidadeJusante) {
        if (velocidadeJusante < 0)
            throw new IllegalArgumentException("Velocidade de jusante não pode ser negativa");
        this.velocidadeJusante = velocidadeJusante;
    }

    // Número de Froude
    public void numeroDeFroude() {
        double frMontante = velocidadeMontante / Math.sqrt(9.81 * profundidadeMontante);
        double frJusante  = velocidadeJusante  / Math.sqrt(9.81 * profundidadeJusante);

        System.out.println("Fr Montante: " + frMontante);
        System.out.println("Fr Jusante : " + frJusante);
    }

    // Carga hidráulica
    public void calculoCargaHidraulicaTotal() {
        double hMontante = profundidadeMontante + (velocidadeMontante * velocidadeMontante) / (2 * 9.81);
        double hJusante  = profundidadeJusante  + (velocidadeJusante  * velocidadeJusante)  / (2 * 9.81);

        double perdaCarga = Math.max(0, hMontante - hJusante);

        System.out.println("Perda de carga: " + perdaCarga + " m");
    }

}
