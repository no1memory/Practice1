package assertsample;

import java.util.concurrent.ThreadFactory;

import org.omg.CORBA.Object;

interface インターフェース{
	void テストメソッド();
}

public class Product implements インターフェース{
	public int p_int = 0;
	Product(){
		
	}
	
	Product(int a){
		p_int = a;
	}
	
	
	public void テストメソッド(){
		
	}
	
	public int plus(int a, int b){
		return a + b;
	}
	
	public String ToString(int a) {
		return ""+a;
	}
	
	public boolean equal(int a, int b) {
		if(a == b){
			return true;
		}else{
			return false;
		}
	}
	
	public Class<? extends Class> getInstanceOfInput(Class<? extends Object> o) {
		return o.getClass();
	}

}
