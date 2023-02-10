public class Course {
    private String name;
    private String acronym;
    private int year;

    public Course() {}

    public Course(String name, String acronym, int year) {
        this.name = name;
        this.acronym = acronym;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
