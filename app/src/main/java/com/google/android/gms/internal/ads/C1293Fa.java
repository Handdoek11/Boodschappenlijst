package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293Fa extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private static volatile Long f15175y;

    /* renamed from: z, reason: collision with root package name */
    private static final Object f15176z = new Object();

    public C1293Fa(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c2918i8, i8, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (f15175y == null) {
            synchronized (f15176z) {
                try {
                    if (f15175y == null) {
                        f15175y = (Long) this.f21841v.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f21840u) {
            this.f21840u.x0(f15175y.longValue());
        }
    }
}
