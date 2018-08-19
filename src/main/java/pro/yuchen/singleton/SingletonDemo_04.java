package pro.yuchen.singleton;

/**
 * 静态内部类单例模式
 */
public class SingletonDemo_04 {

	private static class SingletonInstance {
		private static final SingletonDemo_04 instance = new SingletonDemo_04();
	}

	private SingletonDemo_04() { }

	public static synchronized SingletonDemo_04 getInstance() {
		return SingletonInstance.instance;
	}
}

