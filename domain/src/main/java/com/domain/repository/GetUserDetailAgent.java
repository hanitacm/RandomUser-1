package com.domain.repository;

import com.domain.model.UserModel;
import rx.Observable;

public interface GetUserDetailAgent {
  Observable<UserModel> getUserDetail(String name, String surname, String email);
}
