public class SwimmingPool {
    public static void main(String[] args) {

        int volume = 1200;
        int currentVolume = 0;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int minutes = 0;

        int clearWater = fillingSpeed - devastationSpeed;

        while (currentVolume < volume) {
            currentVolume = currentVolume + clearWater;
            System.out.println("Бассейн наполняется: добавлено " + (currentVolume) + " литров");
            minutes++;
        }

        System.out.println("Общее время наполнения бассейна составило: " + minutes + " минут");

// Создайте переменную, в которой будет храниться текущий объём бассейна,
// и каждую итерацию цикла добавляйте к нему fillingSpeed и вычитайте
// из него devastationSpeed. Как только текущий объём бассейна станет
// равен значению переменной volume, выполните команду break.
// В процессе выполнения цикла считайте количество итераций — это и будет время наполнения бассейна.
    }
}
