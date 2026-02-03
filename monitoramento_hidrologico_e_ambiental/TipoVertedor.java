package monitoramento_hidrologico_e_ambiental;

public enum TipoVertedor {

    RETANGULAR {
        @Override
        public double calcularVazao(double coeficiente, double largura, double cargaHidraulica) {
            return coeficiente
                    * largura
                    * Math.pow(cargaHidraulica, 1.5);
        }
    },

    TRIANGULAR {
        @Override
        public double calcularVazao(double coeficiente, double largura, double cargaHidraulica) {
            return coeficiente
                    * Math.pow(cargaHidraulica, 2.5);
        }
    },

    CIPOLETTI {
        @Override
        public double calcularVazao(double coeficiente, double largura, double cargaHidraulica) {
            return coeficiente
                    * largura
                    * Math.pow(cargaHidraulica, 1.5);
        }
    };

    public abstract double calcularVazao(double coeficiente,
                                         double largura,
                                         double cargaHidraulica);
}
