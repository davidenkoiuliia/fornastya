import java.util.ArrayList;

public class She extends Human {
    public She(String naming) {
        name = naming;
    }
    public void belongs(Object o) {
        System.out.print("Её ");
        if(o instanceof Feels){
            System.out.println(((Feels) o).getFeel(((Feels) o)));
        }
        else {
            System.out.println(o);
        }
    }
    public void cared (Human obj2){
        System.out.print(this.name+" ухаживала за ");
        if (obj2.getClass()==Me.class){
            System.out.println("мной");
        }
    }
    public void caressed (Human obj2){
        System.out.print(this.name+" ласкалась ");
        if (obj2.getClass()==Me.class){
            System.out.println("ко мне");
        }
    }
    public String belongsnoobj() {
        return "Её ";
    }
}
