package p4;

import java.util.List;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class r extends AbstractC6384F.e.d.a.b.AbstractC0312e {

    /* renamed from: a, reason: collision with root package name */
    private final String f40759a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40760b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40761c;

    static final class b extends AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a {

        /* renamed from: a, reason: collision with root package name */
        private String f40762a;

        /* renamed from: b, reason: collision with root package name */
        private int f40763b;

        /* renamed from: c, reason: collision with root package name */
        private List f40764c;

        /* renamed from: d, reason: collision with root package name */
        private byte f40765d;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a
        public AbstractC6384F.e.d.a.b.AbstractC0312e a() {
            String str;
            List list;
            if (this.f40765d == 1 && (str = this.f40762a) != null && (list = this.f40764c) != null) {
                return new r(str, this.f40763b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40762a == null) {
                sb.append(" name");
            }
            if ((1 & this.f40765d) == 0) {
                sb.append(" importance");
            }
            if (this.f40764c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f40764c = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a c(int i8) {
            this.f40763b = i8;
            this.f40765d = (byte) (this.f40765d | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a
        public AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f40762a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e
    public List b() {
        return this.f40761c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e
    public int c() {
        return this.f40760b;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0312e
    public String d() {
        return this.f40759a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b.AbstractC0312e)) {
            return false;
        }
        AbstractC6384F.e.d.a.b.AbstractC0312e abstractC0312e = (AbstractC6384F.e.d.a.b.AbstractC0312e) obj;
        return this.f40759a.equals(abstractC0312e.d()) && this.f40760b == abstractC0312e.c() && this.f40761c.equals(abstractC0312e.b());
    }

    public int hashCode() {
        return ((((this.f40759a.hashCode() ^ 1000003) * 1000003) ^ this.f40760b) * 1000003) ^ this.f40761c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f40759a + ", importance=" + this.f40760b + ", frames=" + this.f40761c + "}";
    }

    private r(String str, int i8, List list) {
        this.f40759a = str;
        this.f40760b = i8;
        this.f40761c = list;
    }
}
