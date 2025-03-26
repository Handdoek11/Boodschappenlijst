package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2683g implements InterfaceC1741Rq {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22181a = 0;

    static {
        AbstractC3732pg0.a(new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.f
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                int i8 = C2683g.f22181a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (invoke != null) {
                        return (InterfaceC1741Rq) invoke;
                    }
                    throw null;
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
            }
        });
    }

    /* synthetic */ C2683g(AbstractC2901i abstractC2901i) {
    }
}
