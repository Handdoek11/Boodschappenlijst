package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3208kr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f24099o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f24100s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f24101t;

    RunnableC3208kr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr, int i8, int i9) {
        this.f24099o = i8;
        this.f24100s = i9;
        this.f24101t = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f24101t;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.a(this.f24099o, this.f24100s);
        }
    }
}
