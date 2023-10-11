package DIP;

//  Класс описывает абстрактный автомобильный двигатель с заданной мощностью

public abstract class AbstractCarEngine implements CarEngine {
// Мощность двигателя (л.с.)

    private int power;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }
}