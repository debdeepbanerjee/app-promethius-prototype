package com.aexp.observability.monitoring.apppromethiusprototype;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
@RefreshScope
public class DbProperties {

  public Map<String, String> dbProps;

  public Map<String, String> getDbProps() {
    return dbProps;
  }

  public void setDbProps(Map<String, String> dbProps) {
    this.dbProps = dbProps;
  }

  public String getDbPropData(String key) {
    return dbProps.get(key);
  }
}
