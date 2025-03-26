package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3535nr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f25045o;

    RunnableC3535nr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr) {
        this.f25045o = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f25045o;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.d();
        }
    }
}
