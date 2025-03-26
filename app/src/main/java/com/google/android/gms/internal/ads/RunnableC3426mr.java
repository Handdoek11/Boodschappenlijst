package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3426mr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f24595o;

    RunnableC3426mr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr) {
        this.f24595o = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f24595o;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            if (!textureViewSurfaceTextureListenerC3753pr.f25521H) {
                textureViewSurfaceTextureListenerC3753pr.f25520G.g();
                this.f24595o.f25521H = true;
            }
            this.f24595o.f25520G.b();
        }
    }
}
