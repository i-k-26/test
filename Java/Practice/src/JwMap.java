import java.util.HashMap;
import java.util.Map;

public class JwMap {

	private Map<String, String> map;
	private int Emptymemory;
	private int Maxmemory;
	private String data;
	//	private int size;

	//
	//	public JwMap(String key, String value) {
	//		this.key = key;
	//		this.value =value;
	//	}

	// サイズを指定して生成する
	public JwMap(int size) {
		//		JwMap box = new JwMap(this,key , this.value);
		//		List<JwMap> map = new ArrayList<JwMap>(size);
		//		map,add(box);
		this.Maxmemory = size;
		Map<String, String> map = new HashMap<>(size);
		this.map = map;
	}

	// データ追加する
	public void put(String key, String value) throws Exception {

		//		try {
		if (Maxmemory >= this.map.size()) {
			//				map.remove(key);
			this.map.put(key, value);
		} else {
			throw new Exception("上限を超えています");
		}
		//		}catch(Throwable t){
		//			System.out.println("上限を超えています");
		//		}
	}

	// データを取得する
	public String get(String k) {
		this.data = this.map.get(k);
		return data;
	}

	// add可能な数を返す
	public int getAvailableSize() {
		this.Emptymemory = Maxmemory - (this.map.size());
		return Emptymemory;
	}

	// mapの大きさを返す
	public int getMaxSize() {
		;
		return Maxmemory;
	}
}

//	public void Map() {
//
//		System.out.println("登録する「名前」を入力してください");
//
//		@SuppressWarnings("resource")
//		Scanner sc1 = new Scanner(System.in);
//		String ent1 = sc1.nextLine();
//
//		System.out.println("登録する「ID」を入力してください");
//
//		@SuppressWarnings("resource")
//		Scanner sc2 = new Scanner(System.in);
//		String ent2 = sc2.nextLine();
//
//		Map<String, String> map;
//
//		map.put(ent1, ent2);
//
//		System.out.println("登録した「名前」を検索します");
//		System.out.println("登録した「名前」を入力してください");
//
//		@SuppressWarnings("resource")
//		Scanner sc3 = new Scanner(System.in);
//		String ent3 = sc3.nextLine();
//
//		if (ent3.equals(map.containsKey(ent3))) {
//			System.out.println("あなたの登録したIDは");
//
//		}