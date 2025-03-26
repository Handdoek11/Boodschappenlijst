package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1961Ya extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC4372va f20280y;

    /* renamed from: z, reason: collision with root package name */
    private long f20281z;

    public C1961Ya(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, ViewOnAttachStateChangeListenerC4372va viewOnAttachStateChangeListenerC4372va) {
        super(c3610oa, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c2918i8, i8, 53);
        this.f20280y = viewOnAttachStateChangeListenerC4372va;
        if (viewOnAttachStateChangeListenerC4372va != null) {
            this.f20281z = viewOnAttachStateChangeListenerC4372va.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (this.f20280y != null) {
            this.f21840u.R(((Long) this.f21841v.invoke(null, Long.valueOf(this.f20281z))).longValue());
        }
    }
}
