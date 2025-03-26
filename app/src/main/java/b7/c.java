package b7;

import U6.I;
import Z6.AbstractC0799m;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: z, reason: collision with root package name */
    public static final c f12043z = new c();

    private c() {
        super(l.f12056c, l.f12057d, l.f12058e, l.f12054a);
    }

    @Override // U6.AbstractC0726l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // U6.I
    public String toString() {
        return "Dispatchers.Default";
    }

    @Override // U6.I
    public I z0(int i8) {
        AbstractC0799m.a(i8);
        return i8 >= l.f12056c ? this : super.z0(i8);
    }
}
