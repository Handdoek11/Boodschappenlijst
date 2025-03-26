package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC2883hr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f22630o;

    RunnableC2883hr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr) {
        this.f22630o = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f22630o;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.zza();
        }
    }
}
