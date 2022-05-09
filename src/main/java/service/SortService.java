package service;

import logic.Sort;

import java.util.List;

public class SortService {


    //DI 방법 사용 1. 필드에 주입하고 싶은 객체를 넣는다.
    private final Sort<String> sort;

    // 생성자 주입방법으로 주입방법을 사용하기

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
