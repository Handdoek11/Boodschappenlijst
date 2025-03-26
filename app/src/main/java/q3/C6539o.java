package q3;

import com.google.firebase.encoders.EncodingException;

/* renamed from: q3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6539o implements A4.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42169a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42170b = false;

    /* renamed from: c, reason: collision with root package name */
    private A4.b f42171c;

    /* renamed from: d, reason: collision with root package name */
    private final C6507k f42172d;

    C6539o(C6507k c6507k) {
        this.f42172d = c6507k;
    }

    private final void c() {
        if (this.f42169a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f42169a = true;
    }

    final void a(A4.b bVar, boolean z7) {
        this.f42169a = false;
        this.f42171c = bVar;
        this.f42170b = z7;
    }

    @Override // A4.f
    public final A4.f b(String str) {
        c();
        this.f42172d.h(this.f42171c, str, this.f42170b);
        return this;
    }

    @Override // A4.f
    public final A4.f d(boolean z7) {
        c();
        this.f42172d.i(this.f42171c, z7 ? 1 : 0, this.f42170b);
        return this;
    }
}
