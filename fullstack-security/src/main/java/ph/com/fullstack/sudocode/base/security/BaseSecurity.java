package ph.com.fullstack.sudocode.base.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BaseSecurity extends WebSecurityConfigurerAdapter {

    private static final Logger LOGGER = LogManager.getLogger(BaseSecurity.class);

    public BaseSecurity() {
    }

    public BaseSecurity(boolean disableDefaults) {
        super(disableDefaults);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        LOGGER.info("configure(HttpSecurity http) : START");

        http.authorizeRequests()
                .requestMatchers(EndpointRequest.to("health")).permitAll()
                .requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("ACTUATOR")
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .antMatchers("/user").permitAll().and().httpBasic();

    }
}
