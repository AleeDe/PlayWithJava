class box{
    
        int l,w,h;
        box(){
            l=1;
            h=1;
            w=1;
        }
        box(int l, int w, int h){
            this.l = l;
            this.h = h;
            this.w = h;
        }
        box (int l){
            this.l = l;
            this.h = l;
            this.w = l;
        }
        box (box other){
            this.l = other.l;
            this.h = other.h;
            this.w = other.w;
        }
    }


