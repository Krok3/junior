package ua.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    int[] levelOfKnowledge = {0, 80, 0, 0, 0};
    int[] studentsRecordBook = {0, 0, 0, 0, 0};

    Student student = new Student("Smith", "Peter", 'M', 21,
            "Temple University", "student",
            "Discrete mathematics and mathematical cybernetics", 2,
            "Temple University College of Science and Technology", true, levelOfKnowledge,
            studentsRecordBook);

    Teacher teacher = new Teacher("First", "John B.", 'M', 35,
            "Temple University", "teacher", "mathematics and computer science",
            3, 1, "Highest Mathematics", 80, true);

    Engineer engineer = new Engineer("Second", "Michael", 'M', 32,
            "Municipal Research Center", "engineer",
            "repair of high-precision electronics", 5,
            "Diploma of Temple Univrsity Master's degree in electronics", 9);

    @Test
    public void ifStudentMakePresentationThenMethodReturnCorrectString() {
        String result = student.presentation();
        String expected = "Hello! I am Peter Smith. I'm a student. I study at the Temple University "
                + "at the Temple University College of Science and Technology. My speciality is Discrete mathematics "
                + "and mathematical cybernetics. I am a 2 year student.";
        assertThat(result, is(expected));
    }

    @Test
    public void ifStudentPrepareForExamThenHisLevelOfKnowledgeByThisSubjectIncrease() {
        student.prepareForExam(teacher);
        int result = student.getLevelOfKnowledge()[1];
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void ifStudentUndergoesPracticalTrainingThenHisLevelOfKnowledgeIncreasesInAllSubjects() {
        student.practicalTraining(engineer);
        int[] result = student.getLevelOfKnowledge();
        int[] expected = {3, 83, 3, 3, 3};
        assertThat(result, is(expected));
    }

}