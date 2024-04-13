package Lesson1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Account {
    private String name;
    Map<String,Integer> moneyArr = new HashMap<>();
    public Stack<String> stack=new Stack<>();


    public Map<String,Integer> getMoney() {
        return moneyArr;
    }
    public void setMoney(Map<String,Integer> ftMoney) {
        this.moneyArr = ftMoney;
    }

    public Account() {
        this.name = name;
        stack.clear();
          }

    public void setName(String name) {
        if (name==null ||name.isBlank())throw new IllegalArgumentException("Имя должно быть заполнено");
        this.name = name;
        stack.push(name+";"+this.moneyArr);

    }
    public void undo() {
        Map<String,Integer> tmoneyArr = new HashMap<>();
        if (stack.isEmpty()){return;}//если не было изменений не нужно обрабатывать
        stack.pop();
        String txt = stack.peek();
        if(txt.indexOf("{}")>0) return;//если с деньгами не было изменений не обрабатывать

        int pos = txt.indexOf(";");//поиск изменения имени
        this.name = txt.substring(0, pos);

        moneyArr.forEach((k, v) -> {
            int i,j;
            String txtRest;
             i= txt.indexOf(k); //это позиция кода валюты
            if(i>0) {
                String tCur=txt.substring(i,i+3);
                txtRest=txt.substring(i+4,txt.length());
                j=txtRest.indexOf(",");//это позиция значения валюты
                if (j<0)j=txtRest.length()-1;
                Integer tVal=Integer.parseInt(txtRest.substring(0,j));
                //нужна проверка на изменение
                tmoneyArr.put(FtMoney.valueOf(tCur).name(),tVal);//изменение значения

            }
        });
        this.moneyArr=tmoneyArr; //присвоение нового массива
    }

    public String getName() {
        return name;
    }


    public void chgMoney(String cur,Integer val){
        if(val<0)throw new IllegalArgumentException("Количество должно быть положительным");
        if(this.moneyArr.get(cur)==null)
            this.moneyArr.put(cur, val);
        else
            this.moneyArr.replace(cur, val);
        stack.push(name + ";" + this.moneyArr);
     }
    public void addMoney(Map<String,Integer> map,String cur, Integer val){
        if (val<0)throw new IllegalArgumentException("Должно быть только положительно значение");
        map.put(cur,val);
    }
    @Override
    public String toString() {
        return name+" - " +
                " курсы ='" + moneyArr.toString() + '\'' +
                '}'
               ;
    }
    public String StoString() {
        return name+" - " +" stack {"+this.stack+"}"
                ;
    }
}

