class Segitiga {
    float a,t,s1,s2,s3;

    public float getLuasSegitiga(){
        float luas;
        luas = (this.a * this.t)/2;
        return luas;
    }

    public float getKelilingSegitiga(){
        float keliling;
        keliling= (this.s1 + this.s2 + this.s3);
        return keliling;
    }
}