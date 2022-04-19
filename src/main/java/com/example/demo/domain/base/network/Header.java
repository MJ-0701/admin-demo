package com.example.demo.domain.base.network;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonInclude() // 어떠한 값들만 포함시킬경우
public class Header<T> {

    // api 통신시간
    //@JsonProperty("transaction_time") // JsonProperty를 통해 스네이크 케이스로 변경해준다 (설정을 안해주면 기본 카멜케이스) -> 프론트에 데이터 전달 목적. yml spring:jackson:property-naming-strategy: SNAKE_CASE 로 설정 가능
    private LocalDateTime transactionTime;

    // api 응답 코드
    private String resultCode;

    // api 부가설명
    private String description;

    private T data;

    // OK
    public static <T> Header<T> OK(){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .description("OK")
                .build();
    }

    // DATA OK
    public static <T> Header<T> OK(T data){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .description("OK")
                .data(data)
                .build();
    }

    // ERROR
    public static <T> Header<T> ERROR(String description){
        return (Header<T>)Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ERROR")
                .description(description)
                .build();
    }
}
