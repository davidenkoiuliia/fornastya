import java.util.ArrayList;

public class Feels {
    static String tesnyat = "теснят";
    String naming;
    String feelingchar;
    ArrayList<String> chararray = new ArrayList<>();
    public Feels (String feeling) {
        this.naming = feeling;
    }
    public Feels (String feeling, FeelsChars type) {
        String typeofchar = type.toString();
        switch(typeofchar){
            case "Dark":
                this.feelingchar="тёмные";
                chararray.add(feelingchar);
                break;
            case "Strange":
                this.feelingchar = "странные";
                chararray.add(feelingchar);
                break;
            case "Unclear":
                this.feelingchar = "неясные";
                chararray.add(feelingchar);
                break;
            case "Catching":
                this.feelingchar = "заразительна";
                chararray.add(feelingchar);
                break;
        }
        this.naming = feeling;
    }
    public void setchar (FeelsChars feelchar) {
        String fc = feelchar.toString();
        switch (fc) {
            case "Strange":
                this.feelingchar = "странные";
                chararray.add(feelingchar);
                break;
            case "Dark":
                this.feelingchar = "тёмные";
                chararray.add(feelingchar);
                break;
            case "Unclear":
                this.feelingchar = "неясные";
                chararray.add(feelingchar);
                break;
            case "Havefun":
                this.feelingchar = "веселилось";
                chararray.add(feelingchar);
                break;
            case "Laugh":
                this.feelingchar = "смеялось";
                chararray.add(feelingchar);
                break;
            case "Catching":
                this.feelingchar = "заразительна";
                chararray.add(feelingchar);
                break;
            case "MeetingAnother":
                this.feelingchar = " встречи с другим";
                chararray.add(feelingchar);
                break;
        }
    }
    public String getFeel (Feels feel){
        return (feel.naming);
    }
    public String getChar (Feels feel){
        return (feel.feelingchar);
    }
    public void impaction (Feels feel, Human obj, String typeofimpact) {
        if (obj.equals("я")){
            if (this.feelingchar!=null) {
                System.out.println("Меня " + typeofimpact + " " + feel.getChar(feel) + " " + feel.getFeel(feel));
            }
            else{
                System.out.println("Меня " + typeofimpact + " " + feel.getFeel(feel));
            }
        }
        if (obj.equals("она")) {
            if (this.feelingchar != null) {
                System.out.println("Её " + typeofimpact + " " + feel.getChar(feel) + " " + feel.getFeel(feel));
            } else {
                System.out.println("Её " + typeofimpact + " " + feel.getFeel(feel));
            }
        }
        if (!obj.equals("я") && !obj.equals("она")) {
            if (this.feelingchar!=null) {
                System.out.println("Человека " + typeofimpact + " " + feel.getChar(feel) + " " + feel.getFeel(feel));
            }
            else{
                System.out.println("Человека " + typeofimpact + " " + feel.getFeel(feel));
            }
        }
    }
    public void describefeel (){
        System.out.print(this.naming+" ");
        this.chararray.forEach(s -> System.out.print(s + ", "));
        System.out.println();
    }
    public void restartdescribing () {
        this.chararray.clear();
    }
    public static void onefeelisanother(Feels feel2) {
        System.out.println(Actions.was + " " + feel2.getFeel(feel2) + feel2.getChar(feel2));
    }
}



