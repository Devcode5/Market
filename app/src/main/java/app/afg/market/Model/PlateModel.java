package app.afg.market.Model;

public class PlateModel {
    private int img_plate;


    public PlateModel(){
        //impty constructor
    }

    public PlateModel(int img_plate){
        this.img_plate=img_plate;
    }

    public int getImg_plate() {
        return img_plate;
    }

    public void setImg_plate(int img_plate){
        this.img_plate=img_plate;
    }
}
