package sixth;

import java.util.ArrayList;

public class Homework {
    public String equalsAverage(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        String result;
        double averageList1 = getAverage(list1);
        double averageList12 = getAverage(list2);
        if (averageList1 > averageList12) {
            result = "Первый список имеет большее среднее значение";
        } else if (averageList1 < averageList12) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        return result;
    }

    public double getAverage(ArrayList<Integer> arrayList) {
        double temp = 0;
        for (Integer integer : arrayList) {
            temp += integer;
        }
        return temp / arrayList.size();
    }
}
