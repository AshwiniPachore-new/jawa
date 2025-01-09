public class SwitchWithYield {
    public static void main(String[] args) {
        String day = "monday";
        String result = switch (day) {
            case "saturday", "sunday":
                yield "wake up at : 6 am";
            case "monday":
                yield "wake up at : 8 am";

            default:
                yield "wake up at : 7 am";
        };
        System.out.println(result);
    }
}
