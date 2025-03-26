package com.android.billingclient.api;

import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055c {

    /* renamed from: a, reason: collision with root package name */
    private final String f12414a;

    C1055c(String str) {
        this.f12414a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f12414a;
    }
}
