import java.util.ArrayList;
import java.util.function.Consumer;

public class WhiteNights {
    public static void main (String[]args) {
        Day today = new Day(Time.Today);
        today.setchar(Daychar.Sad);
        today.setchar(Daychar.Rainy);
        today.setchar(Daychar.WithoutaGap);

        System.out.print(today.name + " - ");
        today.chararray.forEach(s -> System.out.print(s + ", "));
        today.compare(Human.old);
        Feels minds = new Feels("мысли", FeelsChars.Strange);
        Feels feeling = new Feels("ощущения", FeelsChars.Dark);
        Feels questions = new Feels("вопросы", FeelsChars.Unclear);
        Me myself = new Me(Human.me);
        myself.belongings(minds, Feels.tesnyat);
        myself.belongings(feeling, Feels.tesnyat);
        myself.belongings(questions, Feels.tesnyat);
        try {
            myself.doingsth(Actions.razreshit);
        } catch (AbilityException e) {
            myself.notableto(Actions.razreshit);
        }
        She herself = new She(Human.she);
        ArrayList<Human> we = new ArrayList<>();
        we.add(herself);
        we.add(myself);
        today.setnewchars();
        today.describetoday();
        Human.doingtogether(we, Actions.seeeachother);
        Day Yesterday = new Day(Time.Yesterday);
        Yesterday.describeday();
        Human.whiledoing(we, Actions.goodbye);
        Weather clouds = new Weather(Weather.Clouds);
        Weather fog = new Weather(Weather.Fog);
        clouds.actionforclouds(Actions.becloud);
        fog.actionforfog(Actions.up);
        Day tomorrow = new Day(Time.Tomorrow);
        tomorrow.setchar(Daychar.Bad);
        tomorrow.setbelongstohuman(myself);
        var firstdialogue = new Dialogue() {
            @Override
            public void startdialogue(Human obj) {
                obj.describeownday(tomorrow);
            };
        };
        firstdialogue.startdialogue(myself);
        try {
            herself.doingsth(Actions.answer);
        } catch (AbilityException e) {
            herself.notableto(Actions.answer);
        }
        Day tomorrow1 = new Day (Time.Tomorrow);
        tomorrow1.setchar(Daychar.Light);
        tomorrow1.setchar(Daychar.Clear);
        tomorrow1.setbelongstohuman(herself);
        herself.describeownday(tomorrow1);
        Weather rain = new Weather(Weather.Rain);
        var seconddialogue = new Dialogue() {
            @Override
            public void startdialogue(Human obj) {
                try {
                   Human.said(herself);
                } catch (ClassException e) {
                    System.out.println("Действие не может быть совершено");
                }
                Combinations.condition();
                tomorrow.willbeweather(rain);
                try {
                    herself.doingsth(Actions.checkgo(Time.Tomorrow, herself));
                } catch (AbilityException e) {
                    myself.notableto(Actions.checkgo(Time.Tomorrow, myself));
                }
            }
        };
        seconddialogue.startdialogue(herself);
        try {
            myself.justdo(Actions.checkthought(myself));
            Actions.checknotice(herself, rain);
        } catch (AbilityException e) {
            System.out.println("Действие не может быть совершено");
        }
        Combinations.but();
        try {
            herself.justdo(Actions.checkgo(Time.Yesterday, herself));
        } catch (AbilityException e) {
            herself.notableto(Actions.checkgo(Time.Yesterday, herself));
            System.out.println();
        }
        class Meetingandnight {
            final String name1;
            final String name2;
            final int counting;
            public Meetingandnight(String str1, String str2, int makecount) {
                name1 = str1;
                name2 = str2;
                counting = makecount;
            }
            public void describeit(Day day, Daychar dc) {
                String daychar = dc.toString();
                if (daychar.equals("White")) {
                    daychar = "белая ";
                    System.out.println(day.timing +" было наше " + counting + " " + name1 + ", наша " + counting + " " + daychar + name2);
                }
            }
        }
        var meetandn = new Meetingandnight("cвидание", "ночь", 3);
        meetandn.describeit(Yesterday, Daychar.White);
        Feels glad = new Feels("Радость");
        Feels happiness = new Feels("Счастье");
        Me man=new Me("Человек");
        glad.impaction(glad, man, Actions.makehappy(myself));
        happiness.impaction(happiness, man, Actions.doi);
        var boilingheart = new Heart(){
            @Override
          public void boils(String object, String belonging){
                System.out.println(belonging +" " +object+" "+Actions.boils);
          }
        };
        boilingheart.boils(Heart.heart, myself.belongsnoobj());
        myself.wanting(Actions.spill);
        myself.belongs(Heart.heart);
        Combinations.into();
        herself.belongs(Heart.heart);
        myself.wanting(Combinations.to());
        Feels all = new Feels("всё");
        all.setchar(FeelsChars.Havefun);
        all.setchar(FeelsChars.Laugh);
        all.describefeel();
        glad.setchar(FeelsChars.Catching);
        glad.describefeel();
        Feels kind = new Feels("доброта");
        Feels bliss = new Feels("нега");
        class Words {
            Feels ownfeel1;
            Feels ownfeel2;
            String wordchar;
            String name;
            final ArrayList<String>wordarray=new ArrayList<>();
            public Words (FeelsChars chars1, FeelsChars chars2, FeelsChars chars3, String naming){
                String char1= chars1.toString();
                String char2= chars2.toString();
                String char3= chars3.toString();
                this.name=naming;
                switch (char1){
                    case "Easy":
                        this.wordchar="легки";
                        wordarray.add(wordchar);
                        break;
                    case "Playful":
                        this.wordchar="игривы";
                        wordarray.add(wordchar);
                        break;
                    case "Funny":
                        this.wordchar="веселы";
                        wordarray.add(wordchar);
                        break;
                }
                switch (char2){
                    case "Easy":
                        this.wordchar="легки";
                        wordarray.add(wordchar);
                        break;
                    case "Playful":
                        this.wordchar="игривы";
                        wordarray.add(wordchar);
                        break;
                    case "Funny":
                        this.wordchar="веселы";
                        wordarray.add(wordchar);
                        break;
                }
                switch (char3){
                    case "Easy":
                        this.wordchar="легки";
                        wordarray.add(wordchar);
                        break;
                    case "Playful":
                        this.wordchar="игривы";
                        wordarray.add(wordchar);
                        break;
                    case "Funny":
                        this.wordchar="веселы";
                        wordarray.add(wordchar);
                        break;
                }
            }
            public Words (Feels feel1, Feels feel2){
                ownfeel1=feel1;
                ownfeel2=feel2;
            }
            final static String word = "словах";
            final static String word1 = "слова";
            public void wordsfullof (Day day1, She obj1, Me obj2) {
                System.out.println(day1.timing +Combinations.in()+ obj1.belongsnoobj() + Words.word+" " +Actions.was+" "+ownfeel1.naming+" и "+ownfeel2.naming+ " " +obj2.tome());
            }
            public void describewords(Human obj1, boolean ability){
                if(obj1.equals(Human.she)){
                    if (!ability) {
                        System.out.print(((She) obj1).belongsnoobj() + this.name + " больше не ");
                        this.wordarray.forEach(new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.print(s + ", ");
                            }
                        });
                    }
                    if (ability){
                        System.out.print(((She) obj1).belongsnoobj() + this.name);
                        this.wordarray.forEach(new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.print(s + ", ");
                            }
                        });
                    }
                }
            }
        }
        var newWords = new Words(kind, bliss);
        newWords.wordsfullof(Yesterday, herself, myself);
        herself.cared(myself);
        herself.caressed(myself);
        herself.doingwithsmth(" нежила ", Heart.heart, myself);
        try {
            myself.justdo(Actions.checkthought(myself));
        }
        catch (AbilityException e){
            myself.notableto(Actions.checkthought(myself));
        }
        Combinations.uncertain(herself);
        myself.doubts(Actions.checkthought(myself));
        Feels tender = new Feels ("нежность");
        Feels care = new Feels ("забота");
        Feels love = new Feels ("любовь");
        herself.belongs(tender);
        herself.belongs(care);
        herself.belongs(love);
        glad.restartdescribing();
        glad.setchar(FeelsChars.MeetingAnother);
        Feels.onefeelisanother(glad);
        Human himself = new Me (Human.he);
        Combinations.when();
        try {
            himself.doingsth(Actions.checkgo(Time.Yesterday, himself));
        }
        catch (AbilityException e){
            himself.notableto(Actions.checkgo(Time.Yesterday, himself));
        }
        try {
            herself.doingsth(Actions.nahmurilas);
        }
        catch (AbilityException e){
            herself.notableto(Actions.nahmurilas);
        }
        try {
            herself.doingsth(Actions.zarobela);
            System.out.println();
        }
        catch (AbilityException e){
            herself.notableto(Actions.zarobela);
            System.out.println();
        }
        Words herwords = new Words(FeelsChars.Funny, FeelsChars.Playful, FeelsChars.Easy, Words.word1);
        herwords.describewords(herself, false);
    }
}
