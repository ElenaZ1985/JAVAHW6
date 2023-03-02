пакет заданий ;

java import.util.Хэш-набор;
java import.util.Set;

Основной  класс  общедоступный {
    main  аннулирует  статический  публичный (строка[] аргументов) {
// Создание объектов класса Laptop
        Ноутбук  hp_pailion_g6 = новый  ноутбук ("hp_pailion_g6", 16, "4k", 
        верно, 500, "16", "Windows", "черный"); 
        брендHp  Бренд = новый  бренд ("HP", "U.S.A.", "AmericaLanguage");
        hp_pailion_g6.Добавить бренд (brandHp); 
        Ноутбук  hp_galaxy_x64 = новый  ноутбук ("hp_galaxy_x64", 14, "FullHD", 
        верно, 500, "8", "Windows", "белый");
        hp_galaxy_x64.Добавить бренд (brandHp);
        Ноутбук  samsung_a52 = новый  ноутбук ("samsung_a52", 18, "FullHD", 
        верно, 300, "8", "Windows", "черный");
        Бренды  Самсунг Бренд = новый  бренд ("Samsung", "Корея", "Корейский язык");
        samsung_a52.Добавить бренд (brandSamsung);
        Ноутбук  samsung_m31s = новый  ноутбук ("samsung_m31s", 16, "4k", 
        false, 1000, "16", "Linux", "черный");
        samsung_m31s.Добавить бренд (брендSamsung);
        Ноутбук  lenovo_gtx76 = новый  ноутбук ("lenovo_gtx76", 16, "FullHD", 
        верно, 700, "8", "Windows", "белый");
        брендЛеново  Бренд = новый  бренд ("Lenovo", "Китай", "Китайский язык");
        lenovo_gtx76.addBrand(брендЛеново);
        Ноутбук  macbook_14pro = новый  ноутбук ("macbook_14pro", 17, "4k", 
        false, 1000, "8", "ios", "белый");
        Бренд  MacBook Brand = новый  бренд ("Apple", "США", "Американский язык");
        macbook_14pro.Добавить бренд (фирменный MacBook);
        Ноутбук  asus_x515 = новый  ноутбук ("asus_x515", 17, "FullHD", 
        верно, 300, "4", "Windows", "черный");
        брендАсюс  Бренд = новый  бренд ("Asus", "Тайвань", "Китайский язык");
        asus_x515.Добавить бренд (brandAsus);
        Ноутбук  acer_air5 = новый  ноутбук ("acer_air5", 19, "FullHD", 
        верно, 600, "8", "Windows", "черный");
        Брендовый  бренд = новый  бренд ("Acer", "Тайвань", "Китайский язык");
        acer_air5.Добавить бренд (создатель бренда);
        Ноутбук  acer_air6 = новый  ноутбук ("acer_air6", 18, "4k", 
        false, 500, "16", "Windows", "черный");
        acer_air6.Добавить бренд (создатель бренда);
        Ноутбук  acer_a313 = новый  ноутбук ("acer_a313", 16, "FullHD", 
        верно, 500, "8", "Windows", "черный");
        acer_a313.Добавить бренд (создатель бренда);
// Создание множества
        Установить <Ноутбук> ноутбук = новый  хэш-набор<>();
        laptop.add(hp_pailion_g6); 
        laptop.add(hp_galaxy_x64);
        добавить ноутбук (samsung_a52);
        добавить ноутбук (samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);
// создание нового объекта вызова методов
        Фильтрующий  ноутбук = новый  ноутбук();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(ноутбук));
    }
}
