
public class Map {
		public static void main(String[] args) throws Exception {

			JwMap2 map = new JwMap2(4); // コンストラクタ

			System.out.println(map.getAvailableSize()); // 5と表示

			map.put("key1", "value1");
			map.put("key2", "value2");
			map.put("key3", "value3");
			map.put("key4", "value4");

			System.out.println(map.get("key1")); // value1と表示
			System.out.println(map.get("key2")); // value2と表示
			System.out.println(map.get("key3")); // value3と表示
			System.out.println(map.get("key4")); // value4と表示


			map.put("key2", "value22");

			System.out.println(map.getAvailableSize()); // 1と表示
			System.out.println(map.get("key2")); // value22と表示

			map.put("key5", "value5");

			System.out.println(map.getAvailableSize()); // 0と表示
			System.out.println(map.getMaxSize()); // 5と表示

			map.put("key6", "value6");

			System.out.println(map.get("key6"));

	}

}
