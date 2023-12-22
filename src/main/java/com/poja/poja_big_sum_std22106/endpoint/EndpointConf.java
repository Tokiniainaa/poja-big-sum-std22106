package com.poja.poja_big_sum_std22106.endpoint;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointConf {
  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper().configure(FAIL_ON_UNKNOWN_PROPERTIES, false).findAndRegisterModules();
  }
}
