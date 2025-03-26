package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC2774gr implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f22447o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC3753pr f22448s;

    RunnableC2774gr(TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr, MediaPlayer mediaPlayer) {
        this.f22447o = mediaPlayer;
        this.f22448s = textureViewSurfaceTextureListenerC3753pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC3753pr.G(this.f22448s, this.f22447o);
        TextureViewSurfaceTextureListenerC3753pr textureViewSurfaceTextureListenerC3753pr = this.f22448s;
        if (textureViewSurfaceTextureListenerC3753pr.f25520G != null) {
            textureViewSurfaceTextureListenerC3753pr.f25520G.c();
        }
    }
}
