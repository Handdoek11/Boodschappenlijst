package D4;

import com.google.firebase.encoders.EncodingException;

/* loaded from: classes2.dex */
class i implements A4.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2094a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2095b = false;

    /* renamed from: c, reason: collision with root package name */
    private A4.b f2096c;

    /* renamed from: d, reason: collision with root package name */
    private final f f2097d;

    i(f fVar) {
        this.f2097d = fVar;
    }

    private void a() {
        if (this.f2094a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f2094a = true;
    }

    @Override // A4.f
    public A4.f b(String str) {
        a();
        this.f2097d.i(this.f2096c, str, this.f2095b);
        return this;
    }

    void c(A4.b bVar, boolean z7) {
        this.f2094a = false;
        this.f2096c = bVar;
        this.f2095b = z7;
    }

    @Override // A4.f
    public A4.f d(boolean z7) {
        a();
        this.f2097d.o(this.f2096c, z7, this.f2095b);
        return this;
    }
}
