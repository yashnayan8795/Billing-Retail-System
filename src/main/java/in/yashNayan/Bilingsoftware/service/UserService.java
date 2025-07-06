package in.bushansirgur.billingsoftware.service;

import in.yashNayan.Bilingsoftware.io.UserRequest;
import in.yashNayan.Bilingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
