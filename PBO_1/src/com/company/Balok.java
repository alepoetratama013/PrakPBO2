package com.company;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return super.Luas()*tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2*(super.Luas() + super.Luas(super.getPanjang(), tinggi) + super.getLebar()*tinggi);
    }

}