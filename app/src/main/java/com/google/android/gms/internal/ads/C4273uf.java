package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4273uf extends AbstractC4382vf {
    C4273uf() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < str.length() && str.charAt(i9) == ',') {
            i9++;
        }
        while (length > 0) {
            int i10 = length - 1;
            if (str.charAt(i10) != ',') {
                break;
            }
            length = i10;
        }
        if (length < i9) {
            return null;
        }
        if (i9 != 0) {
            i8 = i9;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i8, length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4382vf
    public final String a(String str, String str2) {
        String b8 = b(str);
        String b9 = b(str2);
        if (TextUtils.isEmpty(b8)) {
            return b9;
        }
        if (TextUtils.isEmpty(b9)) {
            return b8;
        }
        return b8 + "," + b9;
    }
}
