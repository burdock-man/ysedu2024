package a1206.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // 존재하는 ID로 검색
        Optional<User> userOptional1 = userRepository.findById(2L);
        userOptional1.ifPresentOrElse(
            user -> System.out.println("찾는 거시기 : " + user),
            () -> System.out.println("찾는 거시기가 없습니다.")
        ); // 출력 : 찾는 거시기 : User{id=2, name="Bob"}

        // 기본값 제공
        User defaultUser = userOptional2.orElse(new User(0L, "Default User"));
        System.out.println("기본 사용자: " + defaultUser);
        // 출력: 기본 사용자: User{id=0, name='Default User'}
    }
}
//
