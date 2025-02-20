package br.com.project.comic.configuration;

import java.net.URI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Slf4j
@Profile("local")
@Configuration
public class DynamoDbConfig {
  @Value("${cloud.aws.dynamodb.url}")
  private String dynamoDbUrl;

  @Bean
  @Primary
  @Order(Ordered.HIGHEST_PRECEDENCE)
  public DynamoDbClient dynamoDbClient() {
    log.info("Config AWS DynamoDB - URL: {}", dynamoDbUrl);
    return DynamoDbClient.builder()
        .region(Region.US_WEST_1)
        .endpointOverride(URI.create(dynamoDbUrl))
        .build();
  }

  @Bean
  public DynamoDbEnhancedClient dynamoDbEnhancedClient(final DynamoDbClient dynamoDbClient) {
    return DynamoDbEnhancedClient.builder().dynamoDbClient(dynamoDbClient).build();
  }
}
