package monitoramento_hidrologico_e_ambiental;

import simulador.SensorNivel;
import simulador.SensorNivelSimulado;

public class Main {
    public static void main(String[] args) {
        SensorNivel sensor = new SensorNivelSimulado();

        double volume = sensor.lerNivel();

        MedicaoNivelReservatorio medicao =
                new MedicaoNivelReservatorio(volume);

        NivelReservatorio nivel = medicao.medirVolume();

        System.out.println("Volume: " + volume + "%");
        System.out.println(nivel.getTitulo());
    }
}
