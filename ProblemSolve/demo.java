//Problem 1 - Write a Java program to illustrate the concept of Dynamic Polymorphism.
package ProblemSolve;

class Figure {
  double dim1, dim2;

  Figure(double a, double b) {
    this.dim1 = a;
    this.dim2 = b;
  }

  double area() {
    System.out.println("Area for Figure is undefined");
    return 0;
  }
}

class Rectangle extends Figure {
  Rectangle(double a, double b) {
    super(a, b);
  }

  double area() {
    return this.dim1 * this.dim2;
  }
}

class Triangle extends Figure {
  Triangle(double a, double b) {
    super(a, b);
  }

  double area() {
    return (this.dim1 * this.dim2) / 2;
  }
}

public class demo {
  public static void main(String[] args) {
    Figure f = new Figure(10, 10);
    Rectangle r = new Rectangle(9, 5);
    Triangle t = new Triangle(10, 8);

    Figure figuref;
    figuref = r;
    System.out.println("Area of Rectangle is: " + figuref.area());

    figuref = t;
    System.out.println("Area of Triangle is: " + figuref.area());

    figuref = f;
    System.out.println("Area of Figure is: " + figuref.area());
  }
}
