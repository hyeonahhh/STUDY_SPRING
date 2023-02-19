package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        basePackages = "hello.core",//이 위치에서부터 스캔 시작하라는 뜻
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //예전에 수동으로 등록해놨던거 자동으로 등록되지 않도록 빼줌
        //일반적으로 쓰지 않지만 예전 코드 지우지 않기 위해 선택한 방법
) //@component 어노테이션 붙은 클래스를 스캔해서 스프링 빈으로 등록해줌
public class AutoAppConfig {
}
