package p4;

import java.util.List;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class y extends AbstractC6384F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List f40814a;

    static final class b extends AbstractC6384F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List f40815a;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.f.a
        public AbstractC6384F.e.d.f a() {
            List list = this.f40815a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // p4.AbstractC6384F.e.d.f.a
        public AbstractC6384F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f40815a = list;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.f
    public List b() {
        return this.f40814a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6384F.e.d.f) {
            return this.f40814a.equals(((AbstractC6384F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f40814a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f40814a + "}";
    }

    private y(List list) {
        this.f40814a = list;
    }
}
