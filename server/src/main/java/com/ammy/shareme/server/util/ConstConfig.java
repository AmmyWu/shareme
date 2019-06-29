package com.ammy.shareme.server.util;

import java.util.Map;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "constconfig")
public class ConstConfig {
    Map<Integer,String> errorMessage;

}
