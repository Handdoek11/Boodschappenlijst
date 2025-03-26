package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o0.AbstractC6278a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class Z {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f32905a;

    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f32906d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f32907a;

        /* renamed from: b, reason: collision with root package name */
        final String f32908b;

        /* renamed from: c, reason: collision with root package name */
        final long f32909c;

        private a(String str, String str2, long j8) {
            this.f32907a = str;
            this.f32908b = str2;
            this.f32909c = j8;
        }

        static String a(String str, String str2, long j8) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j8);
                return jSONObject.toString();
            } catch (JSONException e8) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e8);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e8) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e8);
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f32909c + f32906d || !str.equals(this.f32908b);
        }
    }

    public Z(Context context) {
        this.f32905a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(AbstractC6278a.h(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e8.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f32905a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f32905a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f32905a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a8 = a.a(str3, str4, System.currentTimeMillis());
        if (a8 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f32905a.edit();
        edit.putString(b(str, str2), a8);
        edit.commit();
    }
}
