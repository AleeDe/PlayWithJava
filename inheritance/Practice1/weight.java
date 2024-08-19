public class weight extends box{
    int we;
    public weight(){
    }
    public weight(int l, int w, int h,int we){
        super(l,w,h);
        // this.w = l*h*w;
        this.we = we;
    }
    public weight(int l, int w, int h){
        super(l,w,h);
        // System.out.println(this.h);
        we = l*w*h;
    }
    public weight(weight other){
        super(other);
        this.we = other.we;
    }
    public weight(int we){
        this.we = we;
    }
    
}
