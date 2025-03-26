package j2;

import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import j2.AbstractC6066o;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6054c extends AbstractC6066o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6067p f38175a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38176b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5830d f38177c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5834h f38178d;

    /* renamed from: e, reason: collision with root package name */
    private final C5829c f38179e;

    /* renamed from: j2.c$b */
    static final class b extends AbstractC6066o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC6067p f38180a;

        /* renamed from: b, reason: collision with root package name */
        private String f38181b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5830d f38182c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC5834h f38183d;

        /* renamed from: e, reason: collision with root package name */
        private C5829c f38184e;

        b() {
        }

        @Override // j2.AbstractC6066o.a
        public AbstractC6066o a() {
            String str = "";
            if (this.f38180a == null) {
                str = " transportContext";
            }
            if (this.f38181b == null) {
                str = str + " transportName";
            }
            if (this.f38182c == null) {
                str = str + " event";
            }
            if (this.f38183d == null) {
                str = str + " transformer";
            }
            if (this.f38184e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6054c(this.f38180a, this.f38181b, this.f38182c, this.f38183d, this.f38184e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j2.AbstractC6066o.a
        AbstractC6066o.a b(C5829c c5829c) {
            if (c5829c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f38184e = c5829c;
            return this;
        }

        @Override // j2.AbstractC6066o.a
        AbstractC6066o.a c(AbstractC5830d abstractC5830d) {
            if (abstractC5830d == null) {
                throw new NullPointerException("Null event");
            }
            this.f38182c = abstractC5830d;
            return this;
        }

        @Override // j2.AbstractC6066o.a
        AbstractC6066o.a d(InterfaceC5834h interfaceC5834h) {
            if (interfaceC5834h == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f38183d = interfaceC5834h;
            return this;
        }

        @Override // j2.AbstractC6066o.a
        public AbstractC6066o.a e(AbstractC6067p abstractC6067p) {
            if (abstractC6067p == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f38180a = abstractC6067p;
            return this;
        }

        @Override // j2.AbstractC6066o.a
        public AbstractC6066o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f38181b = str;
            return this;
        }
    }

    @Override // j2.AbstractC6066o
    public C5829c b() {
        return this.f38179e;
    }

    @Override // j2.AbstractC6066o
    AbstractC5830d c() {
        return this.f38177c;
    }

    @Override // j2.AbstractC6066o
    InterfaceC5834h e() {
        return this.f38178d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6066o)) {
            return false;
        }
        AbstractC6066o abstractC6066o = (AbstractC6066o) obj;
        return this.f38175a.equals(abstractC6066o.f()) && this.f38176b.equals(abstractC6066o.g()) && this.f38177c.equals(abstractC6066o.c()) && this.f38178d.equals(abstractC6066o.e()) && this.f38179e.equals(abstractC6066o.b());
    }

    @Override // j2.AbstractC6066o
    public AbstractC6067p f() {
        return this.f38175a;
    }

    @Override // j2.AbstractC6066o
    public String g() {
        return this.f38176b;
    }

    public int hashCode() {
        return ((((((((this.f38175a.hashCode() ^ 1000003) * 1000003) ^ this.f38176b.hashCode()) * 1000003) ^ this.f38177c.hashCode()) * 1000003) ^ this.f38178d.hashCode()) * 1000003) ^ this.f38179e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f38175a + ", transportName=" + this.f38176b + ", event=" + this.f38177c + ", transformer=" + this.f38178d + ", encoding=" + this.f38179e + "}";
    }

    private C6054c(AbstractC6067p abstractC6067p, String str, AbstractC5830d abstractC5830d, InterfaceC5834h interfaceC5834h, C5829c c5829c) {
        this.f38175a = abstractC6067p;
        this.f38176b = str;
        this.f38177c = abstractC5830d;
        this.f38178d = interfaceC5834h;
        this.f38179e = c5829c;
    }
}
