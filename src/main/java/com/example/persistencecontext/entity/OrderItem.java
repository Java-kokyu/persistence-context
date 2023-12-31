package com.example.persistencecontext.entity;

import com.example.persistencecontext.entity.enums.OrderStatus;
import com.example.persistencecontext.entity.enums.converter.OrderStatusConverter;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "order__order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = OrderStatusConverter.class)
    @Column(name = "e_status")
    private OrderStatus orderStatus;

    private Integer count;

    private Double price;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonManagedReference(value = "order_pk")
    private Order order;
}
