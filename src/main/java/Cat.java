public class Cat {
    //Можно было бы и без этого. По условиям задачи можно было создать вообще пустой класс.
    private String meow;

    //Так как есть meow, значит должны быть сеттеры и геттеры - это POJO --- Конструктор пустой по умолчанию.
    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }
}
