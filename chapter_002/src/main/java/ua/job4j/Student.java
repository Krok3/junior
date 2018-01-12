package ua.job4j;

/**
 * Class Student - класс описывает поведение объектов типа Студент.
 *
 * @author vfrundin
 * @version 1.0
 * @since 30.12.2017
 */
public class Student extends Profession {

    private String faculty;             // факультет на котором учится студент
    private boolean isHealthy;          // признак состояние здоровья студента
    private int[] levelOfKnowledge;     // массив с уровнем знаний по изучаемым предметам
    private int[] studentsRecordBook;   // зачетка студента, массив оценок по изучаемым предметам

    /**
     * Конструктор для объекта класса Student.
     *
     * Для инициализации наследованных полей использует констрктор родительского класса.
     * @param faculty факультет на котором учится студент.
     * @param isHealthy состояние здоровья студента, принимает значения: true - студент здоров; false - студент болен.
     * @param levelOfKnowledge массив с уровнем знаний по изучаемым предметам.
     * @param studentsRecordBook зачетка студента, массив оценок по изучаемым предметам.
     */
    public Student(String surname, String name, char gender, int age, String organization,
                   String professionName, String speciality, int workExperience, String faculty,
                   boolean isHealthy, int[] levelOfKnowledge, int[] studentsRecordBook) {
        super(surname, name, gender, age, organization, professionName, speciality, workExperience);
        this.faculty = faculty;
        this.isHealthy = isHealthy;
        this.levelOfKnowledge = levelOfKnowledge;
        this.studentsRecordBook = studentsRecordBook;
    }

    /**
     * Метод getIsHealthy - возвращает признак состояния здоровья студента.
     *
     * @return isHealthy - признак состояния здоровья студента.
     */
    public boolean getIsHealthy() {
        return isHealthy;
    }

    /**
     * Метод setIsHealthy - устанавливает значение признака состояния здоровья студента.
     *
     * @param isHealthy признак состояния здоровья студента.
     */
    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    /**
     * Метод getLevelOfKnowledge - возвращает массив с уровнем знаний студента по предметам.
     *
     * @return levelOfKnowledge - массив с уровнем знаний студента по предметам.
     */
    public int[] getLevelOfKnowledge() {
        return levelOfKnowledge;
    }

    /**
     * Метод setLevelOfKnowledge - изменяет значения элементов массива с уровнем знаний студента по предметам.
     *
     * @param levelOfKnowledge массив с уровнем знаний студента по предметам.
     */
    public void setLevelOfKnowledge(int[] levelOfKnowledge) {
        this.levelOfKnowledge = levelOfKnowledge;
    }

    /**
     * Метод getStudentsRecordBook - возвращает массив оценок студента по изучаемым предметам.
     *
     * @return levelOfKnowledge - массив оценок студента по изучаемым предметам.
     */
    public int[] getStudentsRecordBook() {
        return studentsRecordBook;
    }

    /**
     * Метод setStudentsRecordBook - изменяет значения элементов массива с оценками студента по изучаемым предметам.
     *
     * @param studentsRecordBook массив оценок студента по изучаемым предметам.
     */
    public void setStudentsRecordBook(int[] studentsRecordBook) {
        this.studentsRecordBook = studentsRecordBook;
    }

    /**
     * Метод presentation - переопределяет метод родительского класса для класса Student, возвращает следующую
     * информацию об экземпляре класса: имя, фамилию, наименование профессии, место учебы, факультет,
     * специальность и курс на котором учится студент.
     */
    public String presentation() {
        return "Hello! I am " + this.name + " " + surname + ". I'm a " + professionName
                + ". I study at the " + organization + " at the " + faculty + ". My speciality is " + speciality
                + ". I am a " + workExperience + " year student.";
    }

    /**
     * Метод prepareForExam - подготовка студента к экзаменту, изменяет значения элемента массива с уровнем знаний по
     * предмету который читает преподаватель (levelOfKnowledge).
     * Текущий уровень знаний студента по предмету увеличивается на 50%.
     *
     * @param teacher объект типа Преподаватель.
     */
    public void prepareForExam(Teacher teacher) {
        levelOfKnowledge[teacher.getSubjectId()] += levelOfKnowledge[teacher.getSubjectId()] / 2;
    }

    /**
     * Метод practicalTraining - студент проходит производственную практику у инженера, увеличивает значения элементов
     * массива с уровнем знаний студента по всем изучаемым предметам.
     * Текущий уровень знаний студента по предмету увеличивается на значение равное 1/3 от значения категории инженера.
     *
     * @param engineer объект типа Инженер.
     */
    public void practicalTraining(Engineer engineer) {
        int countOfSubjects = this.levelOfKnowledge.length;
        for (int i = 0; i < countOfSubjects; i++) {
            this.levelOfKnowledge[i] += engineer.getCategory() / 3;
        }
    }

}
