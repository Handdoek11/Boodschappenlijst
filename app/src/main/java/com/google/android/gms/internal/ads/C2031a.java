package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f20602i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20604b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f20605c;

    /* renamed from: d, reason: collision with root package name */
    public final E7[] f20606d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f20607e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f20608f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20609g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20610h;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public C2031a(long j8) {
        this(0L, -1, -1, new int[0], new E7[0], new long[0], 0L, false);
    }

    public final int a(int i8) {
        int i9;
        int i10 = i8 + 1;
        while (true) {
            int[] iArr = this.f20607e;
            if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public final C2031a b(int i8) {
        int[] iArr = this.f20607e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f20608f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new C2031a(0L, 0, -1, copyOf, (E7[]) Arrays.copyOf(this.f20606d, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2031a.class == obj.getClass()) {
            C2031a c2031a = (C2031a) obj;
            if (this.f20604b == c2031a.f20604b && Arrays.equals(this.f20606d, c2031a.f20606d) && Arrays.equals(this.f20607e, c2031a.f20607e) && Arrays.equals(this.f20608f, c2031a.f20608f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f20604b * 31) - 1) * 961) + Arrays.hashCode(this.f20606d)) * 31) + Arrays.hashCode(this.f20607e)) * 31) + Arrays.hashCode(this.f20608f)) * 961;
    }

    private C2031a(long j8, int i8, int i9, int[] iArr, E7[] e7Arr, long[] jArr, long j9, boolean z7) {
        Uri uri;
        int length = iArr.length;
        int length2 = e7Arr.length;
        int i10 = 0;
        AbstractC3796qC.d(length == length2);
        this.f20603a = 0L;
        this.f20604b = i8;
        this.f20607e = iArr;
        this.f20606d = e7Arr;
        this.f20608f = jArr;
        this.f20609g = 0L;
        this.f20610h = false;
        this.f20605c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f20605c;
            if (i10 >= uriArr.length) {
                return;
            }
            E7 e72 = e7Arr[i10];
            if (e72 == null) {
                uri = null;
            } else {
                C3128k5 c3128k5 = e72.f14645b;
                c3128k5.getClass();
                uri = c3128k5.f23502a;
            }
            uriArr[i10] = uri;
            i10++;
        }
    }
}
