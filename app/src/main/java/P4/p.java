package p4;

import java.util.List;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class p extends AbstractC6384F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40741a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40742b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40743c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6384F.e.d.a.b.c f40744d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40745e;

    static final class b extends AbstractC6384F.e.d.a.b.c.AbstractC0309a {

        /* renamed from: a, reason: collision with root package name */
        private String f40746a;

        /* renamed from: b, reason: collision with root package name */
        private String f40747b;

        /* renamed from: c, reason: collision with root package name */
        private List f40748c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC6384F.e.d.a.b.c f40749d;

        /* renamed from: e, reason: collision with root package name */
        private int f40750e;

        /* renamed from: f, reason: collision with root package name */
        private byte f40751f;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f40751f == 1 && (str = this.f40746a) != null && (list = this.f40748c) != null) {
                return new p(str, this.f40747b, list, this.f40749d, this.f40750e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40746a == null) {
                sb.append(" type");
            }
            if (this.f40748c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f40751f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c.AbstractC0309a b(AbstractC6384F.e.d.a.b.c cVar) {
            this.f40749d = cVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c.AbstractC0309a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f40748c = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c.AbstractC0309a d(int i8) {
            this.f40750e = i8;
            this.f40751f = (byte) (this.f40751f | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c.AbstractC0309a e(String str) {
            this.f40747b = str;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.c.AbstractC0309a
        public AbstractC6384F.e.d.a.b.c.AbstractC0309a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f40746a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b.c
    public AbstractC6384F.e.d.a.b.c b() {
        return this.f40744d;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.c
    public List c() {
        return this.f40743c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.c
    public int d() {
        return this.f40745e;
    }

    @Override // p4.AbstractC6384F.e.d.a.b.c
    public String e() {
        return this.f40742b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC6384F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b.c)) {
            return false;
        }
        AbstractC6384F.e.d.a.b.c cVar2 = (AbstractC6384F.e.d.a.b.c) obj;
        return this.f40741a.equals(cVar2.f()) && ((str = this.f40742b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f40743c.equals(cVar2.c()) && ((cVar = this.f40744d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f40745e == cVar2.d();
    }

    @Override // p4.AbstractC6384F.e.d.a.b.c
    public String f() {
        return this.f40741a;
    }

    public int hashCode() {
        int hashCode = (this.f40741a.hashCode() ^ 1000003) * 1000003;
        String str = this.f40742b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f40743c.hashCode()) * 1000003;
        AbstractC6384F.e.d.a.b.c cVar = this.f40744d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f40745e;
    }

    public String toString() {
        return "Exception{type=" + this.f40741a + ", reason=" + this.f40742b + ", frames=" + this.f40743c + ", causedBy=" + this.f40744d + ", overflowCount=" + this.f40745e + "}";
    }

    private p(String str, String str2, List list, AbstractC6384F.e.d.a.b.c cVar, int i8) {
        this.f40741a = str;
        this.f40742b = str2;
        this.f40743c = list;
        this.f40744d = cVar;
        this.f40745e = i8;
    }
}
