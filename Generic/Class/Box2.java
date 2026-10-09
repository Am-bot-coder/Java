package Generic.Class;

public class Box2<T extends Number> {
	private T obj;
	public T getV() {
		return obj;
	}
	public void SetV(T obj) {
		this.obj = obj;
	}
}
