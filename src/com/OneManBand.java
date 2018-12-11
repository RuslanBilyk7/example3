package com;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer {
    public OneManBand() {
    }

//    @Override
//    public void perform() {
//for (Instrument1  instrument1:instruments){
//    instrument1.play();
////    Когда выступает человек-оркестр (OneManBand), звук каждого инструмента выводится методом perform() в процессе выполнения ите-
////раций по коллекции инструментов.
//    //Но предположим, что мы также хотим видеть, какой инструмент соответствует каждому извлекаемому звуку.
//}


    @Override
    public void perform() {
        for (String key:instruments.keySet()){
            System.out.println(key+ " : ");
            Instrument1 instrument1=instruments.get(key);
            instrument1.play();
        }
    }


//    private Collection<Instrument1> instruments;
//
//    public void setInstruments(Collection<Instrument1> instruments) {
//        this.instruments = instruments;      //внедрение коллекции инструментов
//    }


    //В новой версии класса OneManBand свойство instruments имеет тип отображения java.util.Map , каждый член которого имеет ключ типа
    //String и значение типа Instrument
    private Map<String, Instrument1> instruments;
    public  void setInstruments(Map<String,Instrument1> instruments){
        this.instruments=instruments;
    }
}
