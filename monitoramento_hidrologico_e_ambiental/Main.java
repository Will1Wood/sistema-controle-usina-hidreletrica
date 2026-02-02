package monitoramento_hidrologico_e_ambiental;

import simulador.SensorNivel;
import simulador.SensorNivelSimulado;

public class Main {
    public static void main(String[] args) {
        //Dados aleatorios para o nivel 
        SensorNivel sensor = new SensorNivelSimulado();

        double volume = sensor.lerNivel();

        //entrada dos valores do nivel
        MedicaoNivelReservatorio medicao =
                new MedicaoNivelReservatorio(volume);

        NivelReservatorio nivel = medicao.medirVolume();

        //entrada montante e jusante
        MedicaoNivelMontanteEJusante m = new MedicaoNivelMontanteEJusante();
        //Digite a profundidade em MONTANTE (m):
        m.setProfundidadeMontante(5.0);
        //Digite a velocidade em MONTANTE (m/s):
        m.setVelocidadeMontante(2.0);
        //Digite a profundidade em JUSANTE (m):
        m.setProfundidadeJusante(4.0);
        //Digite a velocidade em JUSANTE (m/s):
        m.setVelocidadeJusante(1.5);

        //Saida de montante e jusante
        m.numeroDeFroude();
        m.calculoCargaHidraulicaTotal();

        //Saida de valores de nivel de reserva
        System.out.println("Volume de reserva");
        System.out.println("Volume: " + volume + "%");
        System.out.println(nivel.getTitulo());
    }
}
