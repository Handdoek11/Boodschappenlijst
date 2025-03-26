package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class I7 extends Jx0 {
    public I7(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.Jx0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
