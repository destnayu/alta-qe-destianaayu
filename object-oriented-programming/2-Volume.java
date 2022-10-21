class Volume {
    int panjang,lebar,tinggi, sisi, r, t;



    public int VolumeKubus(){
        int volume;
        volume= sisi*sisi*sisi;
        return volume;
    }
    public int VolumeBalok(){
        int volume;
        volume= (panjang*lebar)*tinggi;
        return volume;
    }

    public double VolumeTabung(){
        double volume;
        if(r % 7 ==0) {
            volume = 22 * (r * r / 7) * t;
        }else{
            volume = 3.14 * (r * r) * t;
        }
        return volume;
    }
}