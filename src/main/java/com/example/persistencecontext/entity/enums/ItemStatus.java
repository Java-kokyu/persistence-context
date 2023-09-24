package com.example.persistencecontext.entity.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ItemStatus {
    SALE("판매중", 1),
    STOP_SALE("판매 중지", 2),
    WAIT_SALE("판매 대기", 3);

    private final String status;
    private final Integer code;

    ItemStatus(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public static ItemStatus ofCode(Integer dbData) {
        return Arrays.stream(ItemStatus.values())
                .filter(v -> v.getCode().equals(dbData))
                .findAny()
                .orElse(null);
    }
}
