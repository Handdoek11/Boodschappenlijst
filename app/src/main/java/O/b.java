package O;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c f4206a = new c(a.f4208A);

    /* renamed from: b, reason: collision with root package name */
    private static final c f4207b = new c(C0077b.f4209A);

    /* synthetic */ class a extends J6.o implements I6.p {

        /* renamed from: A, reason: collision with root package name */
        public static final a f4208A = new a();

        a() {
            super(2, L6.a.class, "min", "min(II)I", 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer j(int i8, int i9) {
            return Integer.valueOf(Math.min(i8, i9));
        }
    }

    /* renamed from: O.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0077b extends J6.o implements I6.p {

        /* renamed from: A, reason: collision with root package name */
        public static final C0077b f4209A = new C0077b();

        C0077b() {
            super(2, L6.a.class, "max", "max(II)I", 1);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer j(int i8, int i9) {
            return Integer.valueOf(Math.max(i8, i9));
        }
    }

    public static final int a(O.a aVar, int i8, int i9) {
        return ((Number) aVar.a().invoke(Integer.valueOf(i8), Integer.valueOf(i9))).intValue();
    }
}
