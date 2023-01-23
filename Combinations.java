public abstract class Combinations {
    public static void but(){
        String condition= "Но ";
        System.out.print( condition );
    }
    public static void condition(){
        String condition= "Если ";
        System.out.print( condition );
    }
    public static void into(){
        String condition= "внутрь ";
        System.out.print( condition );
    }
    public static void when(){
        String condition= "Когда ";
        System.out.print( condition );
    }
    public static String to(){
        return ("чтобы");
    }
    public static String in(){return (" в ");}
    public static void uncertain (Human obj1){
        System.out.println(" "+obj1.name+ "...");
    }

}
