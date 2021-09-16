class Stack
   {
    private Object[] data=new Object[1000];
    private int index = 0;
    private int size = 0;
    int top;
    //int array[];
    
	public Stack() {
		//Fill the code here
        
        top=-1;
        //data=new Object[size];
	}
	
	public void push(Object o) {
		//Fill the code here
        data[++top]=o;
	}
	
	public Object pop() {
		//Fill the code here
        Object a=data[top--];
        return a;
	}
	
	public boolean isEmpty() {
		//Fill the code here
        if(top==-1){
            return true;
        }
        return false;
	}
	
}


