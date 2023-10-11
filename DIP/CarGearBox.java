package DIP;

//  Интерфейс описывает коробку передач автомобиля

public interface CarGearBox {
    // Метод возвращает значение текущей передачи

    int getCurrentGear();

    // Метод устанавливает значение текущей передачи

    void setCurrentGear(int gear);
}