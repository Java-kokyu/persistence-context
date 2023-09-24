package com.example.persistencecontext.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonManagedReference(value = "store_fk")
    private Store store;

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    private List<ProductOption> productOptions;

}
