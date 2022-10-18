package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    Vector vector = new Vector();

    @Test
    void setCoordinateX_Should_AcceptArgument_When_Receives_Argument() {
        vector.setCoordinateX(9);
        assertEquals(9,vector.getCoordinateX());
    }

    @Test
    void setCoordinateY_Should_AcceptArgument_When_Receives_Argument() {
        vector.setCoordinateY(7);
        assertEquals(7,vector.getCoordinateY());
    }

    @Test
    void setCoordinateZ_Should_AcceptArgument_When_Receives_Argument(){
        vector.setCoordinateZ(9);
        assertEquals(9,vector.getCoordinateZ());
    }

    @Test
    void getCoordinateX(){
        vector= new Vector();
        vector.setCoordinateX(9);
        assertEquals(9,vector.getCoordinateX());
    }

    @Test
    void getCoordinateY() {
        vector= new Vector();
        vector.setCoordinateY(10);
        assertEquals(10, vector.getCoordinateY() );
    }

    @Test
    void getCoordinateZ() {
        vector= new Vector();
        vector.setCoordinateZ(12);
        assertEquals(12,vector.getCoordinateZ());
    }

    @Test
    void vectorAddition() {
    }

    @Test
    void scalarVectorMultiplication() {
    }

    @Test
    void vectorVectorMultiplication() {
    }
}