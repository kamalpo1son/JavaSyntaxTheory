package src.Enum;

public class Test {
    public static void main(String[] args) {
        Season season=Season.AUTUMN;
        System.out.println(season.name());
        Animal animal=Animal.CAT;
        System.out.println(animal.name());

        Animal frog= Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season seasonWinter=Season.WINTER;
        System.out.println(seasonWinter.ordinal());

/*
        Animal animal=Animal.CAT;
        System.out.println(animal.toString());

        switch (animal){
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It'a a dog!");
                break;
            case FROG:
                System.out.println("It's a frog!");
                break;
        }
        Season season=Season.WINTER;
        System.out.println(season.getTemperature());

        //Object -> ENUM -> Season

        switch (season){
            case SUMMER -> System.out.println("It's warm outside!");
            case WINTER -> System.out.println("It's cold outside!");
        }
*/
    }
}
