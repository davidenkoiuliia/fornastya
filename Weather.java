public class Weather {
    String name;
    static String Fog = "туман";
    static String Clouds = "облака";
    static String Rain = "дождь";
    static String sky = "небо";
    public Weather(String naming){
        name = naming;
    }
    public void actionforfog(String action){
        System.out.println(this.name+" "+action);
    }
    public void actionforclouds (String action){
        System.out.print(this.name+" "+action);
        class Sky {
            public void skyMethod(String string) {
                System.out.println(" "+string);
            }
        }
        Sky sky = new Sky();
        sky.skyMethod(Weather.sky);
    }
    public String willbe () {
       return ("будет "+this.name);
    }
}
