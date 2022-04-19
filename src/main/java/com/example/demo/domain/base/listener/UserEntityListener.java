package com.example.demo.domain.base.listener;

import com.example.demo.domain.User;
import com.example.demo.domain.UserHistory;
import com.example.demo.global.support.BeanUtils;
import com.example.demo.repository.UserHistoryRepository;
import lombok.RequiredArgsConstructor;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;



public class UserEntityListener {
    //    private final UserHistoryRepository userHistoryRepository;

    @PreUpdate
    @PrePersist
    public void prePersistAndUpdate(Object o){ // User 엔티티가 생성,수정 될때마다 유저 히스토리에 기록.
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);
        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }

}
