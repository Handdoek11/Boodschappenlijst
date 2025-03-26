package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716Ra extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private static volatile String f18670y;

    /* renamed from: z, reason: collision with root package name */
    private static final Object f18671z = new Object();

    public C1716Ra(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c2918i8, i8, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        this.f21840u.D("E");
        if (f18670y == null) {
            synchronized (f18671z) {
                try {
                    if (f18670y == null) {
                        f18670y = (String) this.f21841v.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f21840u) {
            this.f21840u.D(f18670y);
        }
    }
}
