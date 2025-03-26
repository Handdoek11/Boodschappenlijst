package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3161kN {
    public static void a(MediaFormat mediaFormat, String str, int i8) {
        if (i8 != -1) {
            mediaFormat.setInteger(str, i8);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mediaFormat.setByteBuffer("csd-" + i8, ByteBuffer.wrap((byte[]) list.get(i8)));
        }
    }
}
