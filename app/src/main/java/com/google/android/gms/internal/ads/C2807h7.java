package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2807h7 {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f22490d = new C2698g7();

    /* renamed from: a, reason: collision with root package name */
    private final List f22491a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f22492b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f22493c = 0;

    public C2807h7(int i8) {
    }

    private final synchronized void c() {
        while (this.f22493c > 4096) {
            byte[] bArr = (byte[]) this.f22491a.remove(0);
            this.f22492b.remove(bArr);
            this.f22493c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f22491a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f22492b, bArr, f22490d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f22492b.add(binarySearch, bArr);
                this.f22493c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i8) {
        for (int i9 = 0; i9 < this.f22492b.size(); i9++) {
            byte[] bArr = (byte[]) this.f22492b.get(i9);
            int length = bArr.length;
            if (length >= i8) {
                this.f22493c -= length;
                this.f22492b.remove(i9);
                this.f22491a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }
}
