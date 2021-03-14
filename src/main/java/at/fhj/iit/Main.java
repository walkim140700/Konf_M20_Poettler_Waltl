package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid vodka = new Liquid("Vodka", 0.04, 40);
        Liquid peachLiqueur = new Liquid("Peach Liqueur", 0.02, 20);
        Liquid cranberryJuice = new Liquid("Cranberry Juice", 0.08, 0);
        Liquid pineappleJuice = new Liquid("Pineapple Juice", 0.06, 0);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        Cocktail sexOnTheBeach = new Cocktail("Sex on the Beach");
        sexOnTheBeach.addLiquid(vodka);
        sexOnTheBeach.addLiquid(peachLiqueur);
        sexOnTheBeach.addLiquid(cranberryJuice);
        sexOnTheBeach.addLiquid(pineappleJuice);
        System.out.println(sexOnTheBeach.toString());
        System.out.println("Contains "+sexOnTheBeach.getVolume()+
                "L of liquid and has an alcohol percentage of "+sexOnTheBeach.getAlcoholPercent()+"%");


        Liquid Tequilla = new Liquid("Tequilla" , 0.02, 40);
        Shots s = new Shots("Tequilla" ,Tequilla, false, " Olmeca");
        System.out.println("Shots " + "type Liquer " + s.name +" brand " + s.getBrand());
        System.out.println("Alcohol percentage " + s.getAlcoholPercent() +"%");
        System.out.println("Centiliter " + s.getVolume() + " l" );
        System.out.println("With Ice cubes " + s.getIceCubes());



}
}
