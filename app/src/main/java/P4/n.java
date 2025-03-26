package p4;

import java.util.List;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class n extends AbstractC6384F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f40722a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6384F.e.d.a.b.c f40723b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6384F.a f40724c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6384F.e.d.a.b.AbstractC0310d f40725d;

    /* renamed from: e, reason: collision with root package name */
    private final List f40726e;

    static final class b extends AbstractC6384F.e.d.a.b.AbstractC0308b {

        /* renamed from: a, reason: collision with root package name */
        private List f40727a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC6384F.e.d.a.b.c f40728b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC6384F.a f40729c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC6384F.e.d.a.b.AbstractC0310d f40730d;

        /* renamed from: e, reason: collision with root package name */
        private List f40731e;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b a() {
            List list;
            AbstractC6384F.e.d.a.b.AbstractC0310d abstractC0310d = this.f40730d;
            if (abstractC0310d != null && (list = this.f40731e) != null) {
                return new n(this.f40727a, this.f40728b, this.f40729c, abstractC0310d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40730d == null) {
                sb.append(" signal");
            }
            if (this.f40731e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b.AbstractC0308b b(AbstractC6384F.a aVar) {
            this.f40729c = aVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b.AbstractC0308b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f40731e = list;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b.AbstractC0308b d(AbstractC6384F.e.d.a.b.c cVar) {
            this.f40728b = cVar;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b.AbstractC0308b e(AbstractC6384F.e.d.a.b.AbstractC0310d abstractC0310d) {
            if (abstractC0310d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f40730d = abstractC0310d;
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.b.AbstractC0308b
        public AbstractC6384F.e.d.a.b.AbstractC0308b f(List list) {
            this.f40727a = list;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.b
    public AbstractC6384F.a b() {
        return this.f40724c;
    }

    @Override // p4.AbstractC6384F.e.d.a.b
    public List c() {
        return this.f40726e;
    }

    @Override // p4.AbstractC6384F.e.d.a.b
    public AbstractC6384F.e.d.a.b.c d() {
        return this.f40723b;
    }

    @Override // p4.AbstractC6384F.e.d.a.b
    public AbstractC6384F.e.d.a.b.AbstractC0310d e() {
        return this.f40725d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.b)) {
            return false;
        }
        AbstractC6384F.e.d.a.b bVar = (AbstractC6384F.e.d.a.b) obj;
        List list = this.f40722a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            AbstractC6384F.e.d.a.b.c cVar = this.f40723b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                AbstractC6384F.a aVar = this.f40724c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f40725d.equals(bVar.e()) && this.f40726e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p4.AbstractC6384F.e.d.a.b
    public List f() {
        return this.f40722a;
    }

    public int hashCode() {
        List list = this.f40722a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC6384F.e.d.a.b.c cVar = this.f40723b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC6384F.a aVar = this.f40724c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f40725d.hashCode()) * 1000003) ^ this.f40726e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f40722a + ", exception=" + this.f40723b + ", appExitInfo=" + this.f40724c + ", signal=" + this.f40725d + ", binaries=" + this.f40726e + "}";
    }

    private n(List list, AbstractC6384F.e.d.a.b.c cVar, AbstractC6384F.a aVar, AbstractC6384F.e.d.a.b.AbstractC0310d abstractC0310d, List list2) {
        this.f40722a = list;
        this.f40723b = cVar;
        this.f40724c = aVar;
        this.f40725d = abstractC0310d;
        this.f40726e = list2;
    }
}
