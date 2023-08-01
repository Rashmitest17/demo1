package TestUtil;

import Base.BaseTest2;

public class TestUtil extends BaseTest2 {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public void swithToFrame() {
		driver.switchTo().frame("main-content");
	}

}
