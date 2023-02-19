package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.datatransfer.SystemFlavorMap;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonService {
    //객체 딱 1개 생성
    private static final SingletonService instance = new SingletonService();
    //객체 필요하면 이 static 메서드 통해서만 조회 가능하게 함
    public static SingletonService getInstance() {
        return instance;
    }
    //생성자를 private으로 선언해서 외부에서 new 못하게 막음
    private SingletonService() {

    }
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
