Feature: Проверка соответсвия товара на странице с продуктами и в корзине
  Добавить продукты в корзину, проверить что описание, название и цена одинаковые в корзине и на странице с продуктами

  Scenario: Добавить один товар в корзину, проверить, что описание, цена и название одинаковы
    Given Пользователь залогинился
    When Добавить в корзину "Sauce Labs Backpack"
    When Запомнить параметры "Sauce Labs Backpack" на главной странице
    Then Открыть корзину
    When В корзине "1" товаров
    Then В корзине товар с именем "Sauce Labs Backpack"
    When Запомнить параметры "Sauce Labs Backpack" в корзине
    Then Проверить парамерты
    Then Очистить корзину

  Scenario: Добавить несколько товаров в корзину, проверить, что описание, цена и название одинаковы
    Given Пользователь залогинился
    When Добавить в корзину "Sauce Labs Backpack"
    When Добавить в корзину "Sauce Labs Bolt T-Shirt"
    When Запомнить параметры "Sauce Labs Backpack" на главной странице
    When Запомнить параметры "Sauce Labs Bolt T-Shirt" на главной странице
    Then Открыть корзину
    When В корзине "2" товаров
    Then В корзине товар с именем "Sauce Labs Backpack"
    Then В корзине товар с именем "Sauce Labs Bolt T-Shirt"
    When Запомнить параметры "Sauce Labs Backpack" в корзине
    When Запомнить параметры "Sauce Labs Bolt T-Shirt" в корзине
    Then Очистить корзину