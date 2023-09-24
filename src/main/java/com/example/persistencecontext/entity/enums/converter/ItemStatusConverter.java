package com.example.persistencecontext.entity.enums.converter;

import com.example.persistencecontext.entity.enums.ItemStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ItemStatusConverter implements AttributeConverter<ItemStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ItemStatus attribute) {
        return attribute.getCode();
    }

    @Override
    public ItemStatus convertToEntityAttribute(Integer dbData) {
        return ItemStatus.ofCode(dbData);
    }
}
