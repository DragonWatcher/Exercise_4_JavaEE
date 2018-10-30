package 进制转换练习;

import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * 死循环输出0-15之间任意的数字，然后显示十六进制，在脑海中回想对应的2或10进制。
 * @author mht
 * @date 2018年10月30日上午10:29:52
 */
public class 十六进制练习 {

	public static void main(String[] args) throws InterruptedException {
		Random rdm = new Random();
		for (;;) {
			int out = rdm.nextInt(16);
			TimeUnit.SECONDS.sleep(2);
			System.out.println(Integer.toHexString(out).toUpperCase());
		}
	}

}
