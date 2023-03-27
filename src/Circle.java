public class Circle {
    private double radius;
    private String color;
    private double area;
    private double circumference;

    public Circle(double radius, String color, double area, double circumference) {
        setRadius(radius);
        setColor(color);
        setArea(area);
        setCircumference(circumference);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        area = Math.PI * this.radius * this.radius;
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setCircumference (double circumferenece){
        this.circumference = circumference;
    }
    public double getCircumference (){
        circumference = Math.PI*this.radius*2;
        return circumference;
    }

}

