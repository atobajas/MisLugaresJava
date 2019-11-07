package com.example.mislugares;

public class GeoPunto {

    private double longitud, latitud;
    private int grado1, grado2;

    static public GeoPunto SIN_POSICION = new GeoPunto(0.0,0.0);

    public GeoPunto(double longitud, double latitud) {
        this.longitud= longitud;
        this.latitud= latitud;
    }

    public GeoPunto(double longitud, double latitud, int grado1, int grado2) {
        this(longitud, latitud);

        this.grado1 = grado1;
        this.grado2 = grado2;
    }

    public int getGrado1() {
        return grado1;
    }

    public void setGrado1(int grado1) {
        this.grado1 = grado1;
    }

    public int getGrado2() {
        return grado2;
    }

    public void setGrado2(int grado2) {
        this.grado2 = grado2;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public String toString() {
        return "longitud:" + longitud + ", latitud:"+ latitud;
    }

    public double distancia(GeoPunto punto) {
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}
