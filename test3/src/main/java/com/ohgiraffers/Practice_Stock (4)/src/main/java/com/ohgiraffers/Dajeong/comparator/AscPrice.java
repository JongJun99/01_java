package com.ohgiraffers.Dajeong.comparator;

import com.ohgiraffers.Dajeong.model.dto.stockDTO;
import java.util.Comparator;

public class AscPrice implements Comparator<stockDTO> {
    @Override
    public int compare(stockDTO o1, stockDTO o2) {
        return (o1.getPrice() > o2.getPrice())? 1 : -1;
    }
}
