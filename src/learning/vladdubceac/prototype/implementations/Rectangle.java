package learning.vladdubceac.prototype.implementations;

import learning.vladdubceac.prototype.Shape;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
