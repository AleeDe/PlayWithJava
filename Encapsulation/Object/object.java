public class object {

    int num;
    object(int num){
        this.num = num;
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return this.num ==((object)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws throwable{
        super.finalize();
    }
    
}



