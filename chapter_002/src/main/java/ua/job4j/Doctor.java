package ua.job4j;

/**
 * Class Doctor - класс описывает поведение объектов типа Доктор.
 *
 * @author vfrundin
 * @version 1.0
 * @since 30.12.2017
 */
public class Doctor extends Profession {

    private int pillsCount;             // количество лекарств у врача
    private String medicalEquipment;    // название медицинского оборудования, которое использует врач
    private int levelOfEquipment;       // уровень сложности медицинского оборудования
    private int countUsesOfEquipment;   // количество использований медицинского оборудования
    private boolean isEquipmentOk;      // признак исправности медицинского оборудования

    /**
     * Конструктор для объекта класса Doctor.
     *
     * Для инициализации наследованных полей использует констрктор родительского класса.
     * @param pillsCount количество лекарств у врача.
     * @param medicalEquipment название медицинского оборудования, которое использует врач.
     * @param levelOfEquipment уровень сложности медицинского оборудования.
     * @param isEquipmentOk признак исправности медицинского оборудования.
     */
    public Doctor(String surname, String name, char gender, int age, String organization,
                  String professionName, String speciality, int workExperience,
                  int pillsCount, String medicalEquipment, int levelOfEquipment, boolean isEquipmentOk) {
        super(surname, name, gender, age, organization, professionName, speciality, workExperience);
        this.pillsCount = pillsCount;
        this.medicalEquipment = medicalEquipment;
        this.levelOfEquipment = levelOfEquipment;
        this.countUsesOfEquipment = 0;
        this.isEquipmentOk = isEquipmentOk;
    }

    /**
     * Метод getPillsCount - возвращает количество лекарств у врача.
     *
     * @return pillsCount - количество лекарств у врача.
     */
    public int getPillsCount() {
        return pillsCount;
    }

    /**
     * Метод getLevelOfEquipment - возвращает уровень сложности медицинского оборудования.
     *
     * @return levelOfEquipment - уровень сложности медицинского оборудования.
     */
    public int getLevelOfEquipment() {
        return levelOfEquipment;
    }

    /**
     * Метод getIsEquipmentOk - возвращает признак исправности медицинского оборудования.
     *
     * @return isEquipmentOk - признак исправности медицинского оборудования.
     */
    public boolean getIsEquipmentOk() {
        return isEquipmentOk;
    }

    /**
     * Метод setIsEquipmentOk - устанавливает значение признака исправности медицинского оборудования.
     *
     * @param isEquipmentOk признак исправности медицинского оборудования.
     */
    public void setIsEquipmentOk(boolean isEquipmentOk) {
        this.isEquipmentOk = isEquipmentOk;
    }

    /**
     * Метод treatment - лечение заболевшего экземпляра класса Студент.
     * Проверяет болен ли студент (или просто хочет проволынить занятия ;)).
     * В случае если медицинское оборудование исправно и у доктора остались лекарства, излечивает студента
     * (присваивает признаку состояния здоровья студента isHealthy значение true).
     * В противном случае студент продолжает болеть.
     *
     * @param student объект типа Студент.
     */
    public void treatment(Student student) {
        boolean isHealthy = student.getIsHealthy();
        if (!isHealthy && isEquipmentOk && pillsCount > 0) {
            isHealthy = true;
            countUsesOfEquipment++;
            pillsCount--;
            isEquipmentOk = countUsesOfEquipment <= 100;
        }
        student.setIsHealthy(isHealthy);
    }

    /**
     * Метод medicalInspection - проводит медицинскую комиссию объекту класса Преподаватель.
     * В случае если срок действия медицинской справки у преподавателя истек и медицинское оборудование исправно,
     * выдает ему новую справку (присваивает признаку актуальности справки о прохождении медкомиссии преподавателя
     * medicalCheckValid значение true).
     *
     * @param teacher объект типа Преподаватель.
     */
    public void medicalInspection(Teacher teacher) {
        boolean medicalCheckValid = teacher.getMedicalCheckValid();
        if (!medicalCheckValid && isEquipmentOk) {
            teacher.setMedicalCheckValid(true);
            countUsesOfEquipment++;
            isEquipmentOk = countUsesOfEquipment <= 100;
        }
    }

    /**
     * Метод addPills - пополняет количество лекарств у доктора.
     * Увеличивает значение поля pillsCount.
     */
    public void addPills() {
        pillsCount += 10;
    }

}
