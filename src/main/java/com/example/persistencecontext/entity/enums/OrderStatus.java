package com.example.persistencecontext.entity.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum OrderStatus {
    CANCEL("주문취소", 0),
    COMPLETE("주문완료", 1),
    WAIT_DELIVERY("배송대기", 2),
    DELIVERING("배송중", 3),
    DELIVERED("배송완료", 4);

    private final String status;
    private final Integer code;

    OrderStatus(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public static OrderStatus ofCode(Integer dbData) {
        return Arrays.stream(OrderStatus.values())
                .filter(v -> v.getCode().equals(dbData))
                .findAny()
                .orElse(null);
    }
}
