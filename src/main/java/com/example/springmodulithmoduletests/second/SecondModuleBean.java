package com.example.springmodulithmoduletests.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class SecondModuleBean implements InitializingBean {
  private static final Logger log = LoggerFactory.getLogger(SecondModuleBean.class);

  @Autowired
  public void afterPropertiesSet() {
    log.info("Initializing second module");
  }
}
