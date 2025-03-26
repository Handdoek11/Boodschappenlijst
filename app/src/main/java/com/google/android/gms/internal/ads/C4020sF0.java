package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.sF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4020sF0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4565xF0 f26611a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f26612b;

    /* renamed from: c, reason: collision with root package name */
    public final D f26613c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f26614d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f26615e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C3803qF0 f26616f;

    private C4020sF0(C4565xF0 c4565xF0, MediaFormat mediaFormat, D d8, Surface surface, MediaCrypto mediaCrypto, C3803qF0 c3803qF0) {
        this.f26611a = c4565xF0;
        this.f26612b = mediaFormat;
        this.f26613c = d8;
        this.f26614d = surface;
        this.f26616f = c3803qF0;
    }

    public static C4020sF0 a(C4565xF0 c4565xF0, MediaFormat mediaFormat, D d8, MediaCrypto mediaCrypto, C3803qF0 c3803qF0) {
        return new C4020sF0(c4565xF0, mediaFormat, d8, null, null, c3803qF0);
    }

    public static C4020sF0 b(C4565xF0 c4565xF0, MediaFormat mediaFormat, D d8, Surface surface, MediaCrypto mediaCrypto) {
        return new C4020sF0(c4565xF0, mediaFormat, d8, surface, null, null);
    }
}
