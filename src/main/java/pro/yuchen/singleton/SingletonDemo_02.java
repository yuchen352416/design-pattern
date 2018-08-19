package pro.yuchen.singleton;

/**
 * 懒汉式单例模式
 */
public class SingletonDemo_02 {

	private static SingletonDemo_02 instance = null;

	private SingletonDemo_02() {
		if(null != instance) {
			throw new RuntimeException(); // 防反射调用
		}
	}

	public static synchronized SingletonDemo_02 getInstance() {
		if (null == instance) {
			instance = new SingletonDemo_02();
		}
		return instance;
	}
}

