package com.itfactory;

public enum tipMasina {
    MASINA1(1, "Mercedes", Option.BATTERY, Option.BATTERY),
    MASINA2(2, "Ford", Option.BATTERY, Option.GAS),
    MASINA3(3, "Audi", Option.GAS, Option.BATTERY),
    MASINA4(4,"Renault", Option.GAS, Option.BATTERY),
    MASINA5(5, "BMW", Option.BATTERY, Option.BATTERY),
    MASINA6(6,"Volkswagen", Option.GAS, Option.BATTERY);

private final int id;
private final String denumire;
private final Option option1;
private final Option option2;

    tipMasina(int id, String denumire, Option option1, Option option2){
        this.id = id;
        this.denumire = denumire;
        this.option1 = option1;
        this.option2 = option2;
}

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public Option getOption1() {
        return option1;
    }

    public Option getOption2() {
        return option2;
    }

    public static tipMasina findById(int id){
        for(tipMasina value: tipMasina.values()){
            if(id == value.getId()){
                return value;
            }
        }
    return null;
    }
}
