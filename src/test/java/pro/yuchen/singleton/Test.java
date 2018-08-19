package pro.yuchen.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

public class Test {

	@org.junit.Test
	public void test() {
		SingletonDemo_05.INSTANCE.operation();
	}

	@org.junit.Test
	public void test_reflection() { // 通过反射, 破单例
		try {
			Class<SingletonDemo_04> clazz = (Class<SingletonDemo_04>) Class.forName("pro.yuchen.singleton.SingletonDemo_04");

			Constructor<SingletonDemo_04> constructor = clazz.getDeclaredConstructor(null);
			constructor.setAccessible(true); // 忽略访问权限
			SingletonDemo_04 s = constructor.newInstance();
			System.out.println(s);
			System.out.println(SingletonDemo_04.getInstance());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@org.junit.Test
	public void test_serializable() { // 测试序列化, 破单例
		byte[] bytes = null;
		try {
			// 将对象序列化到内存中
			SingletonDemo_04 s = SingletonDemo_04.getInstance();
			System.out.println(s);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(s);
			bytes = bos.toByteArray();
			oos.close();
			bos.close();

			System.out.println(bytes);

			// 将内存中的序列化数组, 反序列化为对象
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bis);
			SingletonDemo_04 s1 = (SingletonDemo_04) ois.readObject();
			System.out.println(s1);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@org.junit.Test
	public void test_much_thread() throws InterruptedException {
		long start = System.currentTimeMillis();
		int max = 1000;
		final CountDownLatch count = new CountDownLatch(max);
		for (int i = 0; i < max; i++) {
			new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i < 10000; i++) {
//						Object o = SingletonDemo_01.getInstance(); // 287
//						Object o = SingletonDemo_02.getInstance(); // 199
//						Object o = SingletonDemo_03.getInstance(); // 254
//						Object o = SingletonDemo_04.getInstance(); // 519
						Object o = SingletonDemo_05.INSTANCE; // 274
					}
					count.countDown();
				}
			}).start();
		}
		count.await();
		long end = System.currentTimeMillis();
		System.out.println("总耗时: " + (end - start));
	}
}
