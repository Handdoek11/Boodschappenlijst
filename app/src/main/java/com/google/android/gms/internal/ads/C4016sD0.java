package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4016sD0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26607a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26608b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26609c;

    public final C4016sD0 a(boolean z7) {
        this.f26607a = true;
        return this;
    }

    public final C4016sD0 b(boolean z7) {
        this.f26608b = z7;
        return this;
    }

    public final C4016sD0 c(boolean z7) {
        this.f26609c = z7;
        return this;
    }

    public final C4234uD0 d() {
        if (this.f26607a || !(this.f26608b || this.f26609c)) {
            return new C4234uD0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
