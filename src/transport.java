public class transport {
//    Создайте геттеры и сеттеры для необходимых полей. Параметры год выпуска, страна производства не могут изменяться, цвет,
//    скорость меняться могут.
//    Для изменяемых параметров добавьте проверку данных, что значение указано корректно, не содержит null и не пустое.
//
//    Скорректируйте класс car таким образом, чтобы ранее указанные параметры не повторяли те, которые содержатся в классе transport.
//
//    Класс car должен наследовать параметры класса transport.
//
//            Критерии проверки
//    создан класс transport с параметрами
//    Для класса car настроено расширение
//    Параметры класса car скорректированы, убраны повторы параметров из класса transport
//    Данные по ранее созданным объектам выводятся в консоль
//    private String brand;

    private String model;
    private final int yearRelease;
    private final String country;
    private String colorBody;
    private int maxSpeed;
    private String brand;


    public transport(String brand, String model, int yearRelease, String country, String colorBody, int maxSpeed) {
        this.model = model;
        this.yearRelease = yearRelease;
        this.country = country;
        this.brand = brand;
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }


        if (colorBody != null && colorBody != "") {
            this.colorBody = colorBody;
        } else {
            this.colorBody = "Цвет введен некорректно";
        }
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getCountry() {
        return country;
    }

    public String getColorBody() {
        return colorBody;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setColorBody(String colorBody) {
        if (colorBody != null || colorBody != "") {
            this.colorBody = colorBody;
        } else {
            this.colorBody = "Цвет введен некорректно";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    @Override
    public String toString() {
        return "transport{" +
                ", brand='" + brand + '\'' +
                "model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", country='" + country + '\'' +
                ", colorBody='" + colorBody + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
