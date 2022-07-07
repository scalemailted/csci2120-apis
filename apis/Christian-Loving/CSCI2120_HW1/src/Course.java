/**
 * @author christianl
 * @apiNote The purpose of this class is to create an object of a golf course
 */
public abstract class Course {
    protected int holeNum;
    protected int score;
    protected String nameCourse;

    /**
     * @param holeNum
     * @param score
     * @param nameCourse
     */
    public Course(int holeNum, String nameCourse, int score) {
        this.holeNum = holeNum;
        this.nameCourse = nameCourse;
        this.score = score;
    }

    /**
     * @return the holeNum
     */
    public int getHoleNum() {
        return holeNum;
    }

    /**
     * @param holeNum the holeNum to set
     */
    public void setHoleNum(int holeNum) {
        this.holeNum = holeNum;
    }

    /**
     * @return the name of the course
     */
    public String getNameCourse() {
        return nameCourse;
    }

    /**
     * @param nameCourse the course name
     */
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}
