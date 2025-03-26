package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class F extends AbstractC1084h {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f12889c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(J1.e.f3470a);

    /* renamed from: b, reason: collision with root package name */
    private final int f12890b;

    public F(int i8) {
        AbstractC5709k.a(i8 > 0, "roundingRadius must be greater than 0.");
        this.f12890b = i8;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f12889c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f12890b).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1084h
    protected Bitmap c(M1.d dVar, Bitmap bitmap, int i8, int i9) {
        return H.n(dVar, bitmap, this.f12890b);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        return (obj instanceof F) && this.f12890b == ((F) obj).f12890b;
    }

    @Override // J1.e
    public int hashCode() {
        return AbstractC5710l.o(-569625254, AbstractC5710l.n(this.f12890b));
    }
}
