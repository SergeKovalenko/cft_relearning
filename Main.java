package Lesson1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Map<String,Integer> moneyArr1 = new HashMap<>();
        Map<String,Integer> moneyArr2 = new HashMap<>();

        /*acc1.addMoney(moneyArr1,FtMoney.EUR.name(),111);
        acc1.addMoney(moneyArr1,FtMoney.USD.name(),222);
        acc1.addMoney(moneyArr1,FtMoney.RUB.name(),3);
        acc1.addMoney(moneyArr1,FtMoney.KAZ.name(),22);*/

        acc1.setName("Пользователь1");
        acc1.setMoney(moneyArr1);
        acc1.setName("Пользователь1_1");

        acc1.chgMoney(FtMoney.EUR.name(),111);
        acc1.chgMoney(FtMoney.USD.name(),222);
        acc1.chgMoney(FtMoney.RUB.name(),3);
        acc1.chgMoney(FtMoney.EUR.name(),90);
        System.out.println("befor         информация по счету "+acc1.toString());
        System.out.println("befor    Стэк информация по счету "+acc1.StoString());
        acc1.undo();
        acc1.undo();
        acc1.undo();
        acc1.setName("Пользователь1_2");
        acc1.undo();
        System.out.println("after          информация по счету "+acc1.toString());
        System.out.println("after     Стэк информация по счету "+acc1.StoString());

        acc2.setName("Пользователь2");
        acc2.addMoney(moneyArr2,FtMoney.EUR.name(),99);
        acc2.addMoney(moneyArr2,FtMoney.USD.name(),77);
        acc2.setMoney(moneyArr2);


        //acc2.chgMoney(FtMoney.USD.name(),88);
       /* System.out.println("Вывод счета "+acc2.getName());
        System.out.println("Расширенная информация по счету "+acc2.toString());
        //acc2.chgMoney(FtMoney.USD.name(),-88); эксепшен
        acc2.chgMoney(FtMoney.USD.name(),88);
        System.out.println("Расширенная информация по счету "+acc2.toString());
        acc2.chgMoney(FtMoney.KAZ.name(),90);
        System.out.println("Расширенная информация по счету "+acc2.toString());*/
    }
}
