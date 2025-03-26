package k7;

/* renamed from: k7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6152t implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final I6.l f38736a;

    /* renamed from: b, reason: collision with root package name */
    private final a f38737b;

    /* renamed from: k7.t$a */
    public static final class a extends ClassValue {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6139m computeValue(Class cls) {
            J6.r.e(cls, "type");
            return new C6139m((g7.b) C6152t.this.f38736a.invoke(H6.a.c(cls)));
        }
    }

    public C6152t(I6.l lVar) {
        J6.r.e(lVar, "compute");
        this.f38736a = lVar;
        this.f38737b = c();
    }

    private final a c() {
        return new a();
    }

    @Override // k7.D0
    public g7.b a(Q6.b bVar) {
        J6.r.e(bVar, "key");
        return ((C6139m) this.f38737b.get(H6.a.a(bVar))).f38708a;
    }
}
