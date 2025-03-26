package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class N9 {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f17480d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f17481a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f17482b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final H9 f17483c;

    public N9(H9 h9) {
        this.f17483c = h9;
    }

    private final Uri g(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f17481a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzavb("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i8 = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i8) + "dc_ms=" + str + ";" + uri2.substring(i8));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzavb("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i9 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i9) + "ms=" + str + "&" + uri3.substring(i9));
        } catch (UnsupportedOperationException unused2) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return g(uri, this.f17483c.f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context) {
        return g(uri, this.f17483c.a(context));
    }

    public final H9 c() {
        return this.f17483c;
    }

    public final void d(MotionEvent motionEvent) {
        this.f17483c.h(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = f17480d;
            for (int i8 = 0; i8 < 3; i8++) {
                if (uri.getPath().endsWith(strArr[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f17482b;
            for (int i8 = 0; i8 < 3; i8++) {
                if (host.endsWith(strArr[i8])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
