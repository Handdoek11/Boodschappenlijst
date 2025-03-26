package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;

/* loaded from: classes.dex */
public final class YF implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f20231x = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: o, reason: collision with root package name */
    private final Handler f20232o;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f20233s = new int[1];

    /* renamed from: t, reason: collision with root package name */
    private EGLDisplay f20234t;

    /* renamed from: u, reason: collision with root package name */
    private EGLContext f20235u;

    /* renamed from: v, reason: collision with root package name */
    private EGLSurface f20236v;

    /* renamed from: w, reason: collision with root package name */
    private SurfaceTexture f20237w;

    public YF(Handler handler, InterfaceC4564xF interfaceC4564xF) {
        this.f20232o = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f20237w;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i8) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        ZG.a(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        ZG.a(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f20234t = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f20231x, 0, eGLConfigArr, 0, 1, iArr2, 0);
        ZG.a(eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f20234t, eGLConfig, EGL14.EGL_NO_CONTEXT, i8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        ZG.a(eglCreateContext != null, "eglCreateContext failed");
        this.f20235u = eglCreateContext;
        EGLDisplay eGLDisplay = this.f20234t;
        if (i8 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i8 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            ZG.a(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        ZG.a(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.f20236v = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f20233s, 0);
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new zzde(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f20233s[0]);
        this.f20237w = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.f20232o.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f20237w;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f20233s, 0);
            }
            EGLDisplay eGLDisplay = this.f20234t;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f20234t;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f20236v;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f20234t, this.f20236v);
            }
            EGLContext eGLContext = this.f20235u;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f20234t, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f20234t;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f20234t);
            }
            this.f20234t = null;
            this.f20235u = null;
            this.f20236v = null;
            this.f20237w = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f20234t;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f20234t;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f20236v;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f20234t, this.f20236v);
            }
            EGLContext eGLContext2 = this.f20235u;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f20234t, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f20234t;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f20234t);
            }
            this.f20234t = null;
            this.f20235u = null;
            this.f20236v = null;
            this.f20237w = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20232o.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f20237w;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
