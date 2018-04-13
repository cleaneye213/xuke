package com.xuke.fanxi.demo;

import com.xuke.set.demo.Person;

public interface TestFanxiInter2<T extends Person> {

	void print(T t);
}
