Feature: Добавление продукта в корзину
  Добавить продукты в корзину, проверить, что добавились

  Scenario: Добавление одного продукта в корзину
    Given Пользователь залогинился
    Then Добавить в корзину "Sauce Labs Backpack"
    When Счётчик товаров равен "1"
    Then Открыть корзину
    When В корзине товар с именем "Sauce Labs Backpack"
    Then Убрать элемент из корзины с именем "Sauce Labs Backpack"
    When Корзина пуста

  Scenario: Добавление нескольких продуктов в корзину
    Given Пользователь залогинился
    Then Добавить в корзину "Sauce Labs Backpack"
    Then Добавить в корзину "Sauce Labs Bolt T-Shirt"
    Then Добавить в корзину "Test.allTheThings() T-Shirt (Red)"
    When Счётчик товаров равен "3"
    Then Открыть корзину
    When В корзине товар с именем "Sauce Labs Backpack"
    When В корзине товар с именем "Sauce Labs Bolt T-Shirt"
    When В корзине товар с именем "Test.allTheThings() T-Shirt (Red)"
    Then Очистить корзину
    When Корзина пуста

  Scenario: Добавление всех продуктов в корзину
    Given Пользователь залогинился
    Then Добавить в корзину все продукты
    When Счётчик товаров равен "6"
    Then Открыть корзину
    When В корзине "6" товаров
    Then Очистить корзину
    When Корзина пуста