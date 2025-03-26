package q3;

import java.io.UnsupportedEncodingException;

/* renamed from: q3.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6569r6 implements InterfaceC6474f6 {

    /* renamed from: a, reason: collision with root package name */
    private final C6544o4 f42245a;

    /* renamed from: b, reason: collision with root package name */
    private E5 f42246b = new E5();

    private C6569r6(C6544o4 c6544o4, int i8) {
        this.f42245a = c6544o4;
        A6.a();
    }

    public static InterfaceC6474f6 e(C6544o4 c6544o4) {
        return new C6569r6(c6544o4, 0);
    }

    @Override // q3.InterfaceC6474f6
    public final String a() {
        G5 c8 = this.f42245a.f().c();
        return (c8 == null || AbstractC6486h2.b(c8.k())) ? "NA" : (String) Z2.r.l(c8.k());
    }

    @Override // q3.InterfaceC6474f6
    public final InterfaceC6474f6 b(E5 e52) {
        this.f42246b = e52;
        return this;
    }

    @Override // q3.InterfaceC6474f6
    public final InterfaceC6474f6 c(EnumC6536n4 enumC6536n4) {
        this.f42245a.d(enumC6536n4);
        return this;
    }

    @Override // q3.InterfaceC6474f6
    public final byte[] d(int i8, boolean z7) {
        this.f42246b.f(Boolean.valueOf(1 == (i8 ^ 1)));
        this.f42246b.e(Boolean.FALSE);
        this.f42245a.e(this.f42246b.m());
        try {
            A6.a();
            if (i8 == 0) {
                return new C4.d().j(C6559q3.f42226a).k(true).i().b(this.f42245a.f()).getBytes("utf-8");
            }
            C6560q4 f8 = this.f42245a.f();
            C6523m c6523m = new C6523m();
            C6559q3.f42226a.a(c6523m);
            return c6523m.b().a(f8);
        } catch (UnsupportedEncodingException e8) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e8);
        }
    }
}
