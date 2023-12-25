package Final_Test;

import java.util.*;

public class Laptop {
    String brand;
    int ram;
    int storage;
    String os;
    String color;

    @Override
    public String toString() {
        return "Brand: " + brand + ", RAM: " + ram + "GB, Storage: " + storage + "GB, OS: " + os + ", Color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Laptop) {
            Laptop laptop = (Laptop) obj;
            return brand.equals(laptop.brand) && ram == laptop.ram
                    && storage == laptop.storage && os.equals(laptop.os) && color.equals(laptop.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + 7 * ram + 11 * storage + 17 * os.hashCode() + 23 * color.hashCode();
    }
}

