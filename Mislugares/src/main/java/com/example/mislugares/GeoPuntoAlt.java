package com.example.mislugares;

public class GeoPuntoAlt extends GeoPunto {

    private double altura;

    static public GeoPuntoAlt SIN_POSICION = new GeoPuntoAlt(0.0,0.0, 0.0);

    public GeoPuntoAlt(double longitud, double latitud, double altura){
        super(longitud, latitud);

        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "GeoPuntoAlt{" + super.toString() +
                ", altura:" + altura + '}';
    }

    public double distancia(GeoPuntoAlt punto) {
        double distanciaAnt = super.distancia(punto);
        double difAlturas = this.altura - punto.getAltura();

        return (Math.sqrt(distanciaAnt*distanciaAnt) + (difAlturas * difAlturas));
    }
}
