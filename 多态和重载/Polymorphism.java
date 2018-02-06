import java.util.*;

class Shape {
    Shape() {
    }

    void Invalid() {
        System.out.println("Shape.Invalid.");
        Draw();
    }

    private void Draw() {
        System.out.println("Shape.Draw.");
    }
}

class Circle extends Shape {
    Circle() {
    }

    void Invalid(boolean force) {
        System.out.println("Circle.Invalid.");
        Draw();
    }

    void Draw() {
        System.out.println("Circle.Draw.");
    }
}

class Polymorphism{
    public static void main(String[] args) {
        Shape shape = new Circle();
        //这里最终调用的是Shape.Draw,也就是说，Java里面，不能通过重写private方法产生多态行为
        shape.Invalid();

        Circle circle = new Circle();
        //这在Java里是可以执行的
        circle.Invalid(true);
    }
}
