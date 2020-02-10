public class WaterBottle {

    private Integer volume;


    public WaterBottle() {
        this.volume = 100;
    }
/// test volume
    public int bottleVolume() {
         return this.volume;
    }

    public void drinkFromBottle() {
        this.volume -= 10;
        //void does, not return
    }

    public int emptyBottle() {
        if (this.volume == 0) {
            return 0;
        }
        return 0;
    }

    public int fillBottle() {
       return this.volume = 100;
    }

//    x = 70
//    30 + x = 100
//    x = 100 - 30
//
///     x = this.volume
//      currentVolume + amountToFill = this.volume
//      amountToFill = this.volume - currentVolume
//
//      drinkFromBottle() --gives-- currentVolume
//
/////////////SUEDO CODE
//        currentVolume = drinkFromBottle();
//        //90 is current volume
//        amountToFill = this.volume -= drinkFromBottle();
//        //10 is amount to fill
    //
    //    amountToFill + currentVolume = fillBottle
    //
    //      return fillBottle
    //


}