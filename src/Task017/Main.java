package Task017;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.poroda = "Персидская";
        cat1.ownerName = "Мария Ивановна";

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.age = 9;
        cat2.poroda = "Дворняга";
        cat2.ownerName = "Кирилл Петрович";

        Cat cat3 = new Cat();
        cat3.name = "Мурка";
        cat3.age = 8;
        cat3.poroda = "Сфинкс";
        cat3.ownerName = "Семен Иванович";

        Cat cat4 = new Cat();
        cat4.name = "Рыжик";
        cat4.age = 9;
        cat4.poroda = "Британская";
        cat4.ownerName = "Вася";

        Cat cat5 = new Cat();
        cat5.name = "Рыжик";
        cat5.age = 9;
        cat5.poroda = "Британская";
        cat5.ownerName = "Вася";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(findByAge(cats, 9));
    }

    static Set<Cat> findByAge(Set<Cat> cats, int minAge){
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats){
            if (cat.age >= minAge){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}