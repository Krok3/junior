package ua.job4j;

/**
 * Class Profession - родительский класс для представителей всех профессий.
 *
 * @author vfrundin
 * @version 1.0
 * @since 28.12.2017
 */
public class Profession {

    protected String surname;           // фамилия
    protected String name;              // имя
    protected char gender;              // пол
    protected int age;                  // возраст
    protected String organization;      // место работы
    protected String professionName;    // название профессии
    protected String speciality;        // специальность
    protected int workExperience;       // время работы на должности, в годах

    /**
     * Конструктор для объекта класса Profession.
     *
     * @param surname фамилия.
     * @param name имя.
     * @param gender пол.
     * @param age возраст.
     * @param organization место работы.
     * @param professionName название профессии.
     * @param speciality специальность.
     * @param workExperience время работы на должности, в годах.
     */
    public Profession(String surname, String name, char gender, int age, String organization, String professionName,
                      String speciality, int workExperience) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.organization = organization;
        this.professionName = professionName;
        this.speciality = speciality;
        this.workExperience = workExperience;
    }

    /**
     * Метод presentation - возвращает следующую информацию об экземпляре класса: имя, фамилию,
     * наименование профессии, место работы, специальность и время работы на должности.
     */
    public String presentation() {
        return "Hello! I am " + name + " " + surname + ". I'm " + professionName
                + ". I work at the " + organization + ". My speciality is " + speciality
                + ". I have been working in this position for " + workExperience + " years.";
    }

}