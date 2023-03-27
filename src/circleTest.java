public class circleTest {
    public static void main(String[] args) {
        Circle Circle01 = new Circle(1.0, "Red", 10, 5);
        Circle Circle02 = new Circle(4.5, "Green",2, 6);
        Circle Circle03 = new Circle(3.2, "Blue",5,7);
        System.out.println("Radius: " + Circle01.getRadius() + ", Color: " + Circle01.getColor() + ", Area: " + Circle01.getArea() + ", circumference " + Circle01.getCircumference());
        System.out.println("Radius: " + Circle02.getRadius() + ", Color: " + Circle02.getColor() + ", Area: " + Circle02.getArea()+ ", circumference " + Circle02.getCircumference());
        System.out.println("Radius: " + Circle03.getRadius() + ", Color: " + Circle03.getColor() + ", Area: " + Circle03.getArea() + ", circumference " + Circle03.getCircumference());
    }
}
