package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        return Math.PI * radius.multiply(radius).doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return (base.multiply(h).divide(BigDecimal.valueOf(2))).doubleValue();
    }
}
