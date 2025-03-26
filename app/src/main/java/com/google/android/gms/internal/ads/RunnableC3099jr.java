package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC3099jr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f23351o;

    RunnableC3099jr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr) {
        this.f23351o = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f23351o;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.e();
        }
    }
}
