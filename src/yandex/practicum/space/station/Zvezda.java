package yandex.practicum.space.station;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    // доступ к созданию новых конструкторов запрещён

  @Override
    void activateModule() {
        turnSolarPanels();
    }
    // разрешено переопределение методов
}