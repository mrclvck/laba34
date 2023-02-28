public enum Things {
    SOUP("томатный суп"),
    JAR("банка"),
    POT("кастрюля"),
    FRIDGE("холодильник"),
    BUTTER("масло"),
    PAN("сковородка"),
    MILK("молоко"),
    EGGS("яйца"),
    CHEESE("сыр"),
    KNIFE("нож"),
    TRAY("поднос");
    private final String describe;

    Things(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return describe;
    }
}
