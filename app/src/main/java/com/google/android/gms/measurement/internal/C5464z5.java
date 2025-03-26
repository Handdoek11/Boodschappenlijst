package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.A3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5464z5 {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f31314b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    private final Map f31315a;

    private C5464z5(Map map) {
        HashMap hashMap = new HashMap();
        this.f31315a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C5464z5 c(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String f8 = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(f8) && f8.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f8.charAt(754)));
        }
        int a8 = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a8 != -1) {
            hashMap.put("gdprApplies", String.valueOf(a8));
        }
        int a9 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a9 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a9));
        }
        int a10 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a10 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a10));
        }
        String f9 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(f9)) {
            hashMap.put("PurposeConsents", f9);
        }
        int a11 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a11 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a11));
        }
        return new C5464z5(hashMap);
    }

    public static String d(String str, boolean z7) {
        if (!z7 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i8 = 1;
        while (true) {
            if (i8 >= 64) {
                i8 = 0;
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8)) {
                break;
            }
            i8++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i8);
        return String.valueOf(charArray);
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = (String) this.f31315a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = (String) this.f31315a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        if (!"1".equals(this.f31315a.get("GoogleConsent")) || !"1".equals(this.f31315a.get("gdprApplies")) || !"1".equals(this.f31315a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i8 = i();
        if (i8 < 0) {
            return Bundle.EMPTY;
        }
        String str = (String) this.f31315a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(A3.a.AD_STORAGE.f30273o, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(A3.a.AD_PERSONALIZATION.f30273o, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && i8 >= 4) {
            String str3 = A3.a.AD_USER_DATA.f30273o;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int h8 = h();
        if (h8 < 0 || h8 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h8 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h8 & 63));
        }
        int i8 = i();
        if (i8 < 0 || i8 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8));
        }
        Z2.r.a(true);
        int i9 = "1".equals(this.f31315a.get("gdprApplies")) ? 2 : 0;
        int i10 = i9 | 4;
        if ("1".equals(this.f31315a.get("EnableAdvertiserConsentMode"))) {
            i10 = i9 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5464z5) {
            return g().equalsIgnoreCase(((C5464z5) obj).g());
        }
        return false;
    }

    final String g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f31314b) {
            if (this.f31315a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) this.f31315a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
