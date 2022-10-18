package org.example;

import java.util.Objects;

public class Vector {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;

    public Vector() {
    }

    public Vector(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public Vector vectorAddition(Vector vectorForAdd) {
        Vector vectorResult = new Vector();
        vectorResult.setCoordinateX(this.coordinateX + vectorForAdd.getCoordinateX());
        vectorResult.setCoordinateY(this.coordinateY + vectorForAdd.getCoordinateY());
        vectorResult.setCoordinateZ(this.coordinateZ + vectorForAdd.getCoordinateZ());
        return vectorResult;
    }

    public double scalarVectorMultiplication(Vector vectorForMultiplication) {
        double result = vectorForMultiplication.getCoordinateX() * this.coordinateX
                + vectorForMultiplication.getCoordinateY() * this.coordinateY
                + vectorForMultiplication.getCoordinateZ() * this.coordinateZ;
        return result;
    }

    public double vectorVectorMultiplication(Vector vectorForMultiplication) {
        Vector vectorResult = new Vector();
        double coordinateX = (this.coordinateY*vectorForMultiplication.coordinateZ)
        -(this.coordinateZ*vectorForMultiplication.coordinateY);
        double coordinateY = (this.coordinateZ*vectorForMultiplication.coordinateX)
        -(this.coordinateX*vectorForMultiplication.coordinateZ);
        double coordinateZ =(this.coordinateX*vectorForMultiplication.coordinateY)
                -(this.coordinateY*vectorForMultiplication.coordinateX);
        return coordinateX-coordinateY-coordinateZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vector vector = (Vector) o;
        return Double.compare(vector.coordinateX, coordinateX) == 0
                && Double.compare(vector.coordinateY, coordinateY) == 0
                && Double.compare(vector.coordinateZ, coordinateZ) == 0;
    }

    @Override
    public String toString() {
        return "coordinateX " + coordinateX + " coordinateY " + coordinateY + " coordinateZ " + coordinateZ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
