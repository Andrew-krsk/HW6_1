import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение,
    // Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.
    public static void main(String[] args) {
        List<Laptop> NbColl = new ArrayList<>();
        Map<String, String> Params = new HashMap<>();
        NbColl = initListNotebooks(NbColl);
        // System.out.println(NbColl.toString());
        Params.put("ОЗУ", "16");
        Params.put("SSD", "128");
        System.out.println((filter(Params, NbColl)));
    }

    public static List<Laptop> filter(Map<String, String> params, List<Laptop> notebooks) {
        List<Laptop> result = new ArrayList<>();

        for (String s : params.keySet()) {
            for (Laptop nb : notebooks) {
                switch (s) {
                    case "ОЗУ":
                        if (nb.getRam() == Integer.parseInt(params.get(s))) {
                            result.add(nb);
                        }
                        break;
                    case "SSD":
                        if (nb.getSsd() == Integer.parseInt(params.get(s))) {
                            result.add(nb);
                        }
                        break;
                }
            }
        }
        return result;
    }

    public static List<Laptop> AddNb(List<Laptop> lst) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            Laptop laptop = new Laptop();
            System.out.print("Введите модель ноутбука: -> ");
            laptop.setModel(scanner.nextLine());
            System.out.print("Введите объём оперативной памяти: -> ");
            laptop.setRam(scanner.nextInt());
            System.out.print("Введите объём жесткого диска в ГБ: -> ");
            laptop.setHdd(scanner.nextInt());
            System.out.print("Введите объём SSD в ГБ: -> ");
            laptop.setSsd(scanner.nextInt());
            System.out.print("Введите Операционную систему: -> ");
            laptop.setOs(scanner.nextLine());
            lst.add(laptop);
            System.out.print("Хотите добавить еще один ноутбук. Если да введите 1. Нет 0! ->");
            int f = scanner.nextInt();
            flag = (f == 1) ? true : false;
        } while (flag);
        return lst;
    }

    public static List<Laptop> initListNotebooks(List<Laptop> lst) {
        Laptop laptop1 = new Laptop();
        laptop1.setModel("Asus K54");
        laptop1.setRam(4);
        laptop1.setSsd(1000);
        laptop1.setHdd(0);
        laptop1.setOs("Windows 11 Home");
        lst.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setModel("Acer K77");
        laptop2.setRam(8);
        laptop2.setSsd(512);
        laptop2.setHdd(512);
        laptop2.setOs("Windows 10");
        lst.add(laptop2);

        Laptop laptop3 = new Laptop();
        laptop3.setModel("Macbook Air");
        laptop3.setRam(16);
        laptop3.setSsd(256);
        laptop3.setHdd(1024);
        laptop3.setOs("MacOS");
        lst.add(laptop3);

        return lst;
    }

}