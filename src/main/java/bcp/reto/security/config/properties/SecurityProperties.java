package bcp.reto.security.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@Validated
@Configuration
@ConfigurationProperties("app.security")
public class SecurityProperties {

    @NotNull
    private String clientId;
    @NotNull
    private String clientSecret;
    @NotNull
    private String grantType;
    @NotNull
    private String scopes;
    @NotNull
    private Integer accessTokenTime;

}
