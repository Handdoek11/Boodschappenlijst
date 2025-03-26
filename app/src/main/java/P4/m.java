package p4;

import java.util.List;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class m extends AbstractC6384F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6384F.e.d.a.b f40707a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40708b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40709c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f40710d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6384F.e.d.a.c f40711e;

    /* renamed from: f, reason: collision with root package name */
    private final List f40712f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40713g;

    static final class b extends AbstractC6384F.e.d.a.AbstractC0305a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC6384F.e.d.a.b f40714a;

        /* renamed from: b, reason: collision with root package name */
        private List f40715b;

        /* renamed from: c, reason: collision with root package name */
        private List f40716c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f40717d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC6384F.e.d.a.c f40718e;

        /* renamed from: f, reason: collision with root package name */
        private List f40719f;

        /* renamed from: g, reason: collision with root package name */
        private int f40720g;

        /* renamed from: h, reason: collision with root package name */
        private byte f40721h;

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a a() {
            AbstractC6384F.e.d.a.b bVar;
            if (this.f40721h == 1 && (bVar = this.f40714a) != null) {
                return new m(bVar, this.f40715b, this.f40716c, this.f40717d, this.f40718e, this.f40719f, this.f40720g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40714a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f40721h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a b(List list) {
            this.f40719f = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a c(Boolean bool) {
            this.f40717d = bool;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a d(AbstractC6384F.e.d.a.c cVar) {
            this.f40718e = cVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a e(List list) {
            this.f40715b = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a f(AbstractC6384F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f40714a = bVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a g(List list) {
            this.f40716c = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.AbstractC0305a
        public AbstractC6384F.e.d.a.AbstractC0305a h(int i8) {
            this.f40720g = i8;
            this.f40721h = (byte) (this.f40721h | 1);
            return this;
        }

        b() {
        }

        private b(AbstractC6384F.e.d.a aVar) {
            this.f40714a = aVar.f();
            this.f40715b = aVar.e();
            this.f40716c = aVar.g();
            this.f40717d = aVar.c();
            this.f40718e = aVar.d();
            this.f40719f = aVar.b();
            this.f40720g = aVar.h();
            this.f40721h = (byte) 1;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a
    public List b() {
        return this.f40712f;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public Boolean c() {
        return this.f40710d;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public AbstractC6384F.e.d.a.c d() {
        return this.f40711e;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public List e() {
        return this.f40708b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC6384F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a)) {
            return false;
        }
        AbstractC6384F.e.d.a aVar = (AbstractC6384F.e.d.a) obj;
        return this.f40707a.equals(aVar.f()) && ((list = this.f40708b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f40709c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f40710d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f40711e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f40712f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f40713g == aVar.h();
    }

    @Override // p4.AbstractC6384F.e.d.a
    public AbstractC6384F.e.d.a.b f() {
        return this.f40707a;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public List g() {
        return this.f40709c;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public int h() {
        return this.f40713g;
    }

    public int hashCode() {
        int hashCode = (this.f40707a.hashCode() ^ 1000003) * 1000003;
        List list = this.f40708b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f40709c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f40710d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC6384F.e.d.a.c cVar = this.f40711e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f40712f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f40713g;
    }

    @Override // p4.AbstractC6384F.e.d.a
    public AbstractC6384F.e.d.a.AbstractC0305a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f40707a + ", customAttributes=" + this.f40708b + ", internalKeys=" + this.f40709c + ", background=" + this.f40710d + ", currentProcessDetails=" + this.f40711e + ", appProcessDetails=" + this.f40712f + ", uiOrientation=" + this.f40713g + "}";
    }

    private m(AbstractC6384F.e.d.a.b bVar, List list, List list2, Boolean bool, AbstractC6384F.e.d.a.c cVar, List list3, int i8) {
        this.f40707a = bVar;
        this.f40708b = list;
        this.f40709c = list2;
        this.f40710d = bool;
        this.f40711e = cVar;
        this.f40712f = list3;
        this.f40713g = i8;
    }
}
