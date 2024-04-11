package ex5_generic;

public class GenEx<T> {
	// T를 타입변수라고 하며 Type의 첫 글자에서 따온 것
	// 다른 글자를 사용해도 되는데 E(Element), K(key), V(value)를 많이 사용
	
	T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}
