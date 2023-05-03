package com.example.springmodulithmoduletests.first;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsualTest {

  @Autowired FirstModuleTestHelper helper;

  @Test
  void checkFullContext() {
    Assertions.assertThatCode(() -> helper.checkSomething()).doesNotThrowAnyException();
  }
}
