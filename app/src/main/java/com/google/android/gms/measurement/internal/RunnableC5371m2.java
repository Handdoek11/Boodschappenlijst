package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5371m2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ int f31078o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f31079s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Object f31080t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ Object f31081u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Object f31082v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C5378n2 f31083w;

    RunnableC5371m2(C5378n2 c5378n2, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f31078o = i8;
        this.f31079s = str;
        this.f31080t = obj;
        this.f31081u = obj2;
        this.f31082v = obj3;
        this.f31083w = c5378n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5461z2 D7 = this.f31083w.f31239a.D();
        if (!D7.q()) {
            this.f31083w.w(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f31083w.f31100c == 0) {
            if (this.f31083w.a().W()) {
                this.f31083w.f31100c = 'C';
            } else {
                this.f31083w.f31100c = 'c';
            }
        }
        if (this.f31083w.f31101d < 0) {
            this.f31083w.f31101d = 106000L;
        }
        String str = "2" + "01VDIWEA?".charAt(this.f31078o) + this.f31083w.f31100c + this.f31083w.f31101d + ":" + C5378n2.v(true, this.f31079s, this.f31080t, this.f31081u, this.f31082v);
        if (str.length() > 1024) {
            str = this.f31079s.substring(0, 1024);
        }
        D2 d22 = D7.f31287f;
        if (d22 != null) {
            d22.b(str, 1L);
        }
    }
}
