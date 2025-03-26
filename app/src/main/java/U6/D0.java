package U6;

/* loaded from: classes2.dex */
public abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z6.E f5390a = new Z6.E("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final Z6.E f5391b = new Z6.E("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final Z6.E f5392c = new Z6.E("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final Z6.E f5393d = new Z6.E("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final Z6.E f5394e = new Z6.E("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C0712e0 f5395f = new C0712e0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C0712e0 f5396g = new C0712e0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0736q0 ? new C0737r0((InterfaceC0736q0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0736q0 interfaceC0736q0;
        C0737r0 c0737r0 = obj instanceof C0737r0 ? (C0737r0) obj : null;
        return (c0737r0 == null || (interfaceC0736q0 = c0737r0.f5477a) == null) ? obj : interfaceC0736q0;
    }
}
