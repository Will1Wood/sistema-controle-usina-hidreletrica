package monitoramento_hidrologico_e_ambiental;

public enum LarguraCalhaParshall {

    // largura (m), coeficiente (C), expoente (n)
    POL_1   (0.025,  1.89,  1.55),
    POL_2   (0.051,  3.79,  1.55),
    POL_3   (0.076,  5.56,  1.55),
    POL_6   (0.152, 11.13,  1.58),
    POL_9   (0.229, 17.61,  1.53),

    FT_1    (0.305, 22.12,  1.55),
    FT_1_5  (0.457, 34.00,  1.54),
    FT_2    (0.610, 44.80,  1.55),
    FT_3    (0.914, 65.62,  1.57),
    FT_4    (1.219, 86.46,  1.58),
    FT_5    (1.524, 106.80, 1.59),
    FT_6    (1.829, 128.16, 1.59),
    FT_7    (2.134, 147.75, 1.60),
    FT_8    (2.438, 166.87, 1.61),
    FT_10   (3.048, 207.80, 1.60),
    FT_12   (3.658, 246.70, 1.60),
    FT_15   (4.572, 305.06, 1.60),
    FT_20   (6.096, 402.36, 1.60),
    FT_25   (7.620, 499.67, 1.60),
    FT_30   (9.144, 596.98, 1.60),
    FT_40   (12.192, 791.54, 1.60),
    FT_50   (15.240, 986.15, 1.60);

    private final double larguraMetros;
    private final double coeficiente;
    private final double expoente;

    LarguraCalhaParshall(double larguraMetros, double coeficiente, double expoente) {
        this.larguraMetros = larguraMetros;
        this.coeficiente = coeficiente;
        this.expoente = expoente;
    }

    public double getLarguraMetros() {
        return larguraMetros;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public double getExpoente() {
        return expoente;
    }
}

