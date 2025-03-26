package S3;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f5084a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0100a f5085b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5086c;

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0100a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0100a interfaceC0100a, Typeface typeface) {
        this.f5084a = typeface;
        this.f5085b = interfaceC0100a;
    }

    private void d(Typeface typeface) {
        if (this.f5086c) {
            return;
        }
        this.f5085b.a(typeface);
    }

    @Override // S3.f
    public void a(int i8) {
        d(this.f5084a);
    }

    @Override // S3.f
    public void b(Typeface typeface, boolean z7) {
        d(typeface);
    }

    public void c() {
        this.f5086c = true;
    }
}
