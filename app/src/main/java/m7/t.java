package m7;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final k7.E f39464a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39465b;

    /* synthetic */ class a extends J6.o implements I6.p {
        a(Object obj) {
            super(2, obj, t.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j((i7.f) obj, ((Number) obj2).intValue());
        }

        public final Boolean j(i7.f fVar, int i8) {
            J6.r.e(fVar, "p0");
            return Boolean.valueOf(((t) this.f3564s).e(fVar, i8));
        }
    }

    public t(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        this.f39464a = new k7.E(fVar, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(i7.f fVar, int i8) {
        boolean z7 = !fVar.l(i8) && fVar.k(i8).c();
        this.f39465b = z7;
        return z7;
    }

    public final boolean b() {
        return this.f39465b;
    }

    public final void c(int i8) {
        this.f39464a.a(i8);
    }

    public final int d() {
        return this.f39464a.d();
    }
}
