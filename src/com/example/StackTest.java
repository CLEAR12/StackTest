//TAIL
/**

* Stack Test Sample Program
* Thus Program implement 4 APIs :
* isEmpty()
*peek()
*pop
*push
*git status
*git add *.java
*git commit
*git push
*
*@author SHGAN (qpfwm12@gmail.com)
*@Version 1.0, 06, out. 2016
*/
package com.example;
import com.example.Stack;

public class StackTest {
	public static void main(String[] args) {
		String input = "124*5/+7-36/+";
		Stack theStack;
		int stackSize = input.length();
		ClassInt a=null, b=null, c=null;
    	boolean ret=true;

    	theStack = new Stack(stackSize);
	    for (int j = 0; j < stackSize; j++) {
	    	char ch = input.charAt(j);
	    	switch (ch) {    	    
	    		case '+': 
	    			b = theStack.pop(); 
	    			a = theStack.pop(); 
	    			c = new ClassInt(a.data + b.data); 
	    			ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR A !!! ");
	    			}
	    			break;
   	            case '-':
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data - b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR B !!! ");
	    			}
   	            	break;
   	            case '*': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data * b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR C !!! ");
	    			}
   	            	break;
   	            case '/': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data / b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR D !!! ");
	    			}
   	            	break;
   	            default: 
   	            	c = new ClassInt(Integer.parseInt(""+ch));
   	            	ret = theStack.push(c); 
	    			if (ret == false) {
	    				System.out.println("The Stack operation ERROR E!!! ");
	    			}
   	                break;
   	         }
	    }
	    a = theStack.pop();
	    System.out.println("The value is " + a.data);
	}
}
