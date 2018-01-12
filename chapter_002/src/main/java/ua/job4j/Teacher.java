package ua.job4j;

/**
 * Class Teacher - класс описывает поведение объектов типа Преподаватель.
 *
 * @author vfrundin
 * @version 1.0
 * @since 29.12.2017
 */
public class Teacher extends Profession {

    private int subjectId;              // Id предмета который читает преподаватель
    private String subjectName;         // название предмета который читает преподаватель
    private int subjectHours;           // количество лекционных часов по предмету который читает преподаватель
    private boolean medicalCheckValid;  // признак актуальности справки о прохождении медкомиссии

    /**
     * Конструктор для объекта класса Teacher.
     *
     * Для инициализации наследованных полей использует констрктор родительского класса.
     * @param subjectId         Id предмета который читает преподаватель.
     * @param subjectName       название предмета который читает преподаватель.
     * @param subjectHours      количество лекционных часов по предмету который читает преподаватель.
     * @param medicalCheckValid признак актуальности справки о прохождении медкомиссии
     *                          (истина - справка актуальна, ложь - справка устарела).
     */
    public Teacher(String surname, String name, char gender, int age, String organization,
                   String professionName, String speciality, int workExperience, int subjectId,
                   String subjectName, int subjectHours, boolean medicalCheckValid) {
        super(surname, name, gender, age, organization, professionName, speciality, workExperience);
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectHours = subjectHours;
        this.medicalCheckValid = medicalCheckValid;
    }

    /**
     * Метод getSubjectId - возвращает Id предмета, который читает преподаватель.
     *
     * @return subjectId - Id предмета, который читает преподаватель.
     */
    public int getSubjectId() {
        return subjectId;
    }

    /**
     * Метод getMedicalCheckValid - возвращает признак актуальности справки о прохождении медкомиссии.
     *
     * @return medicalCheckValid - признак актуальности справки о прохождении медкомиссии.
     */
    public boolean getMedicalCheckValid() {
        return medicalCheckValid;
    }

    /**
     * Метод setMedicalCheckValid - устанавливает значение признака актуальности справки о прохождении медкомиссии.
     *
     * @param medicalCheckValid признак актуальности справки о прохождении медкомиссии.
     */
    public void setMedicalCheckValid(boolean medicalCheckValid) {
        this.medicalCheckValid = medicalCheckValid;
    }

    /**
     * Метод giveLecture - преподаватель начитывает студенту лекции по предмету.
     *
     * @param student объект типа Студент.
     * Прослушивание лекций повышает уровень знаний студента (изменяет значение ячейки в массиве levelOfKnowledge).
     * Студент может посещать лекции по предметам, которые он изучает (subjectId является допустимым индексом
     * массива levelOfKnowledge) и только если он здоров (значение поля isHealthy - true).
     * Если студент болен или с бодуна притопал не к тому преподавателю, то прослушивание лекции не улучшит
     * уровень его знаний.
     */
    public void giveLecture(Student student) {
        int[] levelOfKnowledge = student.getLevelOfKnowledge();
        if (student.getIsHealthy() && subjectId < levelOfKnowledge.length) {
            levelOfKnowledge[subjectId] += this.subjectHours;
            student.setLevelOfKnowledge(levelOfKnowledge);
        }
    }

    /**
     * Метод examineStudents - преподаватель принимает экзамен у студента по предмету.
     *
     * @param student объект типа Студент.
     * Оценка за экзамен проставляется в зачетку студента (изменяет значение ячейки в массиве studentsRecordBook).
     * Студент не может сдать экзамен по предмету, которого у него нет в зачетке.
     */
    public void examineStudents(Student student) {
        int[] levelOfKnowledge = student.getLevelOfKnowledge();
        int[] studentsRecordBook = student.getStudentsRecordBook();
        if (subjectId < levelOfKnowledge.length) {
            if (levelOfKnowledge[subjectId] > subjectHours) {
                studentsRecordBook[subjectId] = 5;
            } else if (levelOfKnowledge[subjectId] == this.subjectHours) {
                studentsRecordBook[subjectId] = 4;
            } else if (levelOfKnowledge[subjectId] <= 0) {
                studentsRecordBook[subjectId] = 2;
            } else {
                studentsRecordBook[subjectId] = 3;
            }
            student.setStudentsRecordBook(studentsRecordBook);
        }
    }

}
