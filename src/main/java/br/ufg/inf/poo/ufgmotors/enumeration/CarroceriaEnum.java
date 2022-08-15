package br.ufg.inf.poo.ufgmotors.enumeration;

public enum CarroceriaEnum {
    BUGGY("BUGGY"),
    CONVERSIVEL("CONVERSIVEL"),
    CUPE("CUPE"),
    HATCHBACK("HATCHBACK"),
    MINIVAN("MINIVAN"),
    PERUA_SW("PERUA_SW"),
    PICAPE("PICAPE"),
    SEDA("SEDA"),
    UTILITARIO_ESPORTIVO("UTILITARIO_ESPORTIVO"),
    VA_UTILITARIO("VA_UTILITARIO");

    private String value;

    private CarroceriaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
