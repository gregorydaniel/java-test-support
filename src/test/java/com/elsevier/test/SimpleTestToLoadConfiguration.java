package com.elsevier.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.elsevier.test.annotations.Slow;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Slow // confirm the annotation is allowed here
class SimpleTestToLoadConfiguration {

	@Slow // confirm the annotation is allowed here
	@Test
	void testConfigurationLoads() {
		assertThat("test").isEqualTo("test");
	}
}
