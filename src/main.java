


//    Учитывая целое число в качестве входных данных, можете ли вы округлить его до следующего
//    (то есть «большего») числа, кратного 5?
class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
while(number%5!=0){
    number +=1;
}
        return number;
    }
}

//Принтер должен использовать цвета, которые для простоты названы буквами из a to m.
//Цвета, используемые принтером, записываются в управляющую строку.
// Например, "хорошая" управляющая строка будет aaabbbbhaijjjm
//Иногда возникают проблемы: выдается "плохая" управляющая строка, например, aaaxbbbbyyhwawiwjjjwwmс буквами не из a to m.
//Вы должны написать функцию, которая по заданной строке будет возвращать частоту ошибок принтера в виде строки ,
// представляющей рациональное число, числитель которого — количество ошибок, а знаменатель — длину управляющей строки.
// Не уменьшайте эту дробь до более простого выражения.
class Printer {

    public static String printerError(String s) {
        String t = "nopqrstuvwxyz";
        int a = 0;
        int b = 0;
        for (int i=0;i<s.length();i++)
        {a++;
            for (int j=0;j<t.length();j++){
                if (s.charAt(i)==t.charAt(j))b++;
            }
        }
        return (b+"/"+a);
    }
}


public class main {
    public static void main(String[] args) {
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(23));
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(5));
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(-7));

        System.out.println(Printer.printerError("aaabbbbhaijjjm"));
        System.out.println(Printer.printerError("aaaxbbbbyyhwawiwjjjwwm"));

    }
}
