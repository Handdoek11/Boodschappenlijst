package com.headcode.ourgroceries.android;

import java.text.Collator;

/* loaded from: classes2.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final Collator f34615a = c();

    public static boolean a(String str, String[] strArr) {
        int length = str.length();
        for (String str2 : strArr) {
            int length2 = (str2.length() - length) + 1;
            for (int i8 = 0; i8 < length2; i8++) {
                if (f34615a.equals(str, str2.substring(i8, i8 + length))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(String str, String[] strArr) {
        int length = str.length();
        int length2 = strArr.length;
        for (int i8 = 0; i8 < length2; i8++) {
            String str2 = strArr[i8];
            if (str2.length() > length) {
                str2 = str2.substring(0, length);
            }
            if (f34615a.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static Collator c() {
        Collator collator = Collator.getInstance();
        collator.setDecomposition(1);
        collator.setStrength(0);
        return collator;
    }
}
