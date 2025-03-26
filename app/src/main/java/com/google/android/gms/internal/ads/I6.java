package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class I6 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ U6 f15868o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ J6 f15869s;

    I6(J6 j62, U6 u62) {
        this.f15868o = u62;
        this.f15869s = j62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15869s.f16112s.put(this.f15868o);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
