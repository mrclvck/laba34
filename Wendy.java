import java.util.ArrayList;

public class Wendy {
    private String name;
    private String thingInHands;
    private String location;
    private String status;
    private int anxiety;
    private ArrayList<String> ingredientsForDinner = new ArrayList<>();

    public void setThingInHands(String thingInHands) {
        this.thingInHands = thingInHands;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void wentTo(String place) {
        System.out.println(name + " прошла к " + place);
        setLocation(place);
    }
    public void pushedBack(String thing) {
        System.out.println(name + " отодвинула " + thing);
        setStatus("немного устала");
    }
    public void comeIn(String place) {
        System.out.println(name + " зашла " + place);
        setStatus("холодно");
    }
    public void take(String thing) {
        setThingInHands(thing);
        System.out.println(name + " взяла " + thing);
    }
    public void lockedUp(String thing) {
        System.out.println(name + " заперла " + thing);
        setStatus("задумчиво");
    }
    public void addToIngredients() {
        ingredientsForDinner.add(thingInHands);
    }
    class Door {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void wasStuckTo(String thing) {
            System.out.println(name + " плотно прилегала к " + thing);
        }
        public Door(String name) {
            setName(name);
        }
    }
    Door door = new Door("дверь");
    public void worried() {
        double a = 1;
        double b = Math.random();
        System.out.println(name + " беспокоилась, так как плохо закрыла " + door.getName());
        int increase = (int) Math.ceil(Math.random() * 100);
        anxiety += increase;
        System.out.println(name + " беспокоится на " + anxiety + "%");
        while (a > b) {
            System.out.println(name + " всё ещё беспокоилась ");
            increase = (int) Math.ceil(Math.random() * 100);
            anxiety += increase;
            System.out.println(name + " беспокоится на " + anxiety + "%");
            a = Math.random();
            b = Math.random();
            if (anxiety > 100) {
                break;
            }
        }
        if (anxiety <= 100) {
            door.wasStuckTo("пол");
            System.out.println(name + " больше не беспокоится,что продукты испортятся из-за крысиного помета ");
            setStatus("комфортно");
        }
        else {
            System.out.println(name + " понимает, что продукты испортятся ");
            setStatus("дискомфортно");
        }
    }

    public void openedJar() {
        System.out.println(name + " взяла " + Things.JAR);
        setThingInHands(String.valueOf(Things.JAR));
    }
    public void putInPot() {
        System.out.println(name + " положила в " + Things.POT );
        setThingInHands(String.valueOf(Things.POT));

    }

    public void wentToFridge() {
        System.out.println(name + " подошла к " + Things.FRIDGE);
        setStatus("медленно");
    }

    public void tookMilk() {
        System.out.println(name + " взяла " + Things.MILK);
        setThingInHands(String.valueOf(Things.MILK));
        addToIngredients();
    }
    public void tookEggs() {
        System.out.println(name + " взяла " + Things.EGGS);
        setThingInHands(String.valueOf(Things.EGGS));
        addToIngredients();
    }
    public void tookCheese() {
        System.out.println(name + " взяла " + Things.CHEESE);
        setThingInHands(String.valueOf(Things.CHEESE));
        addToIngredients();
    }
    public Wendy(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return location.hashCode()*thingInHands.hashCode();
    }
    public void calmedDown() {
        String place = "кухня";
        String cheese = "сыр";
        if (hashCode() == place.hashCode()*cheese.hashCode()) {
            System.out.println(name + " успокоилась");
            setStatus("спокойно");
        }
        else {
            System.out.println(name + " обеспокоена ");
            setStatus("тревожно");

        }
    }

    public void meltedButter() {
        System.out.println(name + " растопила " + Things.BUTTER);
        setThingInHands(String.valueOf(Things.BUTTER));
        addToIngredients();
    }
    public void addMilk() {
        System.out.println(name + " добавила в томатный суп " + Things.MILK);
        setThingInHands(String.valueOf(Things.MILK));
        addToIngredients();
    }
    public void pouredEggs(){
        System.out.println(name + " вылила на сковородку " + Things.EGGS);
        setThingInHands(String.valueOf(Things.EGGS));
        addToIngredients();
    }

    public void turnedAround() {
        class Feeling {
            private String name;
            public void covered() {
                System.out.println(name + " охватило");
            }
            public Feeling(String name) {
                this.name = name;
            }
        }
        Feeling feeling = new Feeling("Чувство");
        feeling.covered();
        AbleToStandAndReachOut somebody = new AbleToStandAndReachOut() {
            @Override
            public void StandAndReachOut(String placeOne, String placeTwo) {
                System.out.println("Кто-то стоит " + placeOne + " тянется " + placeTwo);
            }
        };
        somebody.StandAndReachOut("за спиной", "к горлу");
        double a = 1;
        double b = Math.random();
        while (a > b) {
            System.out.println(name + " боится обернуться ");
            setStatus("напугана");
            a = Math.random();
            b = Math.random();
        }
        System.out.println(name + " обернулась ");
        setStatus("confused");
    }
    public void sawNoOne(String thing) {
        System.out.println(name + " увидела,что " + thing + " не стоит ");
        setStatus("удивлена");
    }

    public void heldKnife(String thing) {
        System.out.println(name + " держала " + thing);
        setStatus("страшно");
    }

    public void thought(String thoughts) {
        System.out.println(name + " подумала " + thoughts);
        setStatus("более уверенно");
    }


    public void rubbedCheese(){
        System.out.println(name + " натерла " + Things.CHEESE);
        setThingInHands(String.valueOf(Things.CHEESE));
        addToIngredients();
    }
    public void throwUpOmelette(String thing) {
        System.out.println(name + " подбросила " + thing);
        setStatus("ловко");
    }
    public void putPot() {
        System.out.println(name + " поставила на большой поднос " + Things.POT);
        setThingInHands(String.valueOf(Things.POT));

    }
    public void putDownDishes(String thing) {
        System.out.println(name + " положила на стол " + thing);
        setStatus("спокойна");
    }
    public void relocateOmelette(String thing) {
        System.out.println(name + " переложила на тарелку " + thing);
        setThingInHands(thing);
    }
    public void coveredOmelette(String thing) {
        System.out.println(name + " накрыла второй тарелкой " + thing);
        setThingInHands(thing);
    }
    public void stopped(String place)  {
     System.out.println(name + " остановилась в " + place);
     setStatus("устала");
    }

    public void putDownTray() {
        System.out.println(name + " поставила " + Things.TRAY);
        setThingInHands(String.valueOf(Things.TRAY));
    }


    public void sixSense() {
       Sense unrealistic = new Sense("Нереальность") {
            @Override
            public void wasVisible(String place, String object) {
                System.out.println(object + " была видна " + place);
            }
        };
        unrealistic.wasVisible("в этом месте", unrealistic.getName());
        Sense surrealism = new Sense("Сюрреалистичность") {
            @Override
            public void wasVisible(String place, String object) {
                System.out.println(object + " не была видна " + place);
            }
        };
        surrealism.wasVisible("в этом месте", surrealism.getName());
    }
}


