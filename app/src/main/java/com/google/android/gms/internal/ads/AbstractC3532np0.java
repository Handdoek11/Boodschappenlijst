package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.np0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3532np0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Tt0 f25038a = Tt0.b(new byte[0]);

    public static final Tt0 a(int i8) {
        return Tt0.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i8).array());
    }

    public static final Tt0 b(int i8) {
        return Tt0.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i8).array());
    }
}
