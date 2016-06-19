package Ejemplo;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisKeys {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		List<String> list = new ArrayList<String>();
		
		list.addAll(jedis.keys("*"));

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
