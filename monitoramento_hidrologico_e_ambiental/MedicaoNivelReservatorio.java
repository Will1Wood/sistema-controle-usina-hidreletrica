package monitoramento_hidrologico_e_ambiental;
public class MedicaoNivelReservatorio {
    //volume util em porcentagem
    double volumeUtil;

    MedicaoNivelReservatorio(double volumeUtil) {
        this.volumeUtil = volumeUtil;
    }

    public NivelReservatorio medirVolume() {

        if (volumeUtil < 0 || volumeUtil > 100) {
            throw new IllegalArgumentException(
                "Volume inválido. Informe um valor entre 0 e 100."
            );
        }

        if (volumeUtil >= 60) return NivelReservatorio.NORMAL;
        if (volumeUtil >= 40) return NivelReservatorio.ATENCAO;
        if (volumeUtil >= 30) return NivelReservatorio.ALERTA;
        if (volumeUtil >= 20) return NivelReservatorio.RESTRICAO;
        if (volumeUtil > 0)  return NivelReservatorio.ESPECIAL;

        return NivelReservatorio.CRITICO;
    }
}
