/**
 * CS2030S PE1 Question 2
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class ArrayStack<T> implements Stack<T> {

  private int maxDepth;
  private T[]  aStack;

  public ArrayStack(int maxDepth) {
    this.maxDepth = maxDepth; 
    @SuppressWarnings("unchecked") //Only type T can be placed in array
    T[] a = (T[]) new Object[maxDepth];
    this.aStack = a;
  }
  
  public int getStackSize() {
    for (int i = 0; i < maxDepth; i++) {
      if (aStack[i] == null) {
        return i;
      } 
    }
    return maxDepth;
  }


  public T pop() {
    if (this.getStackSize() > 0) {
      T temp = aStack[this.getStackSize() -1];
      aStack[this.getStackSize() -1] = null;
      return temp;
    } else {
      return null;
    }
  }

  public void push(T arg) {
    if (this.getStackSize() < this.maxDepth) { 
      aStack[this.getStackSize()] = arg;
    }
  }

  @Override
  public String toString() {
    String lst = "";
    for (int i = 0; i < this.getStackSize(); i++) {
      lst = lst + " " + this.aStack[i];
      System.out.println(lst);
    }
    return "Stack:" + lst;
  }

  public static <U> ArrayStack<U> of(U[] arr, int n) {
    ArrayStack<U> ans = new ArrayStack<U>(n);
    for (U i : arr) {
      ans.push(i);
    }
    return ans;
  }

  public void pushAll(ArrayStack<? extends T> other) {
    int temp = other.getStackSize();
    for (int i = 0; i <= temp; i++) {
      this.push(other.pop());
    }
  }

  public void popAll(ArrayStack<? super T> other) {
    int temp = this.getStackSize();
    for (int i = 0; i <= temp; i++) {
      other.push(this.pop());
    }
  }

}
