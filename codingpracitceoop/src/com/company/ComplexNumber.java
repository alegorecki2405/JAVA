package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void add(double real,double imaginary)
    {
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber num)
    {
        add(num.getReal(), num.getImaginary());

    }
    public void subtract(double real,double imaginary)
    {
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber num)
    {
        subtract(num.getReal(), num.getImaginary());

    }

}
