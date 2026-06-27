package Animals;

public class Figures {
    
    // Интерфейс
    interface Figure {
        default double getPerimeter() {
            return 0;
        }
        
        default double getArea() {
            return 0;
        }
        
        String getFillColor();
        String getBorderColor();
    }

    // Класс Круг
    static class Circle implements Figure {
        private double radius;
        private String fillColor;
        private String borderColor;
        
        public Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
        
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
        
        @Override
        public String getFillColor() {
            return fillColor;
        }
        
        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }

    // Класс Прямоугольник
    static class Rectangle implements Figure {
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;
        
        public Rectangle(double width, double height, String fillColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
        
        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
        
        @Override
        public double getArea() {
            return width * height;
        }
        
        @Override
        public String getFillColor() {
            return fillColor;
        }
        
        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }

    // Класс Треугольник
    static class Triangle implements Figure {
        private double sideA;
        private double sideB;
        private double sideC;
        private String fillColor;
        private String borderColor;
        
        public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
        
        @Override
        public double getPerimeter() {
            return sideA + sideB + sideC;
        }
        
        @Override
        public double getArea() {
            double p = getPerimeter() / 2; 
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
        
        @Override
        public String getFillColor() {
            return fillColor;
        }
        
        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }

    // ГЛАВНЫЙ МЕТОД
    public static void main(String[] args) {
        
        Circle circle = new Circle(5, "Желтый", "Красный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Черный");
        Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Оранжевый");
        
        System.out.println("=== КРУГ ===");
        System.out.println("Радиус: 5");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        
        System.out.println();
        
        System.out.println("=== ПРЯМОУГОЛЬНИК ===");
        System.out.println("Ширина: 4, Высота: 6");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());
        
        System.out.println();
        
        System.out.println("=== ТРЕУГОЛЬНИК ===");
        System.out.println("Стороны: 3, 4, 5");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
    }
}