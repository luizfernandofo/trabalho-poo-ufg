package br.ufg.inf.poo.ufgmotors.enumeration;

public enum EstiloEnum {

    CUSTOM("CUSTOM"),
    ELETRICA("ELETRICA"),
    ESPORTIVA("ESPORTIVA"),
    MINI_CROSS("MINI_CROSS"),
    NAKED("NAKED"),
    OFF_ROAD("OFF_ROAD"),
    QUADRICICLO("QUADRICICLO"),
    SCOOTER("SCOOTER"),
    STREET("STREET"),
    SUPERMOTARD("SUPERMOTARD"),
    TOURING("TOURING"),
    TRAIL("TRAIL"),
    TRIAL("TRIAL"),
    TRICICLO("TRICICLO"),
    UTILITARIA("UTILITARIA");

    private String value;

    private EstiloEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
