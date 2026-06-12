public class Product {
    String name; // название
    String productionDate; //дата производства
    String manufacturer;
    String country;
    int cost;
    boolean isBooked; //состояние бронирования покупателем

    public Product (String name, String productionDate, 
        String manufacturer, String country, int cost, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this. country = country;
        this.cost = cost;
        this.isBooked = isBooked;
    }  

    public void displayInfo() {
        System.out.println();
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна проихождения: " + country);
        System.out.println("Цена: " + cost + " руб.");
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
        System.out.println("------------------------------------------------");
    }
    public static void main(String[]args) {

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product ("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, false);
        productsArray[1] = new Product ("Huawei", "01.02.2026", "Huawei", "China", 13000, false);
        productsArray[2] = new Product ("Samsung S25", "01.02.2025", "Samsung Corp.", "Korea", 6599, true);
        productsArray[3] = new Product ("Samsung Ultra", "01.02.2025", "Samsung Corp.", "Korea", 10599, false);
        productsArray[4] = new Product ("Samsung 10 pro max", "01.02.2026", "Samsung Corp.", "Korea", 50599, false);
        
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].displayInfo();
        }

        Product product1 = new Product ("Кружка", "12.12.2025", "ООО Цань-Мань", "Китай", 1500, true);
    
        product1.displayInfo();
        
        Park park = new Park();
        Park.Attraction att1 = park.new Attraction("Американские горки", "10:00-22:00", 500);
        Park.Attraction att2 = park.new Attraction("Колесо обозрения", "10:00-22:00", 300);
        Park.Attraction att3 = park.new Attraction("Автодром", "10:00-20:00", 250);
        
        att1.display();
        att2.display();
        att3.display();
        
        }
}

class Park {
    class Attraction {
        String name;
        String workTime;
        int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public void display() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workTime);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("---------------------------");
        }
    }

}

