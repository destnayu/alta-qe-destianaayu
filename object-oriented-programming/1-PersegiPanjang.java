class PersegiPanjang{
    int panjang,lebar;

    public int getLuasPP(){
        int luas;
        luas= this.panjang*this.lebar;
        return luas;
    }
    public int getKelilingPP(){
        int keliling;
        keliling= 2 * (this.panjang + this.lebar);
        return keliling;
    }
}