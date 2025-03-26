package j2;

import h2.EnumC5832f;
import j2.AbstractC6067p;
import java.util.Arrays;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6055d extends AbstractC6067p {

    /* renamed from: a, reason: collision with root package name */
    private final String f38185a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38186b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC5832f f38187c;

    /* renamed from: j2.d$b */
    static final class b extends AbstractC6067p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38188a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38189b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC5832f f38190c;

        b() {
        }

        @Override // j2.AbstractC6067p.a
        public AbstractC6067p a() {
            String str = "";
            if (this.f38188a == null) {
                str = " backendName";
            }
            if (this.f38190c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6055d(this.f38188a, this.f38189b, this.f38190c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j2.AbstractC6067p.a
        public AbstractC6067p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f38188a = str;
            return this;
        }

        @Override // j2.AbstractC6067p.a
        public AbstractC6067p.a c(byte[] bArr) {
            this.f38189b = bArr;
            return this;
        }

        @Override // j2.AbstractC6067p.a
        public AbstractC6067p.a d(EnumC5832f enumC5832f) {
            if (enumC5832f == null) {
                throw new NullPointerException("Null priority");
            }
            this.f38190c = enumC5832f;
            return this;
        }
    }

    @Override // j2.AbstractC6067p
    public String b() {
        return this.f38185a;
    }

    @Override // j2.AbstractC6067p
    public byte[] c() {
        return this.f38186b;
    }

    @Override // j2.AbstractC6067p
    public EnumC5832f d() {
        return this.f38187c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6067p)) {
            return false;
        }
        AbstractC6067p abstractC6067p = (AbstractC6067p) obj;
        if (this.f38185a.equals(abstractC6067p.b())) {
            if (Arrays.equals(this.f38186b, abstractC6067p instanceof C6055d ? ((C6055d) abstractC6067p).f38186b : abstractC6067p.c()) && this.f38187c.equals(abstractC6067p.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f38185a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38186b)) * 1000003) ^ this.f38187c.hashCode();
    }

    private C6055d(String str, byte[] bArr, EnumC5832f enumC5832f) {
        this.f38185a = str;
        this.f38186b = bArr;
        this.f38187c = enumC5832f;
    }
}
