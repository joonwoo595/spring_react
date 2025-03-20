package project.gittest.semiprojectv2.Service;

import project.gittest.semiprojectv2.domain.User;

public interface UserService {

    User newUser(User user);

    User loginUser(User user);

}