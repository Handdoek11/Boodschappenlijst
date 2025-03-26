package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786Ta extends AbstractCallableC2524eb {
    public C1786Ta(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c2918i8, i8, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        int i8 = 1;
        try {
            boolean booleanValue = ((Boolean) this.f21841v.invoke(null, this.f21837o.b())).booleanValue();
            C2918i8 c2918i8 = this.f21840u;
            if (true == booleanValue) {
                i8 = 2;
            }
            c2918i8.i0(i8);
        } catch (InvocationTargetException unused) {
            this.f21840u.i0(3);
        }
    }
}
