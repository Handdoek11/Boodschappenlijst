package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2759gj0 {

    /* renamed from: b, reason: collision with root package name */
    static final C2759gj0 f22424b = new C2759gj0(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f22425a;

    /* renamed from: com.google.android.gms.internal.ads.gj0$a */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    C2759gj0(Throwable th) {
        th.getClass();
        this.f22425a = th;
    }
}
