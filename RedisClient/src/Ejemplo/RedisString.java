package Ejemplo;

import redis.clients.jedis.Jedis;

public class RedisString {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");

		jedis.set("curso", "Big Data");
		System.out.println("Guardado en Redis: " + jedis.get("curso"));

	}

}
