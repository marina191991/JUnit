package org.example;



public class Triangle {



    public void square(double a, double b, double c) throws SideException {


        if (formula(a, b, c)) {
            double p = ((a + b + c) / 2);
            double s1 = p * (p - a) * (p - b) * (p - c);
            Math.sqrt(s1);}
        else
          throw new SideException("Введите верные параметры для рассчета");
    }

    private boolean formula(double a, double b, double c) {

        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a) && (a > 0) && (b > 0) && (c > 0);

    }
}



