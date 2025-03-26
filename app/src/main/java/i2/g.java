package i2;

import i2.q;
import java.util.Arrays;

/* loaded from: classes.dex */
final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f36400a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36401b;

    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f36402a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f36403b;

        b() {
        }

        @Override // i2.q.a
        public q a() {
            return new g(this.f36402a, this.f36403b);
        }

        @Override // i2.q.a
        public q.a b(byte[] bArr) {
            this.f36402a = bArr;
            return this;
        }

        @Override // i2.q.a
        public q.a c(byte[] bArr) {
            this.f36403b = bArr;
            return this;
        }
    }

    @Override // i2.q
    public byte[] b() {
        return this.f36400a;
    }

    @Override // i2.q
    public byte[] c() {
        return this.f36401b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z7 = qVar instanceof g;
        if (Arrays.equals(this.f36400a, z7 ? ((g) qVar).f36400a : qVar.b())) {
            if (Arrays.equals(this.f36401b, z7 ? ((g) qVar).f36401b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f36400a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36401b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f36400a) + ", encryptedBlob=" + Arrays.toString(this.f36401b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f36400a = bArr;
        this.f36401b = bArr2;
    }
}
