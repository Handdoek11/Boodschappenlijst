package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.gms.internal.ads.Kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498Kr extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC1428Ir {

    /* renamed from: S, reason: collision with root package name */
    private static final float[] f16651S = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    private float f16652A;

    /* renamed from: B, reason: collision with root package name */
    private float f16653B;

    /* renamed from: C, reason: collision with root package name */
    private int f16654C;

    /* renamed from: D, reason: collision with root package name */
    private int f16655D;

    /* renamed from: E, reason: collision with root package name */
    private SurfaceTexture f16656E;

    /* renamed from: F, reason: collision with root package name */
    private SurfaceTexture f16657F;

    /* renamed from: G, reason: collision with root package name */
    private int f16658G;

    /* renamed from: H, reason: collision with root package name */
    private int f16659H;

    /* renamed from: I, reason: collision with root package name */
    private int f16660I;

    /* renamed from: J, reason: collision with root package name */
    private final FloatBuffer f16661J;

    /* renamed from: K, reason: collision with root package name */
    private final CountDownLatch f16662K;

    /* renamed from: L, reason: collision with root package name */
    private final Object f16663L;

    /* renamed from: M, reason: collision with root package name */
    private EGL10 f16664M;

    /* renamed from: N, reason: collision with root package name */
    private EGLDisplay f16665N;

    /* renamed from: O, reason: collision with root package name */
    private EGLContext f16666O;

    /* renamed from: P, reason: collision with root package name */
    private EGLSurface f16667P;

    /* renamed from: Q, reason: collision with root package name */
    private volatile boolean f16668Q;

    /* renamed from: R, reason: collision with root package name */
    private volatile boolean f16669R;

    /* renamed from: o, reason: collision with root package name */
    private final C1463Jr f16670o;

    /* renamed from: s, reason: collision with root package name */
    private final float[] f16671s;

    /* renamed from: t, reason: collision with root package name */
    private final float[] f16672t;

    /* renamed from: u, reason: collision with root package name */
    private final float[] f16673u;

    /* renamed from: v, reason: collision with root package name */
    private final float[] f16674v;

    /* renamed from: w, reason: collision with root package name */
    private final float[] f16675w;

    /* renamed from: x, reason: collision with root package name */
    private final float[] f16676x;

    /* renamed from: y, reason: collision with root package name */
    private final float[] f16677y;

    /* renamed from: z, reason: collision with root package name */
    private float f16678z;

    public C1498Kr(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f16651S;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f16661J = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f16671s = new float[9];
        this.f16672t = new float[9];
        this.f16673u = new float[9];
        this.f16674v = new float[9];
        this.f16675w = new float[9];
        this.f16676x = new float[9];
        this.f16677y = new float[9];
        this.f16678z = Float.NaN;
        C1463Jr c1463Jr = new C1463Jr(context);
        this.f16670o = c1463Jr;
        c1463Jr.b(this);
        this.f16662K = new CountDownLatch(1);
        this.f16663L = new Object();
    }

    private static final void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f8 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        fArr[7] = (f26 * f32) + (f29 * fArr3[4]) + (f16 * f31);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    private static final void i(float[] fArr, float f8) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d8 = f8;
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = (float) (-Math.sin(d8));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d8);
        fArr[8] = (float) Math.cos(d8);
    }

    private static final void j(float[] fArr, float f8) {
        double d8 = f8;
        fArr[0] = (float) Math.cos(d8);
        fArr[1] = (float) (-Math.sin(d8));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d8);
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int k(int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i8 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.f16657F == null) {
            return null;
        }
        try {
            this.f16662K.await();
        } catch (InterruptedException unused) {
        }
        return this.f16656E;
    }

    public final void b(int i8, int i9) {
        synchronized (this.f16663L) {
            this.f16655D = i8;
            this.f16654C = i9;
            this.f16668Q = true;
            this.f16663L.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f16655D = i8;
        this.f16654C = i9;
        this.f16657F = surfaceTexture;
    }

    public final void d() {
        synchronized (this.f16663L) {
            this.f16669R = true;
            this.f16657F = null;
            this.f16663L.notifyAll();
        }
    }

    public final void e(float f8, float f9) {
        int i8 = this.f16655D;
        int i9 = this.f16654C;
        if (i8 <= i9) {
            i8 = i9;
        }
        float f10 = i8;
        this.f16652A -= (f8 * 1.7453293f) / f10;
        float f11 = this.f16653B - ((f9 * 1.7453293f) / f10);
        this.f16653B = f11;
        if (f11 < -1.5707964f) {
            this.f16653B = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.f16653B = 1.5707964f;
        }
    }

    final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f16667P;
        boolean z7 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z7 = this.f16664M.eglDestroySurface(this.f16665N, this.f16667P) | this.f16664M.eglMakeCurrent(this.f16665N, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f16667P = null;
        }
        EGLContext eGLContext = this.f16666O;
        if (eGLContext != null) {
            z7 |= this.f16664M.eglDestroyContext(this.f16665N, eGLContext);
            this.f16666O = null;
        }
        EGLDisplay eGLDisplay = this.f16665N;
        if (eGLDisplay == null) {
            return z7;
        }
        boolean eglTerminate = this.f16664M.eglTerminate(eGLDisplay) | z7;
        this.f16665N = null;
        return eglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16660I++;
        synchronized (this.f16663L) {
            this.f16663L.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1498Kr.run():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1428Ir
    public final void zza() {
        synchronized (this.f16663L) {
            this.f16663L.notifyAll();
        }
    }
}
