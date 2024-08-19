public class price extends weight{
    int price;
    price(){

    }
    price(int we)
    {   
        super(we);
        this.price =super.we*5;
    }
    price (int l, int w, int h){
        super(l,w,h);
        this.price = super.we*5;
    }
    price(weight other){
        super(other);
        this.price = super.we*5;
    }
}
