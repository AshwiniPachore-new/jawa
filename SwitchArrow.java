public class SwitchArrow {
    public static void main(String[] args) {
        String day = "monday";
        String result = "";
        result = switch (day) {
            case "saturday", "sunday" -> "wake up at : 6 am";
            case "monday" -> "wake up at : 8 am";
            default -> "wake up at : 7 am";
        };
        System.out.println(result);
    }
}
