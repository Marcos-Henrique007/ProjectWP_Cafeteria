package projectzero.projectwp_test.filter;

import projectzero.projectwp_test.filter.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                .addPathPatterns("/**") // protege todas as rotas
                .excludePathPatterns("/login",
                        "/css/**",
                        "/js/**",
                        "/images/**"
                ); // libera login e css
    }
}