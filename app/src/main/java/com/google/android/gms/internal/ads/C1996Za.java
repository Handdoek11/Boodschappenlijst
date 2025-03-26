package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996Za extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private static volatile Long f20498y;

    /* renamed from: z, reason: collision with root package name */
    private static final Object f20499z = new Object();

    public C1996Za(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c2918i8, i8, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (f20498y == null) {
            synchronized (f20499z) {
                try {
                    if (f20498y == null) {
                        f20498y = (Long) this.f21841v.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f21840u) {
            this.f21840u.X(f20498y.longValue());
        }
    }
}
