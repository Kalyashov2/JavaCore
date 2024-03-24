public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand == "") {
            this.brand = "нету";
        } else {
            this.brand = brand;
        }

        if (year >= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country == "") {
            this.country = "неизвестном месте";
        } else {
            this.country = country;}

            if (model == null || model == "") {
                this.model = "нету";
            } else {
                this.model = model;}

                if (color == null || color == "") {
                    this.color = "белый";
                } else {
                    this.color = color;
                }

                if (engineVolume <= 0) {
                    this.engineVolume = 1.5;
                }
                else {
                this.engineVolume = engineVolume;}

            }
            public void carInformatoin() {
                System.out.println(brand + " " + model + "," + year + " год выпуска," + " объём двигателя - " + engineVolume + " сборка в " + country);
            }



    }