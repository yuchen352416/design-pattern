package pro.yuchen.singleton;

/**
 * 双重检查琐式单例模式
 */
public class SingletonDemo_03 {

	private static SingletonDemo_03 instance = null;

	private SingletonDemo_03() {
		if(null != instance) {
			throw new RuntimeException(); // 防反射调用
		}
	}

	public static SingletonDemo_03 getInstance() {
		if (null == instance) {
			SingletonDemo_03 s;
			synchronized (SingletonDemo_03.class) {
				s = instance;
				if (s == null) {
					synchronized (SingletonDemo_03.class) {
						if (s == null) {
							s = new SingletonDemo_03();
						}
					}
					instance = s;
				}
			}
		}
		return instance;
	}
}

