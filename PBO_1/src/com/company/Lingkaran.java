package com.company;

public class Lingkaran implements MenghitungBidang{
    double jarijari;

    public double getJarijari() {
        return jarijari;
    }

    public double getPhi() {
        return phi;
    }

    double phi=3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double Luas() {
        return phi*jarijari*jarijari;
    }

    @Override
    public double Keliling() {
        return phi*(2*jarijari);
    }

}