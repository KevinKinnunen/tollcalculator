import java.time.LocalDateTime;

public class TollCalculator {

    public int getTollFee(Vehicle vehicle, LocalDateTime[] dates) {

        int totalFee = 0;
        int currentFee = 0;

        for (LocalDateTime date : dates) {
            currentFee = countFeeVehicleType(vehicle, date);
            totalFee += currentFee;
            System.out.println(currentFee);
        }
        if (totalFee > 60)
            totalFee = 60;
        System.out.println("totalFee: " + totalFee);
        return totalFee;
    }

    // public int TollCalcTest(Vehicle vehicle, LocalDateTime[] dates) {

    //     for (LocalDateTime date : dates) {

    //     }

    //     return 0;
    // }

    private int countFeeVehicleType(Vehicle vehicle, LocalDateTime date) {
        if (date.getHour() == 8 || date.getHour() == 16) {
            return 18;
        } else {
            return vehicle.getFee();
        }
    }

}
