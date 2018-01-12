package ua.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EngineerTest {

    Engineer engineer = new Engineer("Second", "Michael", 'M', 32,
            "Municipal Research Center", "engineer", "repair of high-precision electronics",
            5, "Diploma of Temple Univrsity Master's degree in electronics", 9);

    Doctor doctor = new Doctor("Third", "Helen", 'F', 30,
            "Holy Spirit Hospital", "doctor", "therapist",
            2, 1, "tonometer", 8, false);

    Doctor anotherDoctor = new Doctor("Fouth", "Mark N.", 'M', 50,
            "Holy Spirit Hospital", "doctor", "therapist",
            2, 1, "microscope", 12, false);

    @Test
    public void ifEngineersCategoryHigerThanLevelOfMedicalEquipmentThenHeRepairOfEquipment() {
        engineer.repairOfEquipment(doctor);
        boolean result = doctor.getIsEquipmentOk();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void ifEngineersCategoryLowerThanLevelOfMedicalEquipmentThenHeDoesNotRepairOfEquipment() {
        engineer.repairOfEquipment(anotherDoctor);
        boolean result = anotherDoctor.getIsEquipmentOk();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void ifEngineerDoesResearchWorkThenHisCategoryIncreases() {
        engineer.researchWork();
        int result = engineer.getCategory();
        int expected = 10;
        assertThat(result, is(expected));
    }

}