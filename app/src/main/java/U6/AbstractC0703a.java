package U6;

/* renamed from: U6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0703a extends C0 implements InterfaceC0745v0, A6.d, M {

    /* renamed from: t, reason: collision with root package name */
    private final A6.g f5433t;

    public AbstractC0703a(A6.g gVar, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            q0((InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d));
        }
        this.f5433t = gVar.u(this);
    }

    @Override // U6.C0
    public String A0() {
        String b8 = H.b(this.f5433t);
        if (b8 == null) {
            return super.A0();
        }
        return '\"' + b8 + "\":" + super.A0();
    }

    @Override // U6.C0
    protected final void F0(Object obj) {
        if (!(obj instanceof C)) {
            X0(obj);
        } else {
            C c8 = (C) obj;
            W0(c8.f5374a, c8.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U6.C0
    public String P() {
        return Q.a(this) + " was cancelled";
    }

    protected void V0(Object obj) {
        v(obj);
    }

    public final void Y0(O o8, Object obj, I6.p pVar) {
        o8.c(pVar, obj, this);
    }

    @Override // A6.d
    public final A6.g getContext() {
        return this.f5433t;
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f5433t;
    }

    @Override // U6.C0, U6.InterfaceC0745v0
    public boolean h() {
        return super.h();
    }

    @Override // U6.C0
    public final void p0(Throwable th) {
        K.a(this.f5433t, th);
    }

    @Override // A6.d
    public final void resumeWith(Object obj) {
        Object x02 = x0(F.d(obj, null, 1, null));
        if (x02 == D0.f5391b) {
            return;
        }
        V0(x02);
    }

    protected void X0(Object obj) {
    }

    protected void W0(Throwable th, boolean z7) {
    }
}
