/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tradeshift;

public class Triangle {

    int a;
    int b;
    int c;
    
    public enum Type{
        Equilateral,
        Isosceles,
        Scalene;
    };
    
    public Triangle(int a, int b, int c){      
        this.a = a;
        this.b = b;
        this.c = c;
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
    
    public static Type getType(int a, int b, int c) throws Exception {
//        if(lengths.length != 3){
//            throw new Exception("not a valid triangle");
//        }
//        
//        int a = lengths[0];
//        int b = lengths[1];
//        int c = lengths[2];
        
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
