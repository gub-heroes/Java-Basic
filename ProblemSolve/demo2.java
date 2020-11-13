//Problem 2 - Write a Java program to illustrate the concept of Single inheritance.
package ProblemSolve;

class Box {
    double width, height, depth;

    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        this.width = this.height = this.depth = 1;
    }

    Box(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return (this.width * this.height * this.depth);
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }
}

public class demo2 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol = mybox1.volume();
        System.out.println("Volume is :" + vol);
        System.out.println("Weight is :" + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("Volume is :" + vol);
        System.out.println("Weight is :" + mybox2.weight);

    }
}
