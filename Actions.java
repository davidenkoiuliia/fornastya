public abstract class Actions {
    public static String checkgo (Time time, Human obj){
        String timing = time.toString();
        if(obj.getClass()==She.class) {
            switch (timing) {
                case "Tomorrow" -> go = "придет";
                case "Today" -> go = "приходит";
                case "Yesterday" -> go = "пришла";
            }
        }
        else {
            switch (timing) {
                case "Tomorrow"-> go = "приду";
                case "Today"-> go = "приходит";
                case "Yesterday"-> go = "пришёл";
            }
        }
        return go;
    }
    public static String checkthought (Human obj){
        if(obj.getClass()==She.class) {
            thought = "думала";
        }
        else {thought ="думал";
        }
        return thought;
    }
    public static void checknotice (Human obj, Weather obj2){
        if (obj2.name == "дождь"){
            Human.setability(false);
        }
        if(Human.getability()){
            if(obj.getClass()==She.class){
                System.out.println("Она заметила "+ obj2.name);
            }
            else {System.out.println("Он заметил "+ obj2.name);}
        }
        else {
            if(obj.getClass()==She.class){
                System.out.println(" она не заметила "+ obj2.name);
            }
            else {System.out.println("Он не заметил "+ obj2.name);}
        }
    }
    public static String makehappy (Human obj){
        if (obj.getClass()==Me.class){
            doi=doi+" прекрасным";
        }
        if (obj.getClass()==She.class){
            doi=doi+" прекрасной";
        }
        return doi;
    }
    static String was = "были";
    static String spill = "излить";
    static String boils = "кипит";
    static String answer = "отвечала";
    static String seeeachother = "увидеться";
    static String goodbye = "прощались";
    static String becloud = "заволакивали";
    static String up = "поднимался";
    static String doi = "делают";
    static String razreshit = "их разрешить";
    static String nahmurilas = "нахмурилась";
    static String zarobela ="заробела";
    static String go;
    static String thought;
}
