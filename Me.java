public class Me extends Human{
    public Me (String naming) {
        name=naming;
    }
    public void belongs (String str){
        System.out.println("Моё "+ str);
    }
    public String belongsnoobj (){ return "Моё ";}
    public String tome () {return "ко мне";}
    public void wanting (String str){
        System.out.print(this.name+" хочу "+str+" ");
    }
}
