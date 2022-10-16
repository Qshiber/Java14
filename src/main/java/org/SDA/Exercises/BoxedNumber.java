package org.SDA.Exercises;

/*
Zadanie 2: Liczba w opakowaniu
Zaimplementuj klasę, która zawiera liczbę, którą następnie można dowolnie przeliczać w sposób funkcyjny. Np:
System.out.println(new BoxedNumber(5).add(5).mul(2).mul(5).div(10)); // result: 10
Zaimplementuj dodawanie, odejmowanie, mnożenie, dzielenie, potęgowanie oraz możliwość podania własnej funkcji lambda
 */

public class BoxedNumber implements CalculateFunction {

    private final Double a;

    public Double getNumber() {
        return a;
    }

    public BoxedNumber(Double number) {
        this.a = number;
    }

    @Override
    public BoxedNumber add(Double num) {
        return new BoxedNumber(a + num);
    }

    @Override
    public BoxedNumber sub(Double num) {
        return new BoxedNumber(a - num);
    }

    @Override
    public BoxedNumber mul(Double num) {
        return new BoxedNumber(a * num);
    }

    @Override
    public BoxedNumber div(Double num) {
        return new BoxedNumber(a / num);
    }

    @Override
    public String toString() {
        return a.toString();
    }

}
