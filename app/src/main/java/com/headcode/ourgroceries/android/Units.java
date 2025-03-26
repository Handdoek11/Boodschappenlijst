package com.headcode.ourgroceries.android;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Units {
    public static String a(String str, int i8) {
        return c(adjustItemQuantityInItemDetails(e(str), i8));
    }

    private static native int[] adjustItemQuantityInItemDetails(int[] iArr, int i8);

    public static String b(String str) {
        return c(baseTitleForTitle(e(str)));
    }

    private static native int[] baseTitleForTitle(int[] iArr);

    private static String c(int[] iArr) {
        return new String(iArr, 0, iArr.length);
    }

    public static String d(List list) {
        int size = list.size();
        int[][] iArr = new int[size][];
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (i8 < size) {
                iArr[i8] = e(str);
                i8++;
            }
        }
        return c(quantitiesStringForItemsIntArray(iArr));
    }

    private static int[] e(String str) {
        int i8 = 0;
        int[] iArr = new int[str.codePointCount(0, str.length())];
        int i9 = 0;
        while (i8 < str.length()) {
            int codePointAt = str.codePointAt(i8);
            iArr[i9] = codePointAt;
            i8 += Character.charCount(codePointAt);
            i9++;
        }
        return iArr;
    }

    private static native int[] quantitiesStringForItemsIntArray(int[][] iArr);
}
