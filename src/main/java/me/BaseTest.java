package me;

import me.test.service.AsyncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cll on 2019/1/31.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class BaseTest {

	@Autowired
	AsyncService asyncService;

	@Test
	public void testAsync() {
		asyncService.async1();
		asyncService.async2();
	}
}
