package sourse;

import animals.Kotik;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Kotik kotikTwo = new Kotik("Сэм", "Мяу!", 2, 3);

        Kotik kotikOne = new Kotik();

        kotikOne.setName("Sam");
        kotikOne.setVoice("Meow!");
        kotikOne.setSatiety(3);
        kotikOne.setWeight(4);

        ArrayList<String> resultKotikOne = kotikOne.liveAnotherDay();
        for (String string : resultKotikOne) {
            System.out.println(string);
        }

        System.out.println("Котика 1 зовут: " + kotikOne.getName());
        System.out.println("Вес котика 1: " + kotikOne.getWeight());

        System.out.println("Сравниваем голоса котиков, они одинаковые? " + compareCatsVoice(kotikOne, kotikTwo));

        System.out.println("Всего создано котиков: " + kotikOne.getCount());
    }

    public static Boolean compareCatsVoice(Kotik KotikOne, Kotik kotikTwo) {
        if (kotikTwo.getVoice().equals(KotikOne.getVoice())) return true;
        return false;
    }

}
