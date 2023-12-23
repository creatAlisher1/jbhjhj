public class massive {
    public static void main(String[] args) {
        // Создаем массив из 15 элементов
        double[] array = {8, -2, -4, 2, 3, 6, -1, 5, 7, -3, 9, -8, 4, -6, 1};

        // Флаг, чтобы определить, следует ли начинать считать среднее
        boolean shouldStartCounting = false;

        // Переменные для суммы и количества положительных чисел
        double sum = 0;
        int count = 0;

        // Итерируемся по массиву
        for (double number : array) {
            if (number < 0) {
                // Если число отрицательное, устанавливаем флаг в true
                shouldStartCounting = true;
            } else if (shouldStartCounting) {
                // Если флаг установлен в true, начинаем считать среднее
                sum += number;
                count++;
            }
        }

        // Проверяем, были ли положительные числа после отрицательного
        if (count > 0) {
            // Вычисляем среднее арифметическое
            double average = sum / count;

            // Выводим результат на экран
            System.out.println("Среднее арифметическое положительных чисел после отрицательного: " + average);
        } else {
            System.out.println("После отрицательного числа нет положительных чисел.");
        }
    }
}
