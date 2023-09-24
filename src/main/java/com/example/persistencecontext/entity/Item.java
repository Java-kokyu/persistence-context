package com.example.persistencecontext.entity;

import com.example.persistencecontext.entity.enums.ItemStatus;
import com.example.persistencecontext.entity.enums.converter.ItemStatusConverter;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "core__item")
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = ItemStatusConverter.class)
    @Column(name = "e_status")
    private ItemStatus itemStatus;

    private String name;

    private Double price;
}
