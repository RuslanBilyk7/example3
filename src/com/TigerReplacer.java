package com;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object target, Method method, Object[] args) {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}

//Класс TigerReplacer реализует интерфейс MethodReplacer, требую-
//щий реализации единственного метода reimplement(). Этот метод
//принимает три аргумента: объект, в котором будет производиться
//замещение метода, метод, подлежащий замещению, и массив аргу-
//ментов, принимаемых методом. В нашем случае аргументы отсут-
//ствуют, но их можно передать при необходимости.
//Тело метода reimplement() фактически становится новой реализа-
//цией метода getContents() черного ящика. В нашем примере един-
//ственное, что требуется, – это вернуть строку «A ferocious tiger»
//(свирепый тигр).