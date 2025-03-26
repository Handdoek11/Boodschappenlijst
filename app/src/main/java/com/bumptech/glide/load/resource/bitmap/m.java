package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class m extends AbstractC1084h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f12926b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(J1.e.f3470a);

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f12926b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1084h
    protected Bitmap c(M1.d dVar, Bitmap bitmap, int i8, int i9) {
        return H.c(dVar, bitmap, i8, i9);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // J1.e
    public int hashCode() {
        return -670243078;
    }
}
