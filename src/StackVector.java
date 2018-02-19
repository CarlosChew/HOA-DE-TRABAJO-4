/* CALCULATOR POSTFIX
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * CARLOS CHEW - 17507
 * OTTO TRUJILLO - 17189
*/

import java.util.Vector;

public class StackVector<E> implements Stack<E> {

	private Vector<E> container;

	public StackVector() {
		this.container = new Vector<E>();
	}
	

	public StackVector(Vector<E> container) {
		this.container = container;
	}


	public void push(E item) {
		this.container.add(item);
	}


	public E pop() {
		return this.container.remove(this.container.size() -1);
	}


	public E peek() {
		return ((this.empty()) ? null : this.container.get(this.container.size() -1));
	}


	public boolean empty() {

		return ((this.container.size() <= 0) ? true : false);
	}


	public int size() {
		return this.container.size();
	}


}