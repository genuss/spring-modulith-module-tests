package com.example.springmodulithmoduletests.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
class FirstModuleBean implements InitializingBean {
  private static final Logger log = LoggerFactory.getLogger(FirstModuleBean.class);

  @Override
  public void afterPropertiesSet() {
    log.info("Initializing first module");
  }
}
