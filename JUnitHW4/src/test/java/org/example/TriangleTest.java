package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {


    @Test

    void triangleValid()  {
        Triangle triangleVersatile = new Triangle();
        Assertions.assertDoesNotThrow(()->triangleVersatile.square(5,6,10)," Форма с данными параметрами должна являться треугольником");

    }

    @Test

    void triangleInvalid()  {
        Triangle triangleVersatile =new Triangle();
        Assertions.assertThrows(SideException.class,()->triangleVersatile.square(0,6,10),"Форма с данными параметрами не должна являться треугольником");
    }

}