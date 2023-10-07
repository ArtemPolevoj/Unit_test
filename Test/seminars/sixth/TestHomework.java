package seminars.sixth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sixth.Homework;
import sixth.HwList;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestHomework {
    private Homework homework;
    private final HwList hwListMock1 = mock(HwList.class);
    private final HwList hwListMock2 = mock(HwList.class);

    @BeforeEach
    void setUp() {
        homework = new Homework();
    }

    @Test
    void checkAverage() {
        HwList hwList = new HwList();
        ArrayList<Integer> temp = hwList.getRandomInteger(5, 1, 11);
        double average = temp.stream()
                .mapToDouble(val -> val)
                .average()
                .orElse(0.0);

        assertEquals(homework.getAverage(temp), average);
    }

    @Test
    void checkList1MoreList2() {
        when(hwListMock1.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        when(hwListMock2.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        ArrayList<Integer> list1 = hwListMock1.getRandomInteger(1, 1, 1);
        ArrayList<Integer> list2 = hwListMock2.getRandomInteger(1, 1, 1);
        String test = "Первый список имеет большее среднее значение";

        assertEquals(homework.equalsAverage(list1, list2), test);
    }

    @Test
    void checkList1LessList2() {
        when(hwListMock1.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        when(hwListMock2.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(7, 8, 9, 10)));
        ArrayList<Integer> list1 = hwListMock1.getRandomInteger(1, 1, 1);
        ArrayList<Integer> list2 = hwListMock2.getRandomInteger(1, 1, 1);
        String test = "Второй список имеет большее среднее значение";

        assertEquals(homework.equalsAverage(list1, list2), test);
    }

    @Test
    void checkList1EqualsList2() {
        when(hwListMock1.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        when(hwListMock2.getRandomInteger(1, 1, 1))
                .thenReturn(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        ArrayList<Integer> list1 = hwListMock1.getRandomInteger(1, 1, 1);
        ArrayList<Integer> list2 = hwListMock2.getRandomInteger(1, 1, 1);
        String test = "Средние значения равны";

        assertEquals(homework.equalsAverage(list1, list2), test);
    }
}
