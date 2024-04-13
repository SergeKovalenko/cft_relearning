package Lesson1;

public enum FtMoney {
    RUB("Рубль"),
    USD("Доллар"),
    EUR("Евро"),
    KAZ("Новая");
    private String title;

    FtMoney(String title) {
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
          return "FtMoney{" +
                "title='" + title + '\'' +
                '}';
    }


}
