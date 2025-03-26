package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3317lr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f24389o;

    RunnableC3317lr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr) {
        this.f24389o = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f24389o;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.d();
            this.f24389o.f25520G.f();
        }
    }
}
