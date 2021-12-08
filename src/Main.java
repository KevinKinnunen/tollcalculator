import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        TollCalculator tollcalc = new TollCalculator();

        LocalDateTime[] dates = {
                LocalDateTime.of(2021, 12, 7, 5, 01, 00),
                LocalDateTime.of(2021, 12, 7, 8, 01, 00),
                LocalDateTime.of(2021, 12, 7, 9, 30, 00),
                LocalDateTime.of(2021, 12, 7, 16, 01, 00),
                LocalDateTime.of(2021, 12, 7, 17, 00, 00),
                LocalDateTime.of(2021, 12, 7, 18, 24, 00),
                LocalDateTime.of(2021, 12, 7, 20, 24, 00),
        };

        Vehicle vehicle = new Car();
        Vehicle vehicle2 = new MotorBike();

        tollcalc.getTollFee(vehicle, dates);
        tollcalc.getTollFee(vehicle2, dates);

    }
}
