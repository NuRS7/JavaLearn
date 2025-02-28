package JavaRush;

import java.util.Objects;

public class J51 {
    private long SubjectID;
    private String SubjectName;

    public J51(long SubjectID, String SubjectName) {
        this.SubjectID = SubjectID;
        this.SubjectName = SubjectName;

    }

    public long getSubjectID() {
        return SubjectID;
    }

    public void setSubjectID(long subjectID) {
        SubjectID = subjectID;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        J51 subject = (J51) o;
        return SubjectID == subject.SubjectID && Objects.equals(SubjectName, subject.SubjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SubjectID, SubjectName);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "SubjectID=" + SubjectID +
                ", SubjectName='" + SubjectName + '\'' +
                '}';
    }

    public class Action {

        public void operation() {

        }

        public void operationOther() {

        }
    }
}

