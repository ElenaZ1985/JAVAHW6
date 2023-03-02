пакет заданий ;

java import.util.Список массивов;
java import.util.Хэш-набор;
java import.util.List;
java import.util.Сканер;
java import.util.Set;

// Создание класса Laptop
Класс ноутбука   общедоступный {
// Создание поля на основе другого класса
    Список  частных <Brand> брендов;
// Создание полей
    строка модели   закрыта;
    diagonal  float  частный;
    Строка   разрешения экрана закрыта;
    Логическое значение dvdRom   private;
    Жесткий   диск внутри частного;
    Строка   оперативной памяти закрыта;
    Строка операционной   системы закрыта;
    цветная  строка  private;
// Создание пустого конструктора для работы с методами
    Общедоступный ноутбук () {
    }
// Создание конструктора для создания экземпляров класса
    Общедоступный ноутбук  (строковая  модель, плавающая  диагональ , строковое разрешение экрана , логический  DVD-диск, встроенный жесткий диск,
            Строка  оперативной памяти,  строка операционной  системы, цвет строки) {
        this.brands = новый  список массивов<>();
        this.model = модель;
        это.diagonal = диагональ;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = жесткий диск;
        this.operativeMemory = Оперативная память;
        this.OperatingSystem = Операционная система;
        this.color = цвет;
    }
// Создание методов get\set Для работы с private полями
    getModel  String  public() {возвращает  модель;}
    getDiagonal  float  public() {возвращает  диагональ;}
    getScreenResolution  String  public() {возвращает  screenResolution;}
    isDvdRom  логический  public() {возвращает  dvdRom;}
    getHardDisk  int  public() {возвращает  жесткий диск;}
    getOperativeMemory  String  public() {возвращает  оперативную память;}
    getOperatingSystem  Строка  public() {возвращает  операционную систему;}
    getColor  String  public() {возвращает  цвет;}
// Создание метода для создания экземпляра другого класса,
// для того что бы работать с этими экземпляррами в данном классе
    Добавить  пустую  публикацию (бренд  бренда) {
        brands.add(бренд);
    }
// создание метода фильтрации ноутбуков по критериям
    Список  общедоступных фильтров <Ноутбук> (установить <Ноутбук> ноутбук) {
        сканирующий  сканер = новый  сканер (System.in );
        System.out.println("Здрасвуйте, Укажите каие параметры для ноут бука вы бы хотели иметь." +
                "\nУкажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
        Введите  строку жесткого диска = scan.nextLine();
        intParseEnterHardDisk  int = Целое число.parseInt(ввод жесткого диска);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
        Введите  строку операционной памяти = scan.nextLine();
        System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
        Введите  строку OperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
        Введите  цветовую строку = scan.nextLine();

        Список<Ноутбук> listLaptop = новый  список массивов<>();
        для (Ноутбук  tempLaptop : ноутбук) {
            если (intParseEnterHardDisk == tempLaptop.hardDisk) {
                если (enterOperativeMemory.равно(tempLaptop.operativeMemory)) {
                    если (введите OperatingSystem.equals(tempLaptop.OperatingSystem)) {
                        если (введите цвет.равно(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        Возврат  listLaptop;
    }

// создание метода фильтрации ноутбуков по выборочной критериям
    Установить  общедоступный <Ноутбук> Новый фильтр (Установить <Ноутбук> ноутбук) {
        сканирующий  сканер = новый  сканер (System.in );
        Set<Ноутбук> listLaptop = новый  набор хэшей<>(ноутбук);

        System.out.println("Здрасвуйте, Укажите номер или номера критериев фильрации ноутбуков," + 
        "\n1. Размер жесткого диска \n2. Размер оперативной памяти \n3. Операционная система \n4. Цвет");
        Строка  запроса пользователя = scan.nextLine();
            
        for (int  i = 0; i < Запрос пользователя.длина(); я++) {
            если(1 == Character.getNumericValue(Запрос пользователя.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
                Введите  строку жесткого диска = scan.nextLine();
                intParseEnterHardDisk  int = Целое число.parseInt(ввод жесткого диска);
                для (Ноутбук  tempLaptop : ноутбук) {
                    если (intParseEnterHardDisk != tempLaptop.hardDisk){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            если(2 == Character.getNumericValue(Запрос пользователя.charAt(i))){
                System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
                Введите  строку операционной памяти = scan.nextLine();
                для (Ноутбук  tempLaptop : ноутбук) {
                    if ((enterOperativeMemory.equals(tempLaptop.operativeMemory)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            если(3 == Character.getNumericValue(Запрос пользователя.charAt(i))){
                System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
                Введите  строку OperatingSystem = scan.nextLine();
                для (Ноутбук  tempLaptop : ноутбук) {
                    если ((Введите OperatingSystem.equals(tempLaptop.OperatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            если(4 == Character.getNumericValue(Запрос пользователя.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
                Введите  цветовую строку = scan.nextLine();
                для (Ноутбук  tempLaptop : ноутбук) {
                    если ((Введите цвет.равно(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        Возврат  listLaptop;
    }

// метод toString, выводит на экран данные объекта
    @Переопределить
    toString  Строка  public() {
        "\nLaptop -> " return + model + "\nbrands = " + brands + ",\ndiagonal = " + diagonal + ",\nscreenResolution = "
 + Разрешение экрана
 + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + Жесткий диск + ",\noperativeMemory = " + Оперативная память
 + ",\noperatingSystem = " + OperatingSystem + ",\ncolor = " + color + "\n";
    }

}
