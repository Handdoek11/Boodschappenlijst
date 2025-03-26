package U6;

/* loaded from: classes2.dex */
public final class T0 extends I {

    /* renamed from: t, reason: collision with root package name */
    public static final T0 f5426t = new T0();

    private T0() {
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        X0 x02 = (X0) gVar.d(X0.f5429t);
        if (x02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        x02.f5430s = true;
    }

    @Override // U6.I
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // U6.I
    public boolean x0(A6.g gVar) {
        return false;
    }

    @Override // U6.I
    public I z0(int i8) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
