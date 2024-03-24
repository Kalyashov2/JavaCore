public class people {
    public int year;
    public String name;
    public String city;
    public String post;

    public people(int year, String name, String city, String post){
        if (post == null || post == "" ){
            this.post = "Информация не указана";
        }
        else {
            this.post = post;
        }

        if(city == null || city == ""){
            this.city = "Информация не указана";
        }
        else{
            this.city = city;
        }

        if (name == null || name ==""){
            this.name = "Информация не указана";
        }
        else {
            this.name = name;
        }

        if (year < 0){
            this.year = 1;
        }
        else {
            this.year =year;
        }



    }
    public void hi(){
        System.out.println("Привет! Меня зовут " + name + "." +
        " Я из города " + city + "."+ " Мне "+ year + " лет. Я работаю на должности " + post +"." );
    }



}
