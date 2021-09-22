package com.company;

class Music {
    private String name; // название произведения
    private int copies; // количество выпущенных
    private boolean possibility;

    public String getName() {
        return "Назвние произведения:"+name ;
    }
    public String getCopies() {
        return "Количество проданных копий: " +copies;
    }
    public String isPossibility() {
        return possibility ? "Возможность скачать с интернета формат mp3: Да" : "Возможность скачать с интернета формат mp3: Нет";
    }

    public Music() {
        name = "None";
        copies = 0;
        possibility = false;
    }

    public Music(String name, int copies, boolean possibility) {
        this.name = name;
        this.copies = copies;
        this.possibility = possibility;
    }
}
