public class Break {
    public static void main(String[] args) {
        int sougthYear = 1985;

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExist = false;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == sougthYear) {
                yearExist = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExist ? found : notFound);
    }
}
