package ua.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DoctorTest {

    int[] levelOfKnowledge = {0, 0, 0, 0, 0};
    int[] studentsRecordBook = {0, 0, 0, 0, 0};

    Doctor doctor = new Doctor("Third", "Helen", 'F', 30,
            "Holy Spirit Hospital", "doctor", "therapist",
            2, 1, "tonometer", 8, true);

    Student student = new Student("Smith", "Peter", 'M', 21,
            "Temple University", "student",
            "Discrete mathematics and mathematical cybernetics", 2,
            "Temple University College of Science and Technology", false, levelOfKnowledge,
            studentsRecordBook);

    Teacher teacher = new Teacher("First", "John B.", 'M', 35,
            "Temple University", "teacher", "mathematics and computer science",
            3, 1, "Highest Mathematics", 80, false);

    @Test
    public void ifEquipmentIsOkThenDoctorTreatOfIllStudent() {
        doctor.treatment(student);
        boolean result = student.getIsHealthy();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void ifEquipmentIsBrokenThenDoctorDoesNotTreatOfIllStudent() {
        doctor.setIsEquipmentOk(false);
        doctor.treatment(student);
        boolean result = student.getIsHealthy();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void ifEquipmentIsOkThenDoctorConductsMedicalInspectionOfTeacher() {
        doctor.medicalInspection(teacher);
        boolean result = teacher.getMedicalCheckValid();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void ifEquipmentIsBrokenThenDoctorDoesNotConductsMedicalInspectionOfTeacher() {
        doctor.setIsEquipmentOk(false);
        doctor.medicalInspection(teacher);
        boolean result = teacher.getMedicalCheckValid();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void ifDoctorAddsPillsThenItsReservesIncrease() {
        doctor.addPills();
        int result = doctor.getPillsCount();
        int expected = 11;
    }

}