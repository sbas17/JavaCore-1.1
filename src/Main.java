public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // ошибка возникает здесь из-за того, что при заданных t и u значение с равно 0
        // Я не знаю, какое значение лучше предоставлять в случае деления на ноль, поэтому вывожу 0, так как
        // и при использовании тернанрного оператора, и при использовании блока кода необходимо возвращать значение типа
        // Integer. Поэтому отправляю вам такой вариант решения

        calc.println.accept(c);

    }
}
