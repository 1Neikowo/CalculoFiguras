package org.example;

import com.sun.jdi.IncompatibleThreadStateException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void perimetroCuadrado() {
        assertEquals(8, Main.perimetroCuadrado(2));
        assertNotEquals(8, Main.perimetroCuadrado(3));
    }

    @org.junit.jupiter.api.Test
    void areaCuadrado() {
        assertEquals(4, Main.areaCuadrado(2));
        assertNotEquals(4, Main.areaCuadrado(3));
    }

    @org.junit.jupiter.api.Test
    void perimetroRectangulo() {
        assertEquals(8, Main.perimetroRectangulo(2, 2));
        assertNotEquals(4, Main.perimetroRectangulo(3, 3));
    }

    @org.junit.jupiter.api.Test
    void areaRectangulo() {
        assertEquals(4, Main.areaRectangulo(2, 2));
        assertNotEquals(4, Main.areaRectangulo(3, 3));
    }

    @org.junit.jupiter.api.Test
    void circunferenciaCirculo() {
        assertEquals(Math.PI*2, Main.circunferenciaCirculo(1));
        assertNotEquals(Math.PI, Main.circunferenciaCirculo(3));
    }

    @org.junit.jupiter.api.Test
    void areaCirculo() {
        assertEquals(Math.PI, Main.areaCirculo(1));
        assertNotEquals(Math.PI*2, Main.areaCirculo(3));
    }

    @org.junit.jupiter.api.Test
    void areaEsfera() {
        assertEquals(Math.PI*4, Main.areaEsfera(1));
        assertNotEquals(Math.PI*2, Main.areaEsfera(3));
    }

    @org.junit.jupiter.api.Test
    void volumenEsfera() {
        assertEquals((double) 4 /3*Math.PI, Main.volumenEsfera(1));
        assertNotEquals(Math.PI, Main.volumenEsfera(2));
    }

    @org.junit.jupiter.api.Test
    void areaCubo() {
        assertEquals(24, Main.areaCubo(2));
        assertNotEquals(30, Main.areaCubo(3));
    }

    @org.junit.jupiter.api.Test
    void volumenCubo() {
        assertEquals(8, Main.volumenCubo(2));
        assertNotEquals(10, Main.volumenCubo(3));
    }

    @org.junit.jupiter.api.Test
    void areaCono() {
        assertEquals(24*Math.PI, Main.areaCono(3,4));
        assertNotEquals(30, Main.areaCono(3,3));
    }

    @org.junit.jupiter.api.Test
    void volumenCono() {
        assertEquals(12*Math.PI, Main.volumenCono(3,4));
        assertNotEquals(10, Main.volumenCono(3,3));
    }
}