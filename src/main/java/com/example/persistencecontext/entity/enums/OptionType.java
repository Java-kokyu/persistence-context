package com.example.persistencecontext.entity.enums;

import lombok.Getter;

import javax.swing.text.html.Option;
import java.util.Arrays;

@Getter
public enum OptionType {
    ADDITIONAL_PRODUCT("추가 상품", 1),
    COLOR("색깔", 2),
    SIZE("사이즈", 3);

    private final String optionType;
    private final Integer code;

    OptionType(String optionType, Integer code) {
        this.optionType = optionType;
        this.code = code;
    }

    public static OptionType ofCode(Integer dbData) {
        return Arrays.stream(OptionType.values())
                .filter(v -> v.getCode().equals(dbData))
                .findAny()
                .orElse(null);
    }
}
