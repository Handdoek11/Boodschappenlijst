package kotlin.coroutines.jvm.internal;

/* loaded from: classes2.dex */
public final class c implements A6.d {

    /* renamed from: o, reason: collision with root package name */
    public static final c f38752o = new c();

    private c() {
    }

    @Override // A6.d
    public A6.g getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // A6.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
