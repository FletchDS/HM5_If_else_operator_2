import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Random random = new Random();
        byte clientOS = (byte) random.nextInt(0, 2);

        System.out.printf("Индексы ОС: 0 - iOS, 1 - Android\nВыбран индекс %d\n", clientOS);

        if (clientOS == 1) {
            System.out.print("Установите " + " версию приложения для Android по ссылке");
        } else {
            System.out.print("Установите" + " версию приложения для iOS по ссылке");
        }

        //Задача 2
        short creationYear = (short) random.nextInt(2000, 2025);

        System.out.printf("\n\nИндексы ОС: 0 - iOS, 1 - Android\nВыбран индекс %d\nГод создания %d\n", clientOS, creationYear);

        if (clientOS == 1) {
            System.out.print("Установите " + (creationYear < 2015 ? "облегченную " : "") + "версию приложения для Android по ссылке");
        } else {
            System.out.print("Установите " + (creationYear < 2015 ? "облегченную " : "") + " версию приложения для iOS по ссылке");
        }

        //Задача 3
        short year = (short) random.nextInt(1585, 3001);

        System.out.printf("\n\nВыбран год %d\n", year);


        if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) {
            System.out.printf("%d год не является високосным", year);
        } else {
            System.out.printf("%d год является високосным", year);
        }

        //Задча 4
        byte deliveryDistance = (byte) random.nextInt(0, 131);

        System.out.printf("\n\nДистанция до клиента - %d\n", deliveryDistance);

        if (deliveryDistance <= 20) {
            System.out.print("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.print("Потребуется дней: 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.print("Доставка займет 3 дня");
        } else {
            System.out.print("Доставка невозможна");
        }

        //Задача 5
        byte month = (byte) random.nextInt(1, 14);

        System.out.printf("\n\nПорядковый номер месяца - %d\n", month);

        switch (month) {
            case 1, 2, 12:
                System.out.print("Сейчас зима");
                break;
            case 3, 4, 5:
                System.out.print("Сейчас весна");
                break;
            case 6, 7, 8:
                System.out.print("Сейчас лето");
                break;
            case 9, 10, 11:
                System.out.print("Сейчас осень");
                break;
            default:
                System.out.print("Такого месяца не существует");
        }
    }
}