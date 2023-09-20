package com.example.persistencecontext.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "market__product")
public class Product extends Item{

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    private List<ProductOption> productOptions;

}
