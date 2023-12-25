package Final_Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.brand = "Lenovo";
        laptop1.ram = 8;
        laptop1.storage = 512;
        laptop1.os = "Windows 10";
        laptop1.color = "Silver";

        Laptop laptop2 = new Laptop();
        laptop2.brand = "Dell";
        laptop2.ram = 16;
        laptop2.storage = 256;
        laptop2.os = "Ubuntu";
        laptop2.color = "Black";

        Laptop laptop3 = new Laptop();
        laptop3.brand = "HP";
        laptop3.ram = 4;
        laptop3.storage = 128;
        laptop3.os = "Windows 11";
        laptop3.color = "White";

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        Map<String, Object> filterCriteria = getFilterCriteria();
        Set<Laptop> filteredLaptops = filterLaptops(laptops, filterCriteria);

        printSet(filteredLaptops);
    }

    static Map<String, Object> getFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filterCriteria = new HashMap<>();

        System.out.println("Enter filter criteria (separate multiple criteria with commas):");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage");
        System.out.println("3 - Operating System");
        System.out.println("4 - Color");

        String[] choices = scanner.nextLine().split(",");
        for (String choice : choices) {
            int option = Integer.parseInt(choice.trim());

            switch (option) {
                case 1:
                    System.out.println("Enter minimum RAM (GB):");
                    int minRam = scanner.nextInt();
                    filterCriteria.put("ram", minRam);
                    break;
                case 2:
                    System.out.println("Enter minimum storage (GB):");
                    int minStorage = scanner.nextInt();
                    filterCriteria.put("storage", minStorage);
                    break;
                case 3:
                    System.out.println("Enter desired operating system:");
                    String os = scanner.next();
                    filterCriteria.put("os", os);
                    break;
                case 4:
                    System.out.println("Enter desired color:");
                    String color = scanner.next();
                    filterCriteria.put("color", color);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        return filterCriteria;
    }

    static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filterCriteria) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriteria = true;

            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String key = entry.getKey();

                switch (key) {
                    case "ram":
                        int minRam = (int) entry.getValue();
                        if (laptop.ram < minRam) {
                            meetsCriteria = false;
                        }
                        break;
                    case "storage":
                        int minStorage = (int) entry.getValue();
                        if (laptop.storage < minStorage) {
                            meetsCriteria = false;
                        }
                        break;
                    case "os":
                        String os = (String) entry.getValue();
                        if (!laptop.os.equals(os)) {
                            meetsCriteria = false;
                        }
                        break;
                    case "color":
                        String color = (String) entry.getValue();
                        if (!laptop.color.equals(color)) {
                            meetsCriteria = false;
                        }
                        break;
                }
            }

            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }

    static void printSet(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
