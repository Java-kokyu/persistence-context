package com.example.persistencecontext.entity;

import com.example.persistencecontext.entity.enums.OptionType;
import com.example.persistencecontext.entity.enums.converter.OptionTypeConverter;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "order__order_item_product_option")
public class OrderItemProductOption{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = OptionTypeConverter.class)
    @Column(name ="e_option_type")
    private OptionType optionType;

    private String name;

    private Double price;
}
