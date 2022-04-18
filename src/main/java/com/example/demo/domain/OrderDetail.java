package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class OrderDetail extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderAt;

    private String status;

    private LocalDateTime arrivalData;

    private Integer quantity;

    private BigDecimal totalPrice;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;
}
