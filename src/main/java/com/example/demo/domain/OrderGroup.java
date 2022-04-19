package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
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
public class OrderGroup extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String orderType; // 주문 형태

    private String revAddress;

    private String revName;

    private String paymentType; // 결제 유형(카드 현금 등등 )

    private BigDecimal totalPrice;

    private Integer totalQuantity;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;
}
