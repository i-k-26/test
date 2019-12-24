import java.util.ArrayList;
import java.util.List;

public class JwMap2 {

	private String key = null;
	private String value = null;
	private List<JwMap2> map;
	private int Emptymemory;
	int Maxmemory;
	String data;
	int size;

//	public JwMap(String key, String value) {
//		this.key = key;
//		this.value =value;
//	}

	// サイズを指定して生成する
	public JwMap2(int size) {
//		JwMap box = new JwMap(this.key , this.value);
		this.Maxmemory = size;
		List<JwMap2> map = new ArrayList<JwMap2>(size);
		this.map = map;
//		map.add(box);
	}

	public JwMap2(String key, String value) {
		this.key = key;
		this.value =value;
	}

	// データ追加する
	public void put(String key, String value) {
		JwMap2 box = new JwMap2(key , value);
		map.add(box);

		try {
			if(0 > Maxmemory - this.map.size()) {
				map.remove(box);
				throw new Exception("上限を超えています");
			}
		}catch(Throwable t){
			System.out.println("");
		}

//		try {
//			if(0 >= Maxmemory - this.map.size()) {
//				throw new Exception("上限を超えています");
//			}else {
//				this.map.put(key,value);
//			}
//		}catch(Throwable t){
//			System.out.println("上限を超えています");
//		}
	}

	public String getKey() {
		return this.key;
	}
	public String getValue() {
		return this.value;
	}

	// データを取得する
	public String get(String key) {
		if(map.contains(key)) {
			this.data= map.get(map.indexOf(key)).getValue();
		}
		return data;
	}

	// add可能な数を返す
	public int getAvailableSize() {
		this.Emptymemory = Maxmemory - (map.size());
		return Emptymemory;
	}

	// mapの大きさを返す
	public int getMaxSize() {;
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
