package o4;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6288a implements B4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final B4.a f39816a = new C6288a();

    /* renamed from: o4.a$a, reason: collision with other inner class name */
    private static final class C0298a implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0298a f39817a = new C0298a();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f39818b = A4.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f39819c = A4.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f39820d = A4.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f39821e = A4.b.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f39822f = A4.b.d("templateVersion");

        private C0298a() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, A4.d dVar) {
            dVar.a(f39818b, iVar.e());
            dVar.a(f39819c, iVar.c());
            dVar.a(f39820d, iVar.d());
            dVar.a(f39821e, iVar.g());
            dVar.f(f39822f, iVar.f());
        }
    }

    private C6288a() {
    }

    @Override // B4.a
    public void a(B4.b bVar) {
        C0298a c0298a = C0298a.f39817a;
        bVar.a(i.class, c0298a);
        bVar.a(C6289b.class, c0298a);
    }
}
