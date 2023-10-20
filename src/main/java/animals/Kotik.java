package animals;

import java.util.ArrayList;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    private static int count = 0;

    private static final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    public boolean play() {
        return doSomething("Я пошел играть");
    }

    public boolean sleep() {
        return doSomething("Я пошел спать");
    }

    public boolean wash() {
        return doSomething("Я пошел мыться");
    }

    public boolean walk() {
        return doSomething("Я ушел гулять");
    }

    public boolean hunt() {
        return doSomething("Я пошел на охоту");
    }

    public void eat(int countFood) {
        System.out.println("Интересно что ты мне скормил...");
        satiety = satiety + countFood;
    }

    public void eat(int countFood, String nameOfFood) {
        System.out.println(nameOfFood + "была вкусная");
        satiety = satiety + countFood;
    }

    public void eat() {
        eat(1, "Вкусняшка");
    }

    public String[] liveAnotherDay() {

        String[] myArray = new String[24];
        for (int i = 0; i < 24; i++) {
            int action = (int) (Math.random() * METHODS) + 1;
            switch (action) {
                case 1:
                    myArray[i] = checkAction(i, play(), "поиграл");
                    break;
                case 2:
                    myArray[i] = checkAction(i, sleep(), "поспал");
                    break;
                case 3:
                    myArray[i] = checkAction(i, walk(), "погулял");
                    break;
                case 4:
                    myArray[i] = checkAction(i, wash(), "помылся");
                    break;
                case 5:
                    myArray[i] = checkAction(i, hunt(), "поохотился");
                    break;
                default:
                    System.out.println("Что то пошло не так");
            }
        }
        return myArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }


    private Boolean doSomething(String action) {
        if (satiety > 0) {
            System.out.println(action);
            satiety--;
            return true;
        } else {
            System.out.println("Покорми меня");
            return false;
        }
    }

    public String checkAction(int i, Boolean ok, String string) {
        String result;

        if (!ok) {

            eat();

            result = (i + 1) + " - поел";
        } else
            result = (i + 1) + " - " + string;
        return result;
    }
}

