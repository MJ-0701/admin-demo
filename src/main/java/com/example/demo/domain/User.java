package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import com.example.demo.domain.base.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@EntityListeners(value = {UserEntityListener.class})
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String account;

    private String password;

    private String email;

    private String phoneNumber;

    private String status;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;




}
