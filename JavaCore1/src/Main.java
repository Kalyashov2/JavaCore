public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta",1.7, "жёлтый", 2015, "России");
            lada.carInformatoin();
        Car audi = new Car("Audi", "A8 50 L TDI qeuattro",3.0,"чёрный",2020,"Германии");
            audi.carInformatoin();
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германии");
            bmw.carInformatoin();
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"красный", 2018, "Южной Корее");
            kia.carInformatoin();
        Car hyundai = new Car("Hyundai", "Avante",1.6, "оранжевый",2016,"Южной Корее");
            hyundai.carInformatoin();
        Car o = new Car("", "", 1, "", 1221,"");
        o.carInformatoin();





    }
}