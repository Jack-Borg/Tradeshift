/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tradeshift;

public class Triangle {

    double a;
    double b;
    double c;
    
    public enum Type{
        Equilateral,
        Isosceles,
        Scalene;
    };
    
    public Triangle(double a, double b, double c) throws Exception{      
        this.a = a;
        this.b = b;
        this.c = c;
        
        //triangles need to have positive length on all legs
        if(a<=0 || b <=0 || c <= 0){
            throw new Exception("not a valid triangle");
        }
    }

    public Type getType(){
        //equilateral triangles have 3 sides of equal lengths
        if (a == b && b == c) {
            return Type.Equilateral;
        } 
        //isosceles triangles have 2 sides of equal length
        else if (a == b || b == c || c == a) {
            return Type.Isosceles;
        }
        //scalene triangles have no sides of equal length
        return Type.Scalene;
    }
    
    public static Type getType(double a, double b, double c) throws Exception {  
        //triangles need to have positive length on all legs
        if(a<=0 || b <=0 || c <= 0){
            throw new Exception("not a valid triangle");
        }
        
        //equilateral triangles have 3 sides of equal lengths
        if (a == b && b == c) {
            return Type.Equilateral;
        } 
        //isosceles triangles have 2 sides of equal length
        else if (a == b || b == c || c == a) {
            return Type.Isosceles;
        }
        //scalene triangles have no sides of equal length
        return Type.Scalene;
    }

}
