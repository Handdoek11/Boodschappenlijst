package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC2811h9 implements Runnable {
    /* synthetic */ RunnableC2811h9(AbstractC2920i9 abstractC2920i9) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            AbstractC3027j9.f23196b = MessageDigest.getInstance("MD5");
            countDownLatch = AbstractC3027j9.f23199e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = AbstractC3027j9.f23199e;
        } catch (Throwable th) {
            AbstractC3027j9.f23199e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
