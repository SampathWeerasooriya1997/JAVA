package com.company;


abstract class Solid<T>{

    protected String color;

    public Solid(String color) {
        this.color = color;
    }

    public abstract double volume();
}


class Cuboid extends Solid<Double>{

    private double length;
    private double width;
    private double height;

    public Cuboid(String color, double length, double width, double height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public double volume() {
        return this.length*this.width*this.height;
    }

    public double cubeVolume() {
        return this.length*this.length*this.length;
    }


}

class Sphere extends Solid {

    private double radius = 1;

    public Sphere(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4/3)*3.14*radius*radius*radius;
    }
}

 class TestSolid{

     public static void main(String[] args) {
         Cuboid cuboid = new Cuboid("blue",5.2,3.5,2.7);
         Cuboid cube = new Cuboid("green",4.6);
         Sphere sphere = new Sphere("red",5.25);

         System.out.println("Volume of the cuboid : "+cuboid.volume());
         System.out.println("Volume of the cube : "+cube.cubeVolume());
         System.out.println("Volume of the sphere : "+sphere.volume());
     }




 }