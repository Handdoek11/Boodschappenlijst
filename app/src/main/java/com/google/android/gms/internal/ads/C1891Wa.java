package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891Wa extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final StackTraceElement[] f19816y;

    public C1891Wa(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, StackTraceElement[] stackTraceElementArr) {
        super(c3610oa, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c2918i8, i8, 45);
        this.f19816y = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f19816y;
        if (stackTraceElementArr != null) {
            C2522ea c2522ea = new C2522ea((String) this.f21841v.invoke(null, stackTraceElementArr));
            synchronized (this.f21840u) {
                try {
                    this.f21840u.H(c2522ea.f21832b.longValue());
                    if (c2522ea.f21833c.booleanValue()) {
                        this.f21840u.f0(true != c2522ea.f21834d.booleanValue() ? 2 : 1);
                    } else {
                        this.f21840u.f0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
