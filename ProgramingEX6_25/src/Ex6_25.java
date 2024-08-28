public class Ex6_25 {
    public static String convertMillis(long millis) {
            long seconds = (millis / 1000) % 60;
            long minutes = (millis / (1000 * 60)) % 60;
            long hours = (millis / (1000 * 60 * 60));

            return hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }

    public static void main(String[] args) {
            // 테스트 케이스
            System.out.println(convertMillis(5500));
            System.out.println(convertMillis(100000));
            System.out.println(convertMillis(5555500000L));
    }

}

