package com.example.persistencecontext.entity.enums.converter;

import com.example.persistencecontext.entity.enums.OptionType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class OptionTypeConverter implements AttributeConverter<OptionType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(OptionType attribute) {
        return attribute.getCode();
    }

    @Override
    public OptionType convertToEntityAttribute(Integer dbData) {
        return OptionType.ofCode(dbData);
    }
}
