package me.test.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by cll on 2019/1/31.
 */
@Component
public class AsyncService {

	public void async1() {
		System.out.println("1: " + Thread.currentThread().getName());
		this.async2();
	}

	@Async
	public void async2() {
		System.out.println("2: " + Thread.currentThread().getName());
	}

}
