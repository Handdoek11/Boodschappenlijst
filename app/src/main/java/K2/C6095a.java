package k2;

import java.util.Arrays;
import k2.f;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6095a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f38490a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38491b;

    /* renamed from: k2.a$b */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f38492a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38493b;

        b() {
        }

        @Override // k2.f.a
        public f a() {
            String str = "";
            if (this.f38492a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6095a(this.f38492a, this.f38493b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k2.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f38492a = iterable;
            return this;
        }

        @Override // k2.f.a
        public f.a c(byte[] bArr) {
            this.f38493b = bArr;
            return this;
        }
    }

    @Override // k2.f
    public Iterable b() {
        return this.f38490a;
    }

    @Override // k2.f
    public byte[] c() {
        return this.f38491b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f38490a.equals(fVar.b())) {
            if (Arrays.equals(this.f38491b, fVar instanceof C6095a ? ((C6095a) fVar).f38491b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38490a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38491b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f38490a + ", extras=" + Arrays.toString(this.f38491b) + "}";
    }

    private C6095a(Iterable iterable, byte[] bArr) {
        this.f38490a = iterable;
        this.f38491b = bArr;
    }
}
