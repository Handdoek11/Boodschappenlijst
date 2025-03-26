package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.dG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2391dG0 implements InterfaceC4456wF0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f21487a;

    public C2391dG0(MediaCodec mediaCodec) {
        this.f21487a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void b(Bundle bundle) {
        this.f21487a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void c(int i8, int i9, int i10, long j8, int i11) {
        this.f21487a.queueInputBuffer(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void d(int i8, int i9, Lx0 lx0, long j8, int i10) {
        this.f21487a.queueSecureInputBuffer(i8, 0, lx0.a(), j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4456wF0
    public final void zzb() {
    }
}
