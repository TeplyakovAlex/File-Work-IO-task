package utils;

public final class Constants {

    // Абсолютний шлях до зовнішньої папки на локальній машині,
    // щодо проекту.
    //  / - кореневий каталог, у термінах Windows - це,
    //  наприклад, C:\
    public final static String BASE_PATH_OUT = "src/main/java/files/";


    // Для створення виняткової ситуації,
    // можна спотворити цей шлях, наприклад, Sample/.
    // Якщо приберемо завершальний слеш, записуватиметься файл
    // у папку Files/ з ім'ям Sample + ім'я файлу.розширення
//    public final static String BASE_PATH_OUT = "/_HIL/Files/Sample/";


    // Внутрішня папка проекту.
    // Відносний шлях стосовно коду, що виконується.
    // Для створення виняткової ситуації,
    // можна спотворити цей шлях.
    public final static String BASE_PATH_IN = "src/main/java/files/";
}
