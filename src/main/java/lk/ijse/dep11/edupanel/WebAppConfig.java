package lk.ijse.dep11.edupanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfig {

//    @Bean
//    public CommonsMultipartResolver multipartResolver(){        //parana hadaya
//        return new CommonsMultipartResolver();
//    }

    /* new */
    @Bean
    public StandardServletMultipartResolver multipartResolver(){            // Springboot wala one naa. spring walata me bean eka set krnn one
        return new StandardServletMultipartResolver();
    }
}
