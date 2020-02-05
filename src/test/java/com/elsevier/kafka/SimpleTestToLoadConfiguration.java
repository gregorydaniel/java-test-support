package com.elsevier.kafka;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfiguration.class)
class SimpleTestToLoadConfiguration {

	@Test
	void testConfigurationLoads() {
		assertThat("test").isEqualTo("test");
	}
}
