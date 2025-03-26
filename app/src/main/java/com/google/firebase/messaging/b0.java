package com.google.firebase.messaging;

import Z2.AbstractC0777p;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class b0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f32938d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f32939a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32940b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32941c;

    private b0(String str, String str2) {
        this.f32939a = d(str2, str);
        this.f32940b = str;
        this.f32941c = str + "!" + str2;
    }

    static b0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new b0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f32938d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f32940b;
    }

    public String c() {
        return this.f32939a;
    }

    public String e() {
        return this.f32941c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f32939a.equals(b0Var.f32939a) && this.f32940b.equals(b0Var.f32940b);
    }

    public int hashCode() {
        return AbstractC0777p.b(this.f32940b, this.f32939a);
    }
}
