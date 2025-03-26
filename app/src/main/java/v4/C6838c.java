package v4;

import java.util.HashMap;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6838c implements InterfaceC6839d {

    /* renamed from: a, reason: collision with root package name */
    private final int f44089a;

    public C6838c(int i8) {
        this.f44089a = i8;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArr, int i8, int i9) {
        int i10 = i9 - i8;
        if (i9 + i10 > stackTraceElementArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!stackTraceElementArr[i8 + i11].equals(stackTraceElementArr[i9 + i11])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i8) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !b(stackTraceElementArr, num.intValue(), i10)) {
                stackTraceElementArr2[i11] = stackTraceElementArr[i10];
                i11++;
                i12 = 1;
                i9 = i10;
            } else {
                int intValue = i10 - num.intValue();
                if (i12 < i8) {
                    System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue);
                    i11 += intValue;
                    i12++;
                }
                i9 = (intValue - 1) + i10;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return stackTraceElementArr3;
    }

    @Override // v4.InterfaceC6839d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c8 = c(stackTraceElementArr, this.f44089a);
        return c8.length < stackTraceElementArr.length ? c8 : stackTraceElementArr;
    }
}
