package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4657y7 extends ThreadLocal {
    C4657y7(AbstractC4766z7 abstractC4766z7) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
