package DIP;

// Класс описывает восьмицилиндровый двигатель
 

public class V8Engine extends AbstractCarEngine {

    private V8EngineConfiguration configuration;

    public V8Engine(V8EngineConfiguration configuration, int power) {
        setPower(power);
        this.configuration = configuration;
    }
}