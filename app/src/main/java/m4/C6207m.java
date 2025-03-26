package m4;

import S4.b;

/* renamed from: m4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6207m implements S4.b {

    /* renamed from: a, reason: collision with root package name */
    private final E f39076a;

    /* renamed from: b, reason: collision with root package name */
    private final C6206l f39077b;

    public C6207m(E e8, s4.g gVar) {
        this.f39076a = e8;
        this.f39077b = new C6206l(gVar);
    }

    @Override // S4.b
    public void a(b.C0102b c0102b) {
        j4.g.f().b("App Quality Sessions session changed: " + c0102b);
        this.f39077b.h(c0102b.a());
    }

    @Override // S4.b
    public boolean b() {
        return this.f39076a.d();
    }

    @Override // S4.b
    public b.a c() {
        return b.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f39077b.c(str);
    }

    public void e(String str) {
        this.f39077b.i(str);
    }
}
