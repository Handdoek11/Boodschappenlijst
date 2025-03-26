package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f32880a;

    public J(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f32880a = new Bundle(bundle);
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    private static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f32880a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v7 = v(str);
            if (this.f32880a.containsKey(v7)) {
                return v7;
            }
        }
        return str;
    }

    private static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p8 = p(str);
        return "1".equals(p8) || Boolean.parseBoolean(p8);
    }

    public Integer b(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p8));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return new JSONArray(p8);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p8 + ", falling back to default");
            return null;
        }
    }

    int[] e() {
        JSONArray c8 = c("gcm.n.light_settings");
        if (c8 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c8.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(c8.optString(0));
            iArr[1] = c8.optInt(1);
            iArr[2] = c8.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e8) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c8 + ". " + e8.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c8 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p8 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p8)) {
            p8 = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        return Uri.parse(p8);
    }

    public Object[] g(String str) {
        JSONArray c8 = c(str + "_loc_args");
        if (c8 == null) {
            return null;
        }
        int length = c8.length();
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = c8.optString(i8);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h8 = h(str2);
        if (TextUtils.isEmpty(h8)) {
            return null;
        }
        int identifier = resources.getIdentifier(h8, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g8 = g(str2);
        if (g8 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g8);
        } catch (MissingFormatArgumentException e8) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g8) + " Default value will be used.", e8);
            return null;
        }
    }

    public Long j(String str) {
        String p8 = p(str);
        if (TextUtils.isEmpty(p8)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p8));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into a long");
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    Integer l() {
        Integer b8 = b("gcm.n.notification_count");
        if (b8 == null) {
            return null;
        }
        if (b8.intValue() >= 0) {
            return b8;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b8 + ". Skipping setting notificationCount.");
        return null;
    }

    Integer m() {
        Integer b8 = b("gcm.n.notification_priority");
        if (b8 == null) {
            return null;
        }
        if (b8.intValue() >= -2 && b8.intValue() <= 2) {
            return b8;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b8 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p8 = p(str2);
        return !TextUtils.isEmpty(p8) ? p8 : i(resources, str, str2);
    }

    public String o() {
        String p8 = p("gcm.n.sound2");
        return TextUtils.isEmpty(p8) ? p("gcm.n.sound") : p8;
    }

    public String p(String str) {
        return this.f32880a.getString(w(str));
    }

    public long[] q() {
        JSONArray c8 = c("gcm.n.vibrate_timings");
        if (c8 == null) {
            return null;
        }
        try {
            if (c8.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = c8.length();
            long[] jArr = new long[length];
            for (int i8 = 0; i8 < length; i8++) {
                jArr[i8] = c8.optLong(i8);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c8 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    Integer r() {
        Integer b8 = b("gcm.n.visibility");
        if (b8 == null) {
            return null;
        }
        if (b8.intValue() >= -1 && b8.intValue() <= 1) {
            return b8;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b8 + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f32880a);
        for (String str : this.f32880a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f32880a);
        for (String str : this.f32880a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
