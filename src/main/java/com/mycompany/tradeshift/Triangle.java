package com.mycompany.tradeshift;

public class Triangle {

    double a;
    double b;
    double c;

    public enum Type {
        Equilateral,
        Isosceles,
        Scalene;
    };

    public Triangle(double a, double b, double c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;

        //triangles need to have positive length on all legs
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Legs of the triangle needs to be a positive rational number");
        }

        //find length of the longest leg
        double longestLeg = Math.max(Math.max(a, b), c);
        //calculate combined length of the two shorter legs
        double shortLegs = a + b + c - longestLeg;

        //if the length of the two shorter legs is lower or equal to the longest leg
        //the triangle cannot be valid
        if (shortLegs <= longestLeg) {
            throw new Exception("Not a valid triangle");
        }
    }

    public Type getType() {
        //equilateral triangles have 3 sides of equal lengths
        if (a == b && b == c) {
            return Type.Equilateral;
        } //isosceles triangles have 2 sides of equal length
        else if (a == b || b == c || c == a) {
            return Type.Isosceles;
        }
        //scalene triangles have no sides of equal length
        return Type.Scalene;
    }

}
