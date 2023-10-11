package DIP;



//  Класс описывает 6-тиступенчатую коробку передач


public class SixSpeedGearBox implements CarGearBox {

    //  Текущая передача

    private int currentGear;

    @Override
    public int getCurrentGear() {
        return currentGear;
    }

    @Override
    public void setCurrentGear(int gear) {
        currentGear = gear;
    }
}