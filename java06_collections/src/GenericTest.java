
public class GenericTest<V> {

	private V name;

	public GenericTest() {

	}
	public void setName(V name) {
		this.name = name;

	}
	public V getName() {
		return name;
	}
}
//	new GenerricTest<String>()
//	new GennericTest<calendar>()
//	<입력값>따라 달라진다.