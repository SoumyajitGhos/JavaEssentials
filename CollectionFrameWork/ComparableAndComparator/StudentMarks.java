package ComparableAndComparator;

public class StudentMarks implements Comparable<StudentMarks>{
    private int maths;
    private int physics;
    
    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
    }
    

    public void setMaths(int maths) {
        this.maths = maths;
    }
    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getMaths() {
        return maths;
    }
    public int getPhysics() {
        return physics;
    }

    @Override
    public int compareTo(StudentMarks o) {
        /*
         * There can be 3 instances
         * i)  current object < other object return -1
         * ii) current object > other object return 1
         * iii) current object == other object return 0
         */
        /*
         * if (this.maths < o.maths) return -1;
           else if(this.maths > o.maths) return 1;
           else if(this.maths == o.maths) return 0;
         */
        return o.maths - this.maths;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maths;
        result = prime * result + physics;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        StudentMarks other = (StudentMarks) obj;
        if(maths != other.maths) return false;
        if(physics != other.physics) return false;
        return true;
    }
}
