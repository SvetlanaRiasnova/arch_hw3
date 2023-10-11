package DIP;



public class V8EngineConfiguration {

    public enum V8EngineConfigurationType {
    // Конфигурация двигателя с плоским коленвалом

        FLAT_CRANKSHAFT_CONFIGURATION,

    // Конфигурация двигателя с крестообразным коленвалом

        CRUCIFORM_CRANKSHAFT_CONFIGURATION
    }

    private V8EngineConfigurationType configurationType;
}