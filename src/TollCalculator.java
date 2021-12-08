import java.time.LocalDateTime;
import java.util.Arrays;

public class TollCalculator {

    public int getTollFee(Vehicle vehicle, LocalDateTime[] dates) {

        int totalFee = 0;
        int currentFee = 0;

        for (LocalDateTime date : dates) {
            currentFee = countFeeVehicleType(vehicle, date);
            totalFee += currentFee;
            int[] myArray = new int[] { currentFee };
            System.out.println(Arrays.toString(myArray));
        }
        if (totalFee > 60)
            totalFee = 60;
        System.out.println("totalFee: " + totalFee);
        return totalFee;
    }

    private int countFeeVehicleType(Vehicle vehicle, LocalDateTime date) {
        if (date.getHour() == 8 || date.getHour() == 16) {
            return 18;
        } else {
            return vehicle.getFee();
        }
    }

}
