package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import f3.InterfaceC5781e;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class XJ {

    /* renamed from: a, reason: collision with root package name */
    private final G2.P f20028a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5781e f20029b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20030c;

    public XJ(G2.P p8, InterfaceC5781e interfaceC5781e, Executor executor) {
        this.f20028a = p8;
        this.f20029b = interfaceC5781e;
        this.f20030c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long b8 = this.f20029b.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b9 = this.f20029b.b();
        if (decodeByteArray != null) {
            long j8 = b9 - b8;
            AbstractC0608p0.k("Decoded image w: " + decodeByteArray.getWidth() + " h:" + decodeByteArray.getHeight() + " bytes: " + decodeByteArray.getAllocationByteCount() + " time: " + j8 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return decodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d8, boolean z7, R6 r62) {
        byte[] bArr = r62.f18605b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d8 * 160.0d);
        if (!z7) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23828Y5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i8 = options.outWidth * options.outHeight;
            if (i8 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i8 - 1) / ((Integer) D2.A.c().a(AbstractC3184kf.f23836Z5)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final com.google.common.util.concurrent.d b(String str, final double d8, final boolean z7) {
        return AbstractC2326ck0.m(this.f20028a.a(str), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.WJ
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f19774a.a(d8, z7, (R6) obj);
            }
        }, this.f20030c);
    }
}
