package simulador;

import java.util.Random;

public class SensorNivelSimulado implements SensorNivel {
    
    @Override
    public double lerNivel() {
        Random random = new Random();
        return 10 + random.nextDouble() * 90; // 10% a 100%
    }
}
