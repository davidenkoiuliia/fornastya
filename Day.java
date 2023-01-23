import java.util.ArrayList;
import java.util.function.Consumer;

public class Day {
    String name;
    boolean ifbelongs;
    String timing;
    String chars;
    ArrayList<String> chararray = new ArrayList<>();
    public void describeday(){
        System.out.print(this.timing);
        if (this.chars!=null){
            System.out.print(" ");
            this.chararray.forEach(new Consumer<String>() { //почитать про это
                @Override
                public void accept(String s) {
                    System.out.print(s + ", ");
                }
            });
            System.out.println("день");
        }
    }
    public void describetoday(){
        System.out.print(this.timing);
    }
    public Day(Time time){
        String time1 = time.toString();
        switch(time1){
            case "Today":
                this.timing="Сегодня";
                break;
            case "Tomorrow":
                this.timing = "Завтра";
                break;
            case "Yesterday":
                this.timing = "Вчера";
                break;
        }
        this.name=this.timing+"шний день";
    }
    public Day(){
        this.name="день";
        this.describeday();
    }
    public void setchar (Daychar daychar){
        String daychar1 = daychar.toString();
        switch(daychar1){
            case "Sad":
                this.chars="печальный";
                chararray.add(chars);
                break;
            case "Rainy":
                this.chars = "дождливый";
                chararray.add(chars);
                break;
            case "WithoutaGap":
                this.chars = "без просвета";
                chararray.add(chars);
                break;
            case "Bad":
                this.chars = "дурной";
                chararray.add(chars);
                break;
            case "Light":
                this.chars = "светлый";
                chararray.add(chars);
                break;
            case "Clear":
                this.chars = "ясный";
                chararray.add(chars);
                break;
        }
    }
    public void compare(String naming) {
        System.out.print(name+" сравним с объектом ");
        if(naming.equals("моя старость")){
            class Oldness1 {
                public void compareto(String string) {
                    System.out.println(string);
                }
            }
            var oldness = new Oldness1() {

            };
            oldness.compareto(Human.old);
        }
    }
    public void setnewchars(){
        this.chararray.clear();
    }
    public void restartdescribing (){
        this.chararray.clear();
    }
    public void setbelongstohuman(Human obj) {
        obj.owndays.add(this);
    }
    public void willbeweather(Weather e){
        System.out.println(this.timing + " " + e.willbe());
    }
}