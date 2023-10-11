package DIP;


// Интерфейс описывает двигатель автомобиля

public interface CarEngine {

    //  Метод возвращает мощность двигателя (л.с.)

    int getPower();

    // Метод устанавливает мощность двигателя (л.с.)
    
    void setPower(int power);
}