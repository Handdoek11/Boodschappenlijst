package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.eF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2497eF0 implements InterfaceC4456wF0 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f21760g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f21761h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f21762a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f21763b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f21764c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f21765d;

    /* renamed from: e, reason: collision with root package name */
    private final C4344vE f21766e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21767f;

    public C2497eF0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C4344vE c4344vE = new C4344vE(RC.f18620a);
        this.f21762a = mediaCodec;
        this.f21763b = handlerThread;
        this.f21766e = c4344vE;
        this.f21765d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void f(com.google.android.gms.internal.ads.C2497eF0 r10, android.os.Message r11) {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L59
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.f21765d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.AbstractC2063aF0.a(r10, r2, r0)
            goto L73
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.f21762a     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L73
        L2a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f21765d
            com.google.android.gms.internal.ads.AbstractC2063aF0.a(r10, r2, r11)
            goto L73
        L31:
            com.google.android.gms.internal.ads.vE r10 = r10.f21766e
            r10.e()
            goto L73
        L37:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.cF0 r11 = (com.google.android.gms.internal.ads.C2280cF0) r11
            int r4 = r11.f21115a
            android.media.MediaCodec$CryptoInfo r6 = r11.f21118d
            long r7 = r11.f21119e
            int r9 = r11.f21120f
            java.lang.Object r0 = com.google.android.gms.internal.ads.C2497eF0.f21761h     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.f21762a     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L57
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.RuntimeException -> L51
        L51:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f21765d
            com.google.android.gms.internal.ads.AbstractC2063aF0.a(r10, r2, r0)
        L57:
            r2 = r11
            goto L73
        L59:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.cF0 r11 = (com.google.android.gms.internal.ads.C2280cF0) r11
            int r4 = r11.f21115a
            int r6 = r11.f21117c
            long r7 = r11.f21119e
            int r9 = r11.f21120f
            android.media.MediaCodec r3 = r10.f21762a     // Catch: java.lang.RuntimeException -> L6c
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6c
            goto L57
        L6c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.f21765d
            com.google.android.gms.internal.ads.AbstractC2063aF0.a(r10, r2, r0)
            goto L57
        L73:
            if (r2 == 0) goto L80
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.C2497eF0.f21760g
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7d
            return
        L7d:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7d
            throw r11
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2497eF0.f(com.google.android.gms.internal.ads.eF0, android.os.Message):void");
    }

    private static C2280cF0 h() {
        ArrayDeque arrayDeque = f21760g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C2280cF0();
                }
                return (C2280cF0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f21765d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void b(Bundle bundle) {
        a();
        Handler handler = this.f21764c;
        int i8 = AbstractC2301cW.f21206a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void c(int i8, int i9, int i10, long j8, int i11) {
        a();
        C2280cF0 h8 = h();
        h8.a(i8, 0, i10, j8, i11);
        Handler handler = this.f21764c;
        int i12 = AbstractC2301cW.f21206a;
        handler.obtainMessage(1, h8).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void d(int i8, int i9, Lx0 lx0, long j8, int i10) {
        a();
        C2280cF0 h8 = h();
        h8.a(i8, 0, 0, j8, 0);
        MediaCodec.CryptoInfo cryptoInfo = h8.f21118d;
        cryptoInfo.numSubSamples = lx0.f17177f;
        cryptoInfo.numBytesOfClearData = j(lx0.f17175d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(lx0.f17176e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i11 = i(lx0.f17173b, cryptoInfo.key);
        i11.getClass();
        cryptoInfo.key = i11;
        byte[] i12 = i(lx0.f17172a, cryptoInfo.iv);
        i12.getClass();
        cryptoInfo.iv = i12;
        cryptoInfo.mode = lx0.f17174c;
        if (AbstractC2301cW.f21206a >= 24) {
            AbstractC2389dF0.a();
            cryptoInfo.setPattern(Gw0.a(lx0.f17178g, lx0.f17179h));
        }
        this.f21764c.obtainMessage(2, h8).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void e() {
        if (this.f21767f) {
            return;
        }
        this.f21763b.start();
        this.f21764c = new HandlerC2172bF0(this, this.f21763b.getLooper());
        this.f21767f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void g() {
        if (this.f21767f) {
            zzb();
            this.f21763b.quit();
        }
        this.f21767f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void zzb() {
        if (this.f21767f) {
            try {
                Handler handler = this.f21764c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f21766e.c();
                Handler handler2 = this.f21764c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.f21766e.a();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }
}
