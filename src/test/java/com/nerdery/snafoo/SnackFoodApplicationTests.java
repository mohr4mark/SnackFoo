package com.nerdery.snafoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SnackFoodApplication.class)
@WebAppConfiguration
public class SnackFoodApplicationTests {

	@Test
	public void contextLoads() {
	}

}
