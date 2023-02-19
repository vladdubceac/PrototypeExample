package learning.vladdubceac.prototype.implementations;

import learning.vladdubceac.prototype.Shape;

public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
