package D4;

import D4.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f2068a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f2069b = d.a.DEFAULT;

    /* renamed from: D4.a$a, reason: collision with other inner class name */
    private static final class C0028a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f2070a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f2071b;

        C0028a(int i8, d.a aVar) {
            this.f2070a = i8;
            this.f2071b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f2070a == dVar.tag() && this.f2071b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f2070a) + (this.f2071b.hashCode() ^ 2041407134);
        }

        @Override // D4.d
        public d.a intEncoding() {
            return this.f2071b;
        }

        @Override // D4.d
        public int tag() {
            return this.f2070a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2070a + "intEncoding=" + this.f2071b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0028a(this.f2068a, this.f2069b);
    }

    public a c(int i8) {
        this.f2068a = i8;
        return this;
    }
}
