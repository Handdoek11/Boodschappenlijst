package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2744gc {
    static long a(long j8, int i8) {
        if (i8 == 1) {
            return j8;
        }
        int i9 = i8 >> 1;
        long j9 = (j8 * j8) % 1073807359;
        return ((i8 & 1) == 0 ? a(j9, i9) : j8 * (a(j9, i9) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i8, int i9) {
        int i10 = i9 + i8;
        if (strArr.length < i10) {
            H2.p.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i10 - 1;
            if (i8 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i8]);
            sb.append(' ');
            i8++;
        }
    }

    public static void c(String[] strArr, int i8, int i9, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i8, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e8 = e(strArr, 0, 6);
        d(i8, e8, b(strArr, 0, 6), 6, priorityQueue);
        int i10 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i10 >= length2 - 5) {
                return;
            }
            long a8 = AbstractC2418dc.a(strArr[i10 - 1]);
            long a9 = AbstractC2418dc.a(strArr[i10 + 5]);
            String b8 = b(strArr, i10, 6);
            e8 = ((((((e8 + 1073807359) - ((a(16785407L, 5) * ((a8 + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((a9 + 2147483647L) % 1073807359)) % 1073807359;
            d(i8, e8, b8, length2, priorityQueue);
            i10++;
        }
    }

    static void d(int i8, long j8, String str, int i9, PriorityQueue priorityQueue) {
        C2635fc c2635fc = new C2635fc(j8, str, i9);
        if ((priorityQueue.size() != i8 || (((C2635fc) priorityQueue.peek()).f22074c <= c2635fc.f22074c && ((C2635fc) priorityQueue.peek()).f22072a <= c2635fc.f22072a)) && !priorityQueue.contains(c2635fc)) {
            priorityQueue.add(c2635fc);
            if (priorityQueue.size() > i8) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(String[] strArr, int i8, int i9) {
        long a8 = (AbstractC2418dc.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i10 = 1; i10 < i9; i10++) {
            a8 = (((a8 * 16785407) % 1073807359) + ((AbstractC2418dc.a(strArr[i10]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a8;
    }
}
