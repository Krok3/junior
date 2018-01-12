package ua.job4j;

/**
 * Class Engineer - класс описывает поведение объектов типа Инженер.
 *
 * @author vfrundin
 * @version 1.0
 * @since 30.12.2017
 */
public class Engineer extends Profession {

    private String diploma;     // диплом инженера
    private int category;       // категория инженера

    /**
     * Конструктор для объекта класса Engineer.
     *
     * Для инициализации наследованных полей использует констрктор родительского класса.
     * @param diploma диплом инженера.
     * @param category категория инженера.
     */
    public Engineer(String surname, String name, char gender, int age, String organization,
                   String professionName, String speciality, int workExperience,
                   String diploma, int category) {
        super(surname, name, gender, age, organization, professionName, speciality, workExperience);
        this.diploma = diploma;
        this.category = category;
    }

    /**
     * Метод getCategory - возвращает категорию инженера.
     *
     * @return category - категория инженера.
     */
    public int getCategory() {
        return category;
    }

    /**
     * Метод repairOfEquipment - инженер выполняет починку медицинского оборудования доктора.
     * Ремонт медицинского оборудования будет успешным, если значение категории инженера (category) больше
     * или равно значению уровня сложности медицинского оборудования доктора (levelOfEquipment).
     * В противном случае, медицинское оборудование останется неисправным.
     *
     * @param doctor экземпляр класса Доктор.
     */
    public void repairOfEquipment(Doctor doctor) {
        boolean isEquipmentOk = doctor.getIsEquipmentOk();
        if (!isEquipmentOk && category >= doctor.getLevelOfEquipment()) {
                isEquipmentOk = true;
        }
        doctor.setIsEquipmentOk(isEquipmentOk);
    }

    /**
     * Метод researchWork - инженер проводит научно- исследовательскую работу, и этим повышает
     * свою категорию (category).
     * В противном случае, медицинское оборудование останется неисправным.
     */
    public void researchWork() {
        category++;
    }

}
