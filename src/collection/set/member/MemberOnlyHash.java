package collection.set.member;

import java.util.Objects;

//HashCode 기능만 구현
public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        MemberOnlyHash that = (MemberOnlyHash) object;
//        return Objects.equals(getId(), that.getId());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
