package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ir, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC2991ir implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f23070o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f23071s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f23072t;

    RunnableC2991ir(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr, String str, String str2) {
        this.f23070o = str;
        this.f23071s = str2;
        this.f23072t = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f23072t;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.m(this.f23070o, this.f23071s);
        }
    }
}
