![lesson](https://img.shields.io/badge/hw__adv-12-green)

### Написати додаток наступного функціонала:

1. Generics - прочитати про erasure та про обмеження зверху та знизу (extends & super)
2. Створити програму "Фабрика котячого фаршу". FreshCatFarchFactory. Є певна кількість класів з котами (всі спадкоємці Cat). Фабрика приймає на вхід масив із цими котами типу Cat. І перебирає його, визначаючи, хто з них підійде для виготовлення фаршу, а хто ні. Наприклад, коти, у яких над класом є інструкція Блохебл, Тощебл, Одноглазебл не підходять. Коти з інструкцією Color зі значенням атрибута "red" теж не підходять. Коти з кількістю методів більше трьох теж не підходять. Решта - на фарш! Забезпечити логування.