package pro.yuchen.singleton;

import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内部类单例模式
 */
public class SingletonDemo_04 implements Serializable {

	private static class SingletonInstance {
		private static final SingletonDemo_04 instance = new SingletonDemo_04();
	}

	private SingletonDemo_04() { // 应对反射创建对象
		if (SingletonInstance.instance != null) {
			throw new RuntimeException();
		}
	}

	public static synchronized SingletonDemo_04 getInstance() {
		return SingletonInstance.instance;
	}

	private Object readResolve() throws ObjectStreamException { // 应对反序列化创建对象
		return SingletonInstance.instance;
	}

}

