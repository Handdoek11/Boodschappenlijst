package W;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private final o f5794a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5795b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5796c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f5797d;

    public static /* synthetic */ x b(x xVar, g gVar, o oVar, int i8, int i9, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            xVar.getClass();
            gVar = null;
        }
        if ((i10 & 2) != 0) {
            oVar = xVar.f5794a;
        }
        o oVar2 = oVar;
        if ((i10 & 4) != 0) {
            i8 = xVar.f5795b;
        }
        int i11 = i8;
        if ((i10 & 8) != 0) {
            i9 = xVar.f5796c;
        }
        int i12 = i9;
        if ((i10 & 16) != 0) {
            obj = xVar.f5797d;
        }
        return xVar.a(gVar, oVar2, i11, i12, obj);
    }

    public abstract x a(g gVar, o oVar, int i8, int i9, Object obj);

    public abstract g c();

    public abstract int d();

    public abstract o e();
}
