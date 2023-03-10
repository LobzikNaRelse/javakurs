package com.company;

public class Main {

    public static void main(String[] args)
    {
	    // git --version //версия
        // далее вводить в терминал
        // git init // инициализация в проекте и создаст скрытую папку гид добавлен в проект
        // красного цвета файлы что не добавлены в гид репозиторий
        //  git config --global user.name 'Fredi' // установление глобального логина (1 раз прописывается навсегда)
        // git config --global user.email 'admin@fredi.com' // установление глобальной почты (1 раз прописывается навсегда)

        // есть локальный репозирорий у меня на компе и есть в инете
        //  git add src/com/company/Main.java // добавить один файл Main.java
        // git add *.java // добавить все файлы с расширением *.java
        //  git add src/*  // добавить все файлы из папки src
        // git add src/   // добавить папку
        // git add src/*.java // все файлы из сорс с расширением
        // git add .  /или/ git add -A // добавить все файлы в репозирорий
        // обычно добавляют все, а в файле гид игнор прописывают что игнорировать (папка .idea)
        // после такого добавления файл становится в очередь для комита и цвет зеленый
        // git status // посмотреть статус комита
        // git commit -m "Adding to java files" // перемещает с комита в локальный репозиторий, затем уже можно
        // будет в удаленный потом; в кавычках просто комментарий, любой, но обязательный; и цвет обычный будет
        // git rm --cached src/*.java  // удалить из комита файлы из папки с расширением
        // измененный файл голубого цвета
        // ДАЛЕЕ игнорирование смотреть в файле .gitignore
        // его желательно создавать в основной папке проекта


        // Ветвление
        // после git status есть строка On branch master // branch - ветка с англ master значит что основная ветка, от нее
        // можно делать ответвления и слияния
        // git branch reg // создать ветку с именем reg, только создает
        // git checkout reg // перейти на ветку reg
        // git checkout master // вернуться на основную ветку

        // Удаленный репозиротий
        // сначала его нужно создать в аккаунте github ; new repository
        // echo "# java" // выводит в терминал # java
        // echo "# java" >> README.md // выводит текст и записывает его в файл реадми
        // git add README.md // добавляет в локальный репозиторий файл реадми
        // git branch -m main // переименовывает основную ветку в маин
        // git remote // проверить к какому удаленному репозиторию подключены (если ничего - не подключен вообще)
        // git remote add origin https://github.com/LobzikNaRelse/javakurs.git // подключение к удаленому репозиторию
        // origin можно переписать, это название удаленного для нас, для команд
        // git remote remove origin // от какого удаленного репозитория отключиться
        // git push -u origin main // выгружает в удаленный репозиторий origin (название) ветку main (название)
        // git push -f origin main // так правильнее -u дерьма
        // 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 // токен для авторизации
        // профиль гид хаб -> setting -> developer setting -> Personal access tokens
        // выбрать сколько дней живет, в заметки terminal, и что будет использоваться для repo (галочка)
        // что бы добавить токкен панель управления - учетные записи пользователей - диспетчер учетных записей
        // ищешь гидхаб или создаешь: cсылка так: (git:https://github.com/) логин тот что на гидхабе, и токкен в пароль





        // это в файле .gitignore
        //*.java  // игнорировать все файлы с расширением
        //.idea // ее лучше игнорировать так как она не нужна по факту
        //ObuchenieKursGitConsol.iml  // становится коричневого цвета
        //
        //// тут слеши лучше не писать, в реально рабочем файле))) иначе не будет работать
    }
}
