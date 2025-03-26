package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class T0 {

    /* renamed from: b, reason: collision with root package name */
    static final T0 f29833b = new T0(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f29834a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    T0(Throwable th) {
        th.getClass();
        this.f29834a = th;
    }
}
