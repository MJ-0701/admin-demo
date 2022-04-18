package com.example.demo.domain;

import com.example.demo.domain.listener.Auditable;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity implements Auditable {

    @CreatedBy
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;


}
