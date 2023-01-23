import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class Human {
    String name;
    static String he = "он";
    static String me = "я";
    static String she = "она";
    static String old = "моя старость";
    static boolean ability;
    ArrayList <Day> owndays = new ArrayList<>();

    public static void setability(boolean abil) {
        ability = abil;
    }

    public static boolean getability() {
        return ability;
    }

    public void doingsth(String action) throws AbilityException {
        if(action.equals(Actions.razreshit)||action.equals(Actions.answer)||action.equals("придет")||action.equals("пришёл")){
            setability(false);
        }
        else{
            setability(true);
        }
        if (getability()) {
            if (this.getClass() == Me.class) {
                System.out.println("Я могу " + action);
            }
            if (this.getClass() == She.class) {
                System.out.print("Она " + action + " ");
            } else {
                System.out.println(this.name + " может " + action);
            }
        } else {
            throw new AbilityException("Действие невозможно!");
        }
    }
    public void notableto (String string){
        String willgo = "приду";
        if(string.hashCode()==willgo.hashCode()||this.hashcode()==Human.he.hashCode()) {
            System.out.println(this.name+" не "+string);
        }
        else {
            if (this.getClass() == Me.class) {
                System.out.println(this.name + " не могу " + string);
                System.out.println();
            }
            if (this.getClass() == She.class) {
                System.out.println(this.name + " не " + string);
            }
        }
    }


    public static void doingtogether(ArrayList<Human> e, String action) {
        if (e.size() == 2) {
            if (getability()) {
                System.out.println(" мы сможем " + action);
            } else {
                System.out.println(" мы не сможем " + action);
            }
        }
    }

    public static void whiledoing(ArrayList<Human> e, String action) {
        if (e.size() == 2) {
            System.out.print(" когда мы " + action + ", ");
        }
    }

    public static void said(Object object) throws ClassException {
        if (object.getClass() == Me.class) {
            System.out.print("Я cказал: ");
        }
        if (object.getClass()==She.class){
            System.out.print("Она сказала: ");
        }
        else {
            throw new ClassException("Действие не может быть совершено");
        }
    }

    public void justdo(String action) throws AbilityException {
        if (action.equals("думал")){
            setability(true);
        }
        else {setability(false);}
        if (getability()) {
            if (this.getClass() == Me.class) {
                System.out.print("Я " + action);
            }
            if (this.getClass() == She.class) {
                System.out.print("Она " + action + " ");
            }
        } else {
            throw new AbilityException("Действие невозможно!");
        }
    }

    public void belongings(Feels object, String typeofimpact) {
        object.impaction(object, this, typeofimpact);
    }
    public boolean equals(String object) {
        return object == this.name;
    }
    public int hashcode(){
        int hashc=0;
        hashc = hashc + (this.name == null ? 0 : name.hashCode());
        return hashc;
    }
    public boolean checkbelongs (Day e){
       return this.owndays.contains(e);
    }
    public void describeownday (Day e){
        if (this.getClass()==Me.class) {
            if (this.checkbelongs(e)) {
                System.out.println(this.name + " " + Dialogue.hesaid + ": '" + e.name + " " + e.chars + "'");
            }
        }
        if (this.getClass()==She.class){
            if (this.checkbelongs(e)){
                System.out.print(this.name +" "+ Actions.checkthought(this)+" " );
                e.describeday();
            }
        }
    }
    public void doubts (String action){
        Combinations.but();
        System.out.println("почему "+ this.name+" так "+action+"?");
    }
    public void doingwithsmth (String action, String subject, Human obj2){
        if (this.equals(Human.she)&& obj2.equals(Human.me)){
            System.out.print(this.name+action);
            ((Me)obj2).belongs(subject);
        }
    }
}