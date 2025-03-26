package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import q.C6401e;

/* renamed from: com.google.android.gms.internal.ads.gF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2715gF0 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f22270b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f22271c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f22276h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f22277i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f22278j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f22279k;

    /* renamed from: l, reason: collision with root package name */
    private long f22280l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22281m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f22282n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC4238uF0 f22283o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22269a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C6401e f22272d = new C6401e();

    /* renamed from: e, reason: collision with root package name */
    private final C6401e f22273e = new C6401e();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f22274f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f22275g = new ArrayDeque();

    C2715gF0(HandlerThread handlerThread) {
        this.f22270b = handlerThread;
    }

    public static /* synthetic */ void d(C2715gF0 c2715gF0) {
        synchronized (c2715gF0.f22269a) {
            try {
                if (c2715gF0.f22281m) {
                    return;
                }
                long j8 = c2715gF0.f22280l - 1;
                c2715gF0.f22280l = j8;
                if (j8 > 0) {
                    return;
                }
                if (j8 >= 0) {
                    c2715gF0.j();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (c2715gF0.f22269a) {
                    c2715gF0.f22282n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i(MediaFormat mediaFormat) {
        this.f22273e.a(-2);
        this.f22275g.add(mediaFormat);
    }

    private final void j() {
        if (!this.f22275g.isEmpty()) {
            this.f22277i = (MediaFormat) this.f22275g.getLast();
        }
        this.f22272d.b();
        this.f22273e.b();
        this.f22274f.clear();
        this.f22275g.clear();
    }

    private final void k() {
        IllegalStateException illegalStateException = this.f22282n;
        if (illegalStateException != null) {
            this.f22282n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f22278j;
        if (codecException != null) {
            this.f22278j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f22279k;
        if (cryptoException == null) {
            return;
        }
        this.f22279k = null;
        throw cryptoException;
    }

    private final boolean l() {
        return this.f22280l > 0 || this.f22281m;
    }

    public final int a() {
        synchronized (this.f22269a) {
            try {
                k();
                int i8 = -1;
                if (l()) {
                    return -1;
                }
                if (!this.f22272d.d()) {
                    i8 = this.f22272d.e();
                }
                return i8;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f22269a) {
            try {
                k();
                if (l()) {
                    return -1;
                }
                if (this.f22273e.d()) {
                    return -1;
                }
                int e8 = this.f22273e.e();
                if (e8 >= 0) {
                    AbstractC3796qC.b(this.f22276h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f22274f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e8 == -2) {
                    this.f22276h = (MediaFormat) this.f22275g.remove();
                    e8 = -2;
                }
                return e8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f22269a) {
            try {
                mediaFormat = this.f22276h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f22269a) {
            this.f22280l++;
            Handler handler = this.f22271c;
            int i8 = AbstractC2301cW.f21206a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fF0
                @Override // java.lang.Runnable
                public final void run() {
                    C2715gF0.d(this.f21971o);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        AbstractC3796qC.f(this.f22271c == null);
        this.f22270b.start();
        Handler handler = new Handler(this.f22270b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f22271c = handler;
    }

    public final void g(InterfaceC4238uF0 interfaceC4238uF0) {
        synchronized (this.f22269a) {
            this.f22283o = interfaceC4238uF0;
        }
    }

    public final void h() {
        synchronized (this.f22269a) {
            this.f22281m = true;
            this.f22270b.quit();
            j();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f22269a) {
            this.f22279k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f22269a) {
            this.f22278j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i8) {
        synchronized (this.f22269a) {
            try {
                this.f22272d.a(i8);
                InterfaceC4238uF0 interfaceC4238uF0 = this.f22283o;
                if (interfaceC4238uF0 != null) {
                    JF0 jf0 = ((FF0) interfaceC4238uF0).f15117a;
                    if (jf0.f16157D != null) {
                        jf0.f16157D.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i8, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f22269a) {
            try {
                MediaFormat mediaFormat = this.f22277i;
                if (mediaFormat != null) {
                    i(mediaFormat);
                    this.f22277i = null;
                }
                this.f22273e.a(i8);
                this.f22274f.add(bufferInfo);
                InterfaceC4238uF0 interfaceC4238uF0 = this.f22283o;
                if (interfaceC4238uF0 != null) {
                    JF0 jf0 = ((FF0) interfaceC4238uF0).f15117a;
                    if (jf0.f16157D != null) {
                        jf0.f16157D.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f22269a) {
            i(mediaFormat);
            this.f22277i = null;
        }
    }
}
