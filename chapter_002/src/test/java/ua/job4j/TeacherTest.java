package ua.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TeacherTest {

    int[] levelOfKnowledge = {0, 0, 0, 0, 0};
    int[] studentsRecordBook = {0, 0, 0, 0, 0};

    Teacher teacher = new Teacher("First", "John B.", 'M', 35,
            "Temple University", "teacher", "mathematics and computer science",
            3, 0, "Highest Mathematics", 80, true);

    Teacher anotherTeacher = new Teacher("Paganel", "Jacques", 'M', 31,
            "Temple University", "teacher", "entomologist",
            1, 12, "Entomology", 25, true);

    Student student = new Student("Smith", "Peter", 'M', 21,
            "Temple University", "student",
            "Discrete mathematics and mathematical cybernetics", 2,
            "Temple University College of Science and Technology", true, levelOfKnowledge,
            studentsRecordBook);

    @Test
    public void ifTeacherGiveLectureToStudentThenLevelOfKnowledgeIncrease() {
        teacher.giveLecture(student);
        int result = student.getLevelOfKnowledge()[0];
        int expected = 80;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherGiveLectureToIllStudentThenLevelOfKnowledgeNotIncrease() {
        student.setIsHealthy(false);
        teacher.giveLecture(student);
        int result = student.getLevelOfKnowledge()[0];
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherGivesLectureToStudentOnSubjectThatHeDoesNotStudyThenLevelOfKnowledgeNotIncrease() {
        anotherTeacher.giveLecture(student);
        int result = student.getLevelOfKnowledge()[0];
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherExamineOfStudentAndHisLevelOfKnowledgeIsHigherThanSubjectHoursThenMarkIsFive() {
        int[] levelOfKnowledge = {100, 0, 0, 0, 0};
        student.setLevelOfKnowledge(levelOfKnowledge);
        teacher.examineStudents(student);
        int result = student.getStudentsRecordBook()[0];
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherExamineOfStudentAndHisLevelOfKnowledgeIsEqualsSubjectHoursThenMarkIsFour() {
        int[] levelOfKnowledge = {80, 0, 0, 0, 0};
        student.setLevelOfKnowledge(levelOfKnowledge);
        teacher.examineStudents(student);
        int result = student.getStudentsRecordBook()[0];
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherExamineOfStudentAndHisLevelOfKnowledgeIsZeroThenMarkIsTwo() {
        int[] levelOfKnowledge = {0, 0, 0, 0, 0};
        student.setLevelOfKnowledge(levelOfKnowledge);
        teacher.examineStudents(student);
        int result = student.getStudentsRecordBook()[0];
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherExamineOfStudentAndHisLevelOfKnowledgeIsLessThenSubjectHoursMarkIsThree() {
        int[] levelOfKnowledge = {25, 0, 0, 0, 0};
        student.setLevelOfKnowledge(levelOfKnowledge);
        teacher.examineStudents(student);
        int result = student.getStudentsRecordBook()[0];
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void ifTeacherExamineOfStudentOnSubjectThatHeDoesNotStudyThenStudentsRecordBookDoesNotChange() {
        anotherTeacher.examineStudents(student);
        int[] result = student.getStudentsRecordBook();
        int[] expected = {0, 0, 0, 0, 0};
        assertThat(result, is(expected));
    }

}