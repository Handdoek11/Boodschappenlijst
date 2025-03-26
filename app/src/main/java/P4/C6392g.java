package p4;

import java.util.Arrays;
import p4.AbstractC6384F;

/* renamed from: p4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6392g extends AbstractC6384F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f40634a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40635b;

    /* renamed from: p4.g$b */
    static final class b extends AbstractC6384F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f40636a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40637b;

        b() {
        }

        @Override // p4.AbstractC6384F.d.b.a
        public AbstractC6384F.d.b a() {
            byte[] bArr;
            String str = this.f40636a;
            if (str != null && (bArr = this.f40637b) != null) {
                return new C6392g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f40636a == null) {
                sb.append(" filename");
            }
            if (this.f40637b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p4.AbstractC6384F.d.b.a
        public AbstractC6384F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f40637b = bArr;
            return this;
        }

        @Override // p4.AbstractC6384F.d.b.a
        public AbstractC6384F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f40636a = str;
            return this;
        }
    }

    @Override // p4.AbstractC6384F.d.b
    public byte[] b() {
        return this.f40635b;
    }

    @Override // p4.AbstractC6384F.d.b
    public String c() {
        return this.f40634a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384F.d.b)) {
            return false;
        }
        AbstractC6384F.d.b bVar = (AbstractC6384F.d.b) obj;
        if (this.f40634a.equals(bVar.c())) {
            if (Arrays.equals(this.f40635b, bVar instanceof C6392g ? ((C6392g) bVar).f40635b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f40634a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40635b);
    }

    public String toString() {
        return "File{filename=" + this.f40634a + ", contents=" + Arrays.toString(this.f40635b) + "}";
    }

    private C6392g(String str, byte[] bArr) {
        this.f40634a = str;
        this.f40635b = bArr;
    }
}
