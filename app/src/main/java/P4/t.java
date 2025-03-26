package p4;

import p4.AbstractC6384F;

/* loaded from: classes2.dex */
final class t extends AbstractC6384F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40777a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40778b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40779c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40780d;

    static final class b extends AbstractC6384F.e.d.a.c.AbstractC0316a {

        /* renamed from: a, reason: collision with root package name */
        private String f40781a;

        /* renamed from: b, reason: collision with root package name */
        private int f40782b;

        /* renamed from: c, reason: collision with root package name */
        private int f40783c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f40784d;

        /* renamed from: e, reason: collision with root package name */
        private byte f40785e;

        b() {
        }

        @Override // p4.AbstractC6384F.e.d.a.c.AbstractC0316a
        public AbstractC6384F.e.d.a.c a() {
            String str;
            if (this.f40785e == 7 && (str = this.f40781a) != null) {
                return new t(str, this.f40782b, this.f40783c, this.f40784d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40781a == null) {
                sb.append(" processName");
            }
            if ((this.f40785e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f40785e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f40785e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.e.d.a.c.AbstractC0316a
        public AbstractC6384F.e.d.a.c.AbstractC0316a b(boolean z7) {
            this.f40784d = z7;
            this.f40785e = (byte) (this.f40785e | 4);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.c.AbstractC0316a
        public AbstractC6384F.e.d.a.c.AbstractC0316a c(int i8) {
            this.f40783c = i8;
            this.f40785e = (byte) (this.f40785e | 2);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.c.AbstractC0316a
        public AbstractC6384F.e.d.a.c.AbstractC0316a d(int i8) {
            this.f40782b = i8;
            this.f40785e = (byte) (this.f40785e | 1);
            return this;
        }

        @Override // p4.AbstractC6384F.e.d.a.c.AbstractC0316a
        public AbstractC6384F.e.d.a.c.AbstractC0316a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f40781a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.e.d.a.c
    public int b() {
        return this.f40779c;
    }

    @Override // p4.AbstractC6384F.e.d.a.c
    public int c() {
        return this.f40778b;
    }

    @Override // p4.AbstractC6384F.e.d.a.c
    public String d() {
        return this.f40777a;
    }

    @Override // p4.AbstractC6384F.e.d.a.c
    public boolean e() {
        return this.f40780d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.e.d.a.c)) {
            return false;
        }
        AbstractC6384F.e.d.a.c cVar = (AbstractC6384F.e.d.a.c) obj;
        return this.f40777a.equals(cVar.d()) && this.f40778b == cVar.c() && this.f40779c == cVar.b() && this.f40780d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f40777a.hashCode() ^ 1000003) * 1000003) ^ this.f40778b) * 1000003) ^ this.f40779c) * 1000003) ^ (this.f40780d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f40777a + ", pid=" + this.f40778b + ", importance=" + this.f40779c + ", defaultProcess=" + this.f40780d + "}";
    }

    private t(String str, int i8, int i9, boolean z7) {
        this.f40777a = str;
        this.f40778b = i8;
        this.f40779c = i9;
        this.f40780d = z7;
    }
}
