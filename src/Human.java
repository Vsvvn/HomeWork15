public class Human {

//    Задание № 1
//    Задача № 1

    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;


    public Human() {
        this("Информация не указана", 0, "Информация не указана", "Информация не указана");
    }

    public Human(String name, int yearOfBirth, String town, String jobTitle) {

        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth + " году." +
                "Я работаю на должности " + jobTitle + " Будем знакомы!";
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }


    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}