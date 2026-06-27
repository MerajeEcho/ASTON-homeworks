package Animals;
public class Animals {
    protected String name;
    protected static int animalCount = 0;
    
    public Animals(String name) {  
        this.name = name;
        animalCount++;
    }
    
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
    
    public static int getAnimalCount() {
        return animalCount;
    }
    
    public static void main(String[] args) {
        // Создаём животных
        Dog bobik = new Dog("Бобик");
        Dog rex = new Dog("Рекс");
        Cat murka = new Cat("Мурка");
        Cat barsik = new Cat("Барсик");
        
        // Проверяем бег
        bobik.run(150);
        bobik.run(600);
        murka.run(150);
        murka.run(250);
        
        System.out.println();
        
        // Проверяем плавание
        bobik.swim(5);
        bobik.swim(15);
        murka.swim(5);
        
        System.out.println();
        
        // Подсчёт животных 
        System.out.println("Всего животных: " + Animals.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        
        System.out.println("\n=== Коты и миска ===\n");
        
        // Миска с едой
        Bowl bowl = new Bowl(20);
        bowl.showInfo();
        
        // Массив из котов
        Cat[] cats = {murka, barsik, new Cat("Рыжик"), new Cat("Пушок")};
        int[] eatAmounts = {10, 8, 5, 3};
        
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, eatAmounts[i]);
            bowl.showInfo();
        }
        
        System.out.println("\n=== Сытость котов ===\n");
        for (Cat cat : cats) {
            System.out.println(cat.name + " — сыт? " + cat.isFull());
        }
        
        // Добавляем еду
        System.out.println("\n=== Добавляем еду ===\n");
        bowl.addFood(15);
        
        // Голодные коты едят
        System.out.println("\n=== Голодные коты едят ещё ===\n");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 5);
                bowl.showInfo();
            }
        }
        
        System.out.println("\n=== Финальный результат ===\n");
        for (Cat cat : cats) {
            System.out.println(cat.name + " — сыт? " + cat.isFull());
        }
    }
}
class Dog extends Animals {
    private static int dogCount = 0;
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;
    
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + MAX_RUN + " м.)");
        }
    }
    
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + MAX_SWIM + " м.)");
        }
    }
    
    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animals {
    private static int catCount = 0;
    private static final int MAX_RUN = 200;
    private boolean isFull = false;
    
    public Cat(String name) {
        super(name);
        catCount++;
    }
    
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + MAX_RUN + " м.)");
        }
    }
    
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
    
    public void eat(Bowl bowl, int amount) {
        if (bowl.takeFood(amount)) {
            isFull = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт");
        } else {
            System.out.println(name + " не хватило еды (" + amount + "), остался голодным");
        }
    }
    
    public boolean isFull() {
        return isFull;
    }
    
    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int foodAmount;
    
    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. В миске теперь " + foodAmount);
        }
    }
    
    public boolean takeFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    public int getFoodAmount() {
        return foodAmount;
    }
    
    public void showInfo() {
        System.out.println("В миске " + foodAmount + " еды");
    }
}