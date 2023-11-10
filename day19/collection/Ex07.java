package collection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		// Map : 배열 및 List의 index 대신 key라는값을 이용하여 value에 접근하는 구조
		// key와 value가 1:1 맵핑이되어 저장되는 구조
		// key는 중복될 수 업다
		// value는 중복을 허용한다
		// key를 알면 value에 접근할 수 있으나, value를 이용하여 역으로 key를 알아낼 수는 없다
		// key -> value (o), value -> key (x), 단방향 맵핑 구조
		
		// Map은 key의 자료형과 value의 자료형을 모두 지정해야 한다
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("coconut", "코코넛");
		map.put("durian", "두리안");
		map.put("orange", "델몬트");
		
		System.out.println(map);
		
		System.out.println("map.get(apple) : " + map.get("apple"));
		System.out.println("map.get(사과) : " + map.get("사과"));
		System.out.println();
		
		Set<String> keySet = map.keySet(); // key는 중복될 수 없어서 Set으로 받으면 된다
		for(String key : keySet) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
			
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String key;
		String value;
		
		System.out.println("맵에서 찾을 key 입력 : ");
		key = sc.next();
		value = map.get(key);
		System.out.println(key + " : " + value);
		
		sc.close();
		
		
		// 일반적으로 Map의 구현체를 사용할때는 HashMap을 사용하지만
		// 순번이 필요하다면 LinkedHashMap을 사용할 수 있고
		// key와 value의 제네릭 타입이 모두 String이면서 파일에 저장해서 불러올경우는
		// properties 타입을 사용할 수도 있다
		
		Properties pro = new Properties();
		pro.put("charAt","인덱스를 전달하여 글자를 char형태로 반환한다");
		pro.put("equals", "다른 문자열과 비교하여 내용 일치여부를 boolean으로 반환한다");
		pro.put("contains", "특정 패턴의 내용이 포함되는지를 boolean으로 반환한다");
		pro.put("substring", "인덱스를 지정하여 특정 범위의 문자열을 잘라낸다");
		pro.put("split", "특정 글자를 기준으로 각 내용을 분리하여 String[]로 반환한다");
		pro.put("replace", "특정 패턴 글자를 찾아서, 새로운 내용으로 교체한다");
		
		for(Object k : pro.keySet()) {
			Object v = pro.get(k);
			System.out.println(k + " : " + v);
		}
		
		System.out.println();
		
		File f = new File("pro.txt");
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		pro.store(osw, "String class Function");
	}
}
