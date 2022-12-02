package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Devide;
import com.lgs.lab.interface1.Minus;
import com.lgs.lab.interface1.Multiply;
import com.lgs.lab.interface1.Plus;

import java.text.MessageFormat;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {
    public static void plus(double a, double b) {
        double c = Plus.plus(a, b);
        System.out.println(MessageFormat.format("Cумма чисел ({0} і {1} ) дорівнює {2}", a, b, c));
    }

    public static void minus(double a, double b) {
        double c = Minus.minus(a, b);
        System.out.println(MessageFormat.format("Різниця чисел ({0} і {1} ) дорівнює {2}", a, b, c));
    }

    public static void multi(double a, double b) {
        double c = Multiply.multi(a, b);
        System.out.println(MessageFormat.format("Множення чисел ({0} і {1} ) дорівнює {2}", a, b, c));
    }

    public static void dev(double a, double b) {
        double c = Devide.dev(a, b);
        System.out.println(MessageFormat.format("Ділення чисел ({0} і {1} ) дорівнює {2}", a, b, c));
    }
}
