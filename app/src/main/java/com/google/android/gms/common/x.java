package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class x extends v {

    /* renamed from: t, reason: collision with root package name */
    private static final WeakReference f13430t = new WeakReference(null);

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f13431s;

    x(byte[] bArr) {
        super(bArr);
        this.f13431s = f13430t;
    }

    @Override // com.google.android.gms.common.v
    final byte[] p2() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f13431s.get();
                if (bArr == null) {
                    bArr = q2();
                    this.f13431s = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] q2();
}
