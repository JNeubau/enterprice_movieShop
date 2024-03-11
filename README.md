# enterprice_movieShop

### To Do
- Przeglądanie katalogu filmów (podstawowe informacje, bez opisu fabuły)
z możliwością zawężenia listy do konkretnej kategorii
- Wyświetlanie szczegółowego opisu pojedynczego filmu (komplet danych o filmie
wraz z opisem fabuły)
- Obsługę koszyka zakupów klienta (dodawanie i usuwanie filmów, podgląd zawartości
koszyka, podliczanie całkowitej wartości koszyka)
- Dane o filmach powinny być przechowywane w bazie danych. Każdy film powinien być
opisany przynajmniej następującymi atrybutami: **id, tytuł, kategoria (dramat, komedia,
familijny, itd.), rok produkcji, opis fabuły, cena**

#### **NOT** to do 
Fragmenty systemu odpowiedzialne za ewidencję klientów,
autoryzację klientów, składanie zamówienia, uaktualnianie katalogu filmów

#### Procenty
- warstwa dostępu do danych (ORM): 20%
- lista filmów: 15%
- wyszukiwanie filmów wg kategorii: 20%
- możliwość podejrzenia szczegółów o filmie: 15%
- koszyk zakupów: 30%



### Done:
<<<<<<< HEAD
- SQL: CREATE TABLE `enterprice_proj`.`movies` (`ID` INT NOT NULL AUTO_INCREMENT , `Title` VARCHAR(100) NOT NULL , `Genre` VARCHAR(535) NULL , `Year` VARCHAR(5) NOT NULL , `Description` VARCHAR(535) NULL DEFAULT NULL , `Price` DECIMAL NOT NULL , PRIMARY KEY (`ID`)) ENGINE = InnoDB; 
- 
=======
- SQL: CREATE TABLE `enterprice_proj`.`movie` (`ID` INT NOT NULL AUTO_INCREMENT , `Title` VARCHAR(100) NOT NULL , `Genre` VARCHAR(535) NULL , `Year` VARCHAR(5) NOT NULL , `Description` VARCHAR(535) NULL DEFAULT NULL , `Price` DECIMAL NOT NULL , PRIMARY KEY (`ID`)) ENGINE = InnoDB; 
- MySQL port: 8080, Spring port: 8081
>>>>>>> 3d562e27baa112f3a3a0279df2f98cc2219db152
