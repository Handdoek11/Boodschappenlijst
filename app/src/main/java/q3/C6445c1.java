package q3;

import A4.b;

/* renamed from: q3.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6445c1 implements A4.c {

    /* renamed from: a, reason: collision with root package name */
    static final C6445c1 f41603a = new C6445c1();

    /* renamed from: b, reason: collision with root package name */
    private static final A4.b f41604b;

    /* renamed from: c, reason: collision with root package name */
    private static final A4.b f41605c;

    /* renamed from: d, reason: collision with root package name */
    private static final A4.b f41606d;

    /* renamed from: e, reason: collision with root package name */
    private static final A4.b f41607e;

    static {
        b.C0000b a8 = A4.b.a("supportedFormats");
        C6459e c6459e = new C6459e();
        c6459e.a(1);
        f41604b = a8.b(c6459e.b()).a();
        b.C0000b a9 = A4.b.a("durationMs");
        C6459e c6459e2 = new C6459e();
        c6459e2.a(2);
        f41605c = a9.b(c6459e2.b()).a();
        b.C0000b a10 = A4.b.a("errorCode");
        C6459e c6459e3 = new C6459e();
        c6459e3.a(3);
        f41606d = a10.b(c6459e3.b()).a();
        b.C0000b a11 = A4.b.a("allowManualInput");
        C6459e c6459e4 = new C6459e();
        c6459e4.a(4);
        f41607e = a11.b(c6459e4.b()).a();
    }

    private C6445c1() {
    }

    @Override // A4.c
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        H3 h32 = (H3) obj;
        A4.d dVar = (A4.d) obj2;
        dVar.a(f41604b, h32.c());
        dVar.a(f41605c, h32.d());
        dVar.a(f41606d, h32.a());
        dVar.a(f41607e, h32.b());
    }
}
