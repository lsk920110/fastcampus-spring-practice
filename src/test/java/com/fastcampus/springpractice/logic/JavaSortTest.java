package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여줌")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){

         JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1,2,3,4,5),actual);

        System.out.println("미아러나ㅣㅇ허ㅏㅣㄴ");
    }

}