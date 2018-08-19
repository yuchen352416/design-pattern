package pro.yuchen.singleton;

/**
 * 饿汉式单例模式
 */
public class SingletonDemo_01 {

	private static SingletonDemo_01 instance = new SingletonDemo_01();

	private SingletonDemo_01() {
		if(null != instance) {
			throw new RuntimeException(); // 防反射调用
		}
	}

	public static SingletonDemo_01 getInstance() {
		return instance;
	}
}

